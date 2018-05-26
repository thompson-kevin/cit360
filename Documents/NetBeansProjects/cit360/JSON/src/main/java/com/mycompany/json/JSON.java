
package com.mycompany.json;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Kevin's Account
 */
public class JSON {
    public static void main(String[] args) throws ParseException, MalformedURLException {
        String urlString = "https://jsonplaceholder.typicode.com/posts/1";
        
        // Get a JSON object from a Java Object
        Location location = new Location("123 JSON Dr", "12345", "JSON City", "Happiness");
        JSONObject jsonObj = JSONHelper.build(location);
        System.out.println(jsonObj.toJSONString());
        
        // Get Java object from a JSON object
        try {
            Location locationFromJSON = JSONHelper.parse(jsonObj);
            System.out.println(locationFromJSON);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            // Send JSON
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("content-type", "application/json; charset=utf-8");
            OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
            wr.write(jsonObj.toString());
            
            // Receive JSON
            InputStream is = new URL(urlString).openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();
            int counter;
            while ((counter = reader.read()) != -1) {
                sb.append((char) counter);
            }
            String jsonString = sb.toString();
            is.close();
            System.out.println(jsonString);
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
