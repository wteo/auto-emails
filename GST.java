
/* This programme is to determine whether or not a customer is subject to goods and services tax (GST).
And if so, how much tax does customer needs to pay.
If customer has an Australian address, we need to include GST.
If customer has an overseas address, exclude GST*/

public class GST {
  
  private String product;
  private int unit;
  private double cost; //cost = price of goods before GST
  final public double GST = 10;

  public GST (String product, int numberOfProducts, double cost) {
    
    this.product = product;
    unit = numberOfProducts;
    this.cost = cost;
    
  }
  
  
  public String getProduct() {
    return this.product;
  }
  
  
  public int getUnit() {
    return unit;
  }
  
  
  public double getCost() {
    return this.cost;
  }
  
  
  public void GST (String address) {
    
    double price = (unit*cost) + (unit*cost)/GST;
      
    if (address.contains("Australia") || address.contains("AUS") || address.contains("AU")) {
      
      System.out.println("GST is applicable.");
      System.out.println("The price of 1 " + product + " is $" + cost + ".");
      System.out.println("Customer ordered " + unit + " " + product + "(s).");
      System.out.println("So, the total amount customer needs to pay is $" + price + ".");
      
         } else {
      
      System.out.println("GST is not applicable.");
      System.out.println("The price of " + product + " is $" + cost + ".");
      System.out.println("Customer ordered " + unit + " " + product + "(s).");
      System.out.println("So, the total amount customer needs to pay is $" + cost*unit + ".");
      
    }
    
  }
  
  
  public double getTax () {
    double tax = unit*cost/GST;
    return tax;
  }
  
 
 
}