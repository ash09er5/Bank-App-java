import java.util.Scanner;
public class bank3 {
    public static void menu2(){
        System.out.println("Welcome enter choice"
        +"\n1:Balance Inquriry"
        +"\n2:Make deposit"
        +"\n3:Make widthdrawl"
        +"\n4:Exit ");
    }
    public static double inquriy1(int option, double balance) {
        
        System.out.println("Your balance is"+ balance);
        return balance;
    }
    
    public static double deposit(double balance){
        Scanner depScan = new Scanner (System.in);
        double deposit;
        double newBal;
        System.out.println("Enter Amount To deposit");
        deposit = depScan.nextDouble();
        balance = deposit+balance;
        System.out.println("Your New Balance Is"+ balance);
        return balance;
        
    }
    public static double widthdrawl(double balance){
        Scanner widScan = new Scanner(System.in);
        double widthdrawl;
        System.out.print("How Much are You Widthdrawing");
        widthdrawl=widScan.nextDouble();
        balance= balance-widthdrawl;
        System.out.println("Your New Balance is " +balance);
        return balance;
    }



    public static void main(String[] args) {
        int option;
        double balance = 1000;
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome To Our Bank ");
        


        do{
              
              
              System.out.println("Enter Choice");
              menu2();
              option = scan.nextInt();

              switch (option) {
                case 1:
                    balance =inquriy1(option, balance);
                    System.out.println("Would you like to make another transaction?");
                     
                    break;
                case 2:
                    balance=deposit(balance);
                    
                    System.out.println("Would you like to make another transaction?");
                    break;
                case 3:
                    balance =widthdrawl(balance);
                    System.out.println("Would you like to make another transaction?");
                    

                    break;

                case 4:
                    System.out.println("Thank you for banking with us today");
                    break;
            }
            
        }while(option != 4);
    }
}
