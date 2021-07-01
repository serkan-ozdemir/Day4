package Adaptors;

import Abstract.CustomerCheckService;
import Entities.Customer;
import mernis.VHVKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        VHVKPSPublicSoap client = new VHVKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()), customer.getFirstName().toUpperCase(new Locale("tr")), customer.getLastname().toUpperCase(new Locale("tr")), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            return false;
        }
    }
}
