
package com.mycompany.json;

import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Kevin's Account
 */
public class JSONHelper {
    public static JSONObject build(Location location) {
        JSONObject obj = new JSONObject();
        obj.put("address", location.address);
        obj.put("city", location.city);
        obj.put("state", location.state);
        obj.put("zipCode", location.zipCode);
        return obj;
    }
    
    public static Location parse(JSONObject obj) throws ParseException {
        try {
            Location location = JSONLocationMapper.mapJson(obj);
            return location;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Location();
    }
}
