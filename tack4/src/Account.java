public class Account {
    private int accountID;
    private String holderName;
    private String accountType;
    {
        accountID=100;
        holderName="JonhAnderson";
        accountType="Savings";
    }
    public void dispalyAccountDetails() {
        System.out.println("Account Details");
        System.out.println("===============");
        System.out.println("Account ID: "+accountID+"\nAccount Type:"+accountType);
    }
}