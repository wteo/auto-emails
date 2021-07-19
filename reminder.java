/* I am building this program to auto-mate the process of sending reminder letters to customers when their invoices are still outstanding and has become overdue.*/

public class reminder {
  
  public String name;
  public int invoice;
  public double balance;
  public String date;
  
  public reminder (String customerName, int invoiceNumber, double OutstandingBalance, String dueDate) {
    
    name = customerName;
    invoice = invoiceNumber;
    balance = OutstandingBalance;
    date = dueDate;
    
  }
  
  public String toString() {
    
    String greeting = "Hi " + name + ",";
    String signed = "Regards,";
    
    if (balance < 0) {
      
      System.out.println(greeting);
      System.out.println("Kindly note that you still have a credit balance of" + balance + ". We recommend that you use this credit to offset against your future invoices.");
      System.out.println(signed);
      
    } else if (balance == 0) {
      
      System.out.println(greeting);
      System.out.println("Thank you for paying!");
      System.out.println(signed);
      
    } else {
      
      System.out.println(greeting);
      System.out.println("This is a friendly reminder that you still have invoice " + invoice + " outstanding, which was due on " + date + ". Hence, a total of " + balance + " is now outstanding and requires your immediate attention. Should you believe this has been paid, kindly provide us a copy of your remittance.");
      System.out.println(signed);
      
    }   
    
    return ("Accounts Receivable");
  }
 

  
}