/* I am building this program to auto-mate the process of sending reminder letters to customers when their invoices are still outstanding and has become overdue.*/

public class reminder {
    
    String name;
    int invoice;
    double balance;
    String date;
    
    public reminder (String clientName, int invoiceNumber, double OutstandingBalance, String dueDate) {
        
        name = clientName;
        invoice = invoiceNumber;
        balance = OutstandingBalance;
        date = dueDate;
        
    }
    
    
    public void sendReminder() {
        
        // This function below is to send out email reminders to customer when they have outstanding invoices due.
        
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
    
    public static void main(String[] args) {
        
        //Object = client's Company name. i.e ABC, KidsCorner, Normans, etc.
        
        reminder ABC = new reminder ("Jennifer", 10685, -10.00, "27/04/2020");
        reminder KidsCorner = new reminder ("Kim", 10822, -500, "08/06/2021");
        reminder Normans = new reminder ("Adam", 10173, 0, "20/07/2020");
        reminder GreensWinery = new reminder ("Jack", 10179, 0, "06/06.2021");
        reminder WoodsvilleHospital = new reminder ("William", 10062, 1500.50, "11/05/2021");
        
        ABC.sendReminder();
        KidsCorner.sendReminder();
        Normans.sendReminder();
        GreensWinery.sendReminder();
        
        //Just testing out how to print out each of specific object's variable.
        
        System.out.println(ABC.name);
        System.out.println(Normans.invoice);
        System.out.println(ABC.name + "'s invoice no is:" + ABC.invoice);

        
    }
    
}