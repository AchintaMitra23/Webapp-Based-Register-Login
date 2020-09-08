/**
 * 
 */
package RegisterLoginClasses;

/**
 * @author achinta
 *
 */
public interface CustomerDAO {
	public int insertData(Customer custom);
	public Customer getCustomer(String user, String pass);
}
