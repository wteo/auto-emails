/* I am building this program to auto-mate the process of sending reminder letters to customers when their invoices are still outstanding and has become overdue.*/

public class Customer {

  public String name;
  public Integer invoice;
  public Double balance;
  public String date;

  public Customer(String customerName, Integer invoiceNumber, Double outstandingBalance,
      String dueDate) {

    name = customerName;
    invoice = invoiceNumber;
    balance = outstandingBalance;
    date = dueDate;

  }

  public void reminder() {

    System.out.println("Hi " + name + ",");
    if (balance < 0) {
      System.out.println("Kindly note that you still have a credit balance of " + balance
          + ". We recommend that you use this credit to offset against your future invoices.");
    } else if (balance == 0) {
      System.out.println("Thank you for paying!");
    } else {
      System.out.println("This is a friendly reminder that you still have invoice " + invoice
          + " outstanding, which was due on " + date + ". Hence, a total of " + balance
          + " is now outstanding and requires your immediate attention. Should you believe this has been paid, kindly provide us a copy of your remittance.");
    }
    System.out.println("Regards,");
    System.out.println();

  }
}