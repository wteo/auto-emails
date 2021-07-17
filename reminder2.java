/* I am building this program to auto-mate the process of sending reminder letters to customers when their invoices are still outstanding and has become overdue.*/

import java.util.ArrayList;

public class reminder {

    public reminder () {
 
    }
    
    
    public void sendReminder() {
        
        // This function below is to send out email reminders to customer when they have outstanding invoices due.

        ArrayList<String> companyNames = new ArrayList<String>();
        companyNames.add("ABC");
        companyNames.add("Kids Corner");
        companyNames.add("Normans");
        companyNames.add("Greens Winery");
        companyNames.add("Woodsville Hospital");
        
        String names[] = {"Jennifer", "Adam", "Sam", "Thomas", "Jim"};
        int invoices[] = {10159, 10126, 10132, 10155, 10166};
        double balances[] = {-10.00, -50.00, 0.00, 1500.60, 144.40};
        String dates[] = {"10/05/2021", "11/11/2020", "12/12/2020", "20/06/2021", "08/07/2021"};
        

        String greeting = "Hi " + names + ",";
        String signed = "Regards,";
        String signedName = "Accounts Receivable";
        
        for (String companyName: companyNames) {

            if (balances < 0) {
            
            System.out.println(greeting);
            System.out.println("Kindly note that you still have a credit balance of" + balances + ". We recommend that you use this credit to offset against your future invoices.");
            System.out.println(signed);
            System.out.println(signedName);

        } else if (balances == 0) {
            
            System.out.println(greeting);
            System.out.println("Thank you for paying!");
            System.out.println(signed);
            System.out.println(signedName);
            
        } else {
            
            System.out.println(greeting);
            System.out.println("This is a friendly reminder that you still have invoice " + invoices + " outstanding, which was due on " + dates + ". Hence, a total of " + balances + " is now outstanding and requires your immediate attention. Should you believe this has been paid, kindly provide us a copy of your remittance.");
            System.out.println(signed);
            System.out.println(signedName);
            
        }
        
        }   
    }
    
    public static void main(String[] args) {
        
        //Object = client's Company name. i.e ABC, KidsCorner, Normans, etc.
        
        reminder autoReminder = new reminder();
        autoReminder.sendReminder();
        

        
    }
    
}