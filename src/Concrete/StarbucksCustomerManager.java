package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        try {
            if (_customerCheckService.checkIfRealPerson(customer)){
                super.Save(customer);
            }else
                System.out.println("Doğru değil");
        }
        catch (Exception e){
            System.out.println("Not a valid Person");
        }
    }



}
