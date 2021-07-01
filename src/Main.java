import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"Serkan","Özdemir", LocalDate.of(1999,2,9),"56428095470"));

    }
}
