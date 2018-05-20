
package urlandhttp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Kevin's Account
 */
public class URLConnectionReader {

    public URLConnectionReader(String urlString) {
        try {
            URL url = new URL(urlString);
            URLConnection urlConnection = url.openConnection();
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()))) {
                String inputLine;
                while((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
            }
        } catch (Exception e) {
            System.out.println("There was a problem with the connection:");
            System.out.println(e);
        }
    }
    
}
