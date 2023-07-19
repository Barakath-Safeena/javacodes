import java.util.Scanner;
public class atm {
    public static void main(String[]args){
        int avlbalance=5000;
        int creditamt=0;
        int debitamt=0;
        int pin=1234;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the password");
        int password=sc.nextInt();
        if(pin==password){
            System.out.println("welcome th the atm");
            System.out.println("press 1 to check the balance");
            System.out.println("press 2 to credit amount");
            System.out.println("press 3 to debit amount");
            System.out.println("press 4 to get the receipt");
            System.out.println("press 5 to exit");

            int num =sc.nextInt();
            
            switch(num)
            
            {
                case 1:
                System.out.println("your available balance is:"+avlbalance);
                break;
                case 2:
                System.out.println("how much amount you wish to add in your account");
                creditamt=sc.nextInt();
                avlbalance=creditamt+avlbalance;
                System.out.println("amount added successfully"+avlbalance);
                break;
                case 3:
                System.out.println("how much you wish to take ");
                debitamt=sc.nextInt();
                if(debitamt <= avlbalance){
                    System.out.println("take your amount");
                    avlbalance=debitamt-avlbalance;
                    System.out.println("amount taken successfully"+avlbalance);
                    
                }
                else{
                    System.out.println("insufficient balance");
                }
                break;
                case 4:
                System.out.println("your available balance is:"+avlbalance);
                System.out.println("amount you credited"+creditamt);
                System.out.println("amount you debited"+debitamt);
                System.out.println("press 5 to exit");

                break;

                default:
                System.out.println("thanks for visiting");


            }
        
            
            

        }
        else{
            System.out.println("OOPS! YOU HAVE ENTERED A WRONG PIN");
        }
    }
}
