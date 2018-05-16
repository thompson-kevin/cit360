
package threading;

/**
 *
 * @author Kevin's Account
 */
public class AnnoyingCustomerRunnable implements Runnable {
    private Thread thread;
    private final String customerName;
    private int ticketNumber;

    public AnnoyingCustomerRunnable(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void run() {
        System.out.println(customerName + " grabs ticket " + ticketNumber);
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
