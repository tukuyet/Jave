import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public void input() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Customer identifier: ");
            customerCode = sc.nextLine();
            System.out.print("Customer name: ");
            customerName = sc.nextLine();
            System.out.print(" Account identifier: ");
            accNumber = sc.nextInt();
            System.out.print("Account balance: ");
            amount = sc.nextLong();
        }while (accNumber<100000 || accNumber > 101000|| customerCode.length() < 5 );
    }
    public void depositAndWithdraw(long money, int type) {
        System.out.println("Method to make deposit or withdrawal from bank account");
        System.out.println("0. then this is bank deposit to add the amount of money to bank account");
        System.out.println("1. hen this is bank withdrawal to subtract the amount of money from the  account balance");
        switch (type) {
            case 0:
                if(money>0) {
                    amount+=money;
                    System.out.println("Successfully adding money: "+amount);
                }else {
                    System.out.println("ERR");
                }
                break;
            case 1:
                if(money>0 && money<amount) {
                    amount-=money;
                    System.out.println("Withdrawal successful: "+amount);
                }else {
                    System.out.println("ERR");
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "Account: \nCode: "+ customerCode+"\nName: "+customerName+"\nAccount number: "+accNumber+"\nAmount: "+amount;
    }

}


class Test {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.input();
        a1.depositAndWithdraw(100,0);
    }
}