
package threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin's Account
 */
public class AnnoyingCustomerThread extends Thread {
    private Thread thread;
    private final String customerName;
    private int ticketNumber;

    public AnnoyingCustomerThread(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void run() {
        System.out.println(customerName + " grabs ticket " + ticketNumber);
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            
        }
        System.out.println(customerName + " left the store.");
    }
    
    public void start(int ticketNumber) {
        this.ticketNumber = ticketNumber;
        System.out.println(this.customerName + " has entered the store.");
        if (thread == null) {
            thread = new Thread(this, customerName);
            thread.start();
        }
    }
}
