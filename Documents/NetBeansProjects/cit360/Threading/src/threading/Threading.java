
package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Kevin's Account
 */
public class Threading {

    public static void main(String[] args) {
        AtomicTicketGiver atg = new AtomicTicketGiver();
        
        for (int i = 0; i < 20; i++) {
            String runnableName = "Flash";
            String threadName = "Superman";
            AnnoyingCustomerThread superman = new AnnoyingCustomerThread(threadName);
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.submit(() -> {
                AnnoyingCustomerRunnable flash = new AnnoyingCustomerRunnable(runnableName);
                flash.start(atg.getTicket());
            });
            superman.start(atg.getTicket());
            
            try {
                executorService.shutdown();
                executorService.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                
            } finally {
              executorService.shutdownNow();
              System.out.println(runnableName + " left the store.");
            }
        }
    }
    
}
