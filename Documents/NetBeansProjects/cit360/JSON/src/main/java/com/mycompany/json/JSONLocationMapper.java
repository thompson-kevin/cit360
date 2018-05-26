
package com.mycompany.json;

import org.json.simple.JSONObject;

/**
 *
 * @author Kevin's Account
 */
public class JSONLocationMapper {
    public static Location mapJson(JSONObject obj) {
        Location location = new Location();
        location.address = obj.get("address").toString();
        location.city = obj.get("city").toString();
        location.state = obj.get("state").toString();
        location.zipCode = obj.get("zipCode").toString();
        return location;
    }
}
