public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String ID, String Name) {
        id = ID;
        name = Name;
    }
    public Account(String ID, String Name, int Balance) {
        id = ID;
        name = Name;
        balance = Balance;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
    public int credit(int amount) {
        balance+=amount;
        return balance;
    }
    public int debit(int amount) {
        if(amount<=balance) {
            balance-=amount;
            return balance;
        }else {
            System.out.println("The amount is not enough to withdraw");
        }
        return balance;
    }
    public int tranferTo(Account another, int amount) {
        if(amount<=balance) {
            another.balance+=amount;
            this.balance-=amount;
        }else {
            System.out.println("The amount is not enough to trasfer");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account" + " id=" + id + " " + " name='" + name + " " + " balance=" + balance  ;
    }

    public static void main(String[] args) {
        Account P1 = new Account("1","Nguyen Anh Tuan",1000);
        System.out.println(P1.toString());
        Account P2 = new Account("2", "Ngoc Cuong", 2000);
        P2.credit(2000);
        System.out.println(P2.toString());
        P2.debit(500);
        System.out.println(P2.toString());
        P2.tranferTo(P1, 3500);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }
}