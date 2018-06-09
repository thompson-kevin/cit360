
package CustomerCapture;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Kevin's Account
 */
public class CustomerHelper {
    Session session = null;
    
    public CustomerHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getCustomerRange(int startId, int endId) {
        List<Customer> customers = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Customer as customer where customer.customerId between " + startId + " and " + endId);
            customers = (List<Customer>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }
    
    public List getCustomers() {
        List<Customer> customers = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Customer");
            customers = (List<Customer>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }
    
    
    public Customer getCustomerById(int customerId) {
        List<Customer> customer = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Customer as customer where customer.customerId = " + customerId);
        customer = (List<Customer>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer.get(0);
    }
}
