import java.util.Scanner;

class BankAccount {
    
    private String accHolder;
    private int accNumber;
    private float balance;

    BankAccount(String accHolder , int accNumber , float balance) {
        this.accHolder = accHolder;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    void deposit(float amount){
        if(amount<=0){
            System.out.println("Enter valid amount\n");
        }
        else{
            balance += amount;
            System.out.println("\nAmount " + amount + " deposited successfully");
        }
    }

    void withdraw(float amount){
        if(amount<=0){
            System.out.println("Enter valid amount\n");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance\n");
        }
        else{
            balance -= amount;
            System.out.println("\nAmount " + amount + " withdrawn successfully.\n");
        }
    }

    void displayBalance(){
        System.out.println("\nAccount Holder name: " + accHolder);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Available Balance: " + balance);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder name:- ");
        String name = sc.nextLine();

        System.out.println("Enter account number:- ");
        int accNO = sc.nextInt();

        System.out.println("Enter initial balance:- ");
        float balance = sc.nextFloat();

        BankAccount b1 = new BankAccount(name , accNO , balance);

        b1.displayBalance();

        while(true){
            System.out.println("""
            \n
            1. Deposit amount
            2. Withdraw amount
            3. Exit
            """);

            System.out.println("Enter your choice:- ");
            int choice = sc.nextInt();

            if(choice==1){
                System.out.print("\nEnter amount to deposit:- ");
                float amount = sc.nextFloat();

                b1.deposit(amount);
            }
            else if(choice==2){
                System.out.print("\nEnter amount to withdraw:- ");
                float amount = sc.nextFloat();

                b1.withdraw(amount);
            }
            else if(choice==3){
                b1.displayBalance();
                break;
            }
            else{
                System.out.println("Invalid choice.\n");
            }


            b1.displayBalance();
        }

        sc.close();
    }
}