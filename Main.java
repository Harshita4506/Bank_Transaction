import java.lang.*;
import java.util.*;
class transactions{
    float withdraw(int amt,float t_amt){
        if(amt > 0 && amt % 100 == 0)
        {
            if(amt < t_amt)
            {
                t_amt -= amt;
                System.out.println("Withdraw Amount: " + amt + "\n" + "Total amount: " + t_amt + "\n");
                System.out.println("Transaction Completed Successfully");
            }

        }
        else{
        System.out.println("Insufficient Fund!!");
        }
        return t_amt;
    }
    float payment(float amt,float t_amt)
    {
        if(amt > 0 && amt < t_amt)
        {
            t_amt -= amt;
            System.out.println("Amount: " + amt + "\n" + "Total amount: " + t_amt + "\n");
            System.out.println("Payment Processed Successfully");
        }
        return t_amt;
    }
    float deposit(int amt,float t_amt)
    {
        if(amt > 0 && amt % 100 == 0)
        {
            t_amt += amt;
            System.out.println("Deposited Amount: " + amt + "\n" + "Total Amount: " + t_amt + "\n" + "Deposited Successfully");
        }
        return t_amt;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        transactions t = new transactions();
        int a,flag = 0,k = 0,l;
        String str;
        float t_amt;
        System.out.println("Enter Pin: ");
        a = sc.nextInt();
        while(flag < 2)
        if(a >= 1111 && a <= 9999) {
            flag = 0;
            break;
        }
    else{
        flag++;
    System.out.println("Enter Pin: ");
    a = sc.nextInt();
    }
    if(flag > 0)
    {
        System.out.println("Password entered 3 times \nTransactions is blocked for 24hours");
    }
    if(flag == 0){
        System.out.println("Enter Total Amount: ");
        t_amt = sc.nextFloat();
        while(k == 0){
            System.out.println("Enter which type of transaction: ");
            str = sc.next();
            switch(str){
            case "Withdraw":
                int amt;
                System.out.println("Enter Withdraw Amount: ");
                amt = sc.nextInt();
                t_amt = t.withdraw(amt,t_amt);
                System.out.println("If you want to continue another transaction press 1 or to cancel press 0: ");
                l = sc.nextInt();
                if(l == 1){
                    k = 0;
                }
                else{
                    k++;
                }
                break;
             case "Payment":
                 Float A;
                 System.out.println("Enter Payment Amount: ");
                 A = sc.nextFloat();
                 t_amt = t.payment(A,t_amt);
                 System.out.println("If you want to continue another transaction press 1 or to cancel press 0: ");
                 l = sc.nextInt();
                 if(l == 1){
                 k = 0;
                 }
                 else{
                 k++;
                 } 
                 break;
                case "Deposit":
                     int am;
                     System.out.println("Enter Deposit Amount: ");
                     am = sc.nextInt();
                     t_amt = t.deposit(am,t_amt);
                     System.out.println("If you want to continue another transaction press 1 or to cancel press 0: ");
                     l = sc.nextInt();
                     if(l == 1)
                     {
                     k = 0;
                     }
                     else{
                     k++;
                     }
                     break;
                }
            }
        }
    }
}
