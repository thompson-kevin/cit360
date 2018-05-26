
package com.mycompany.json;

/**
 *
 * @author Kevin's Account
 */
public class Location {
    String address;
    String zipCode;
    String city;
    String state;

    public Location() {
       
    }
    
    public Location(String address, String zipCode, String city, String state) {
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
