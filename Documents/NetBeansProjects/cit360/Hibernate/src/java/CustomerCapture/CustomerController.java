/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerCapture;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "customerController")
@SessionScope
public class CustomerController {
    int startId;
    int endId;
    DataModel customers;
    CustomerHelper helper;
    private int recordCount = 1000;
    private int pageSize = 500;
    
    private Customer current;
    private int selectedItemIndex;

    public CustomerController() {
        helper = new CustomerHelper();
        startId = 1;
        endId = 500;
    }
    
    public CustomerController(int startId, int endId) {
        helper = new CustomerHelper();
        this.startId = startId;
        this.endId = endId;
    }
    
    public Customer getSelected() {
        if (current == null) {
            current = new Customer();
            selectedItemIndex = -1;
        }
        return current;
    }
    
    public DataModel getCustomers() {
        if (customers == null) {
            customers = new ListDataModel(helper.getCustomers());
        }
        return customers;
    }
    
    public DataModel getCustomerRange() {
        if (customers == null) {
            customers = new ListDataModel(helper.getCustomerRange(startId, endId));
        }
        return customers;
    }
    
    void recreateModel() {
        customers = null;
    }
    
    public boolean isHasNextPage() {
        if (endId + pageSize <= recordCount) {
            return true;
        }
        return false;
    }
    
    public boolean isHasPreviousPage() {
        if (startId - pageSize > 0) {
            return true;
        }
        return false;
    }
    
    public String next() {
        startId = endId+1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }
    
    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }
    
    public int getPageSize() {
        return pageSize;
    }

    public String prepareView(){
        current = (Customer) getCustomers().getRowData();
        return "browse";
    }
    public String prepareList(){
        recreateModel();
        return "index";
    }
}
