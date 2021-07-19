
import java.util.ArrayList;

class application {

  public static void main(String[] args) { 

  // Send out reminders here.
    
    reminder ABC = new reminder("Jennifer", 10685, -10.00, "27/04/2020");
    reminder KidsCorner = new reminder ("Kim", 10822, -500.00, "08/06/2021");
    reminder Normans = new reminder ("Adam", 10173, 0.00, "20/07/2020");
    reminder GreensWinery = new reminder ("Jack", 10179, 0.00, "06/06/2021");
    reminder WoodsvilleHospital = new reminder("William", 10062, 1500.50, "11/05/2021");
    
    ArrayList<reminder> companies = new ArrayList<reminder>();
    companies.add(ABC);
    companies.add(KidsCorner);
    companies.add(Normans);
    companies.add(GreensWinery);
    companies.add(WoodsvilleHospital);
     
    for (reminder company: companies) {
      company.sendReminder();
          }
  
  // Check whether or not customer needs to pay GST
    GST ABCGST = new GST ("egg", 12, 3.50);
    GST KidsCornerGST = new GST ("apple", 30, 0.50);
    GST NormansGST = new GST ("orange", 24, 0.80);
    GST GreensWineryGST = new GST ("cabbage", 2, 1.20);
    
    ABCGST.GST("20 George Street, 2000 Sydney, NSW, Australia");
    KidsCornerGST.GST ("51/35 Jalan Muhammad bin Ahmad, Taman Sri Jaya, 42551 Kuala Lumpur, Malaysia");
    NormansGST.GST ("99 Orchard Road, 57469 Singapore");
    GreensWineryGST.GST ("20 Green Hills, 6124 Greens, NSW, AUS");
    
  // How much GST does customer has to pay?
    
    System.out.println(ABC.getName() + " ordered " + ABCGST.getUnit() + " " + ABCGST.getProduct() + "(s) for " + companies.get(0) + ". So, the tax amount she needs to pay is $" + ABCGST.getTax() + ".");
   

    }
  
}