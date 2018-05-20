
package urlandhttp;

/**
 *
 * @author Kevin's Account
 */
public class URLandHTTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting up the connection, ready to print out the html page?");
        URLConnectionReader cr = new URLConnectionReader("http://www.google.com");
        System.out.println("Ended.");
    }

}
