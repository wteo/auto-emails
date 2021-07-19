
import java.util.ArrayList;

public class Application {

  public static void main(String[] args) {

    ArrayList<Customer> companies = new ArrayList<>();
    companies.add(new Customer("Jennifer", 10685, -10.00, "27/04/2020"));
    companies.add(new Customer("Kim", 10822, -500.00, "08/06/2021"));
    companies.add(new Customer("Adam", 10173, 0.00, "20/07/2020"));
    companies.add(new Customer("Jack", 10179, 0.00, "06/06/2021"));
    companies.add(new Customer("William", 10062, 1500.50, "11/05/2021"));

    for (Customer company : companies) {
      company.reminder();
    }

  }

}