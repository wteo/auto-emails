
import java.util.ArrayList;

public class customer {
  
  public static void main(String[] args) { 

  //Object = respective companies (a.k.a customers)
    
    reminder ABC = new reminder ("Jennifer", 10685, -10.00, "27/04/2020");
    reminder KidsCorner = new reminder ("Kim", 10822, -500, "08/06/2021");
    reminder Normans = new reminder ("Adam", 10173, 0, "20/07/2020");
    reminder GreensWinery = new reminder ("Jack", 10179, 0, "06/06/2021");
    reminder WoodsvilleHospital = new reminder ("William", 10062, 1500.50, "11/05/2021");
    
    ArrayList<reminder> companies = new ArrayList<reminder>();
    companies.add(ABC);
    companies.add(KidsCorner);
    companies.add(Normans);
    companies.add(GreensWinery);
    companies.add(WoodsvilleHospital);
     
    for (reminder company: companies) {
      System.out.println(company);
          }
    
    }
  
  }