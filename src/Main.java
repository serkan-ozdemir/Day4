import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"Serkan","Özdemir", LocalDate.of(1998,2,9),"12345678910"));

    }
}
