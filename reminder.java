//This programme is created to automate the process of sending reminder letters to customer.

public class reminder {
  
  private String name;
  private Integer invoice;
  private Double balance;
  private String date;
  
  
  public reminder (String customerName, Integer invoiceNumber, Double outstandingBalance, String dueDate) {
    
    name = customerName;
    invoice = invoiceNumber;
    balance = outstandingBalance;
    date = dueDate;
    
  }
  
  
  public String getName() {
    return name;
  }
  
  
  public Integer getInvoice() {
    return invoice;
  }
  
  
  public Double getBalance() {
    return balance;
  }
  
  
  public String getDate() {
    return date;
  }
  
  
  public void sendReminder() {
    
    String greeting = "Hi " + name + ",";
    String signed = "Regards,";
    String signedName = "Accounts Receivable";
    
    if (balance < 0) {
      
      System.out.println(greeting);
      System.out.println("Kindly note that you still have a credit balance of" + balance + ". We recommend that you use this credit to offset against your future invoices.");
      System.out.println(signed);
      System.out.println(signedName);
      
    } else if (balance == 0) {
      
      System.out.println(greeting);
      System.out.println("Thank you for paying!");
      System.out.println(signed);
      System.out.println(signedName);
      
    } else {
      
      System.out.println(greeting);
      System.out.println("This is a friendly reminder that you still have invoice " + invoice + " outstanding, which was due on " + date + ". Hence, a total of " + balance + " is now outstanding and requires your immediate attention. Should you believe this has been paid, kindly provide us a copy of your remittance.");
      System.out.println(signed);
      System.out.println(signedName);
      
    }   
    
  }
  
 
  
  }