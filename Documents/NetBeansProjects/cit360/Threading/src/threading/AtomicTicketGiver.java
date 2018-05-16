
package threading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Kevin's Account
 */
public class AtomicTicketGiver {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    
    private int getAndIncrement() {
        return atomicInteger.incrementAndGet();
    }
    
    public int getTicket() {
        return getAndIncrement();
    }
}
