public class SavingsAccount {
    private String accountHolderName;
    private String accountNumber;
    private String accountOpeningDate;
    private String status;
    private double availableBalance;
    private double totalBalance;
    private String internetOrMobileBankingEnabled;
    private double interestRate;
    private String ModeOfOperation;

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountOpeningDate(String accountOpeningDate){
        this.accountOpeningDate = accountOpeningDate;
    }
    public String getAccountOpeningDate(){
        return accountOpeningDate;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    public void setAvailableBalance(double availableBalance){
        this.availableBalance = availableBalance;
    }
    public double getAvailableBalance(){
        return availableBalance;
    }
    public void setTotalBalance(double totalBalance){
        this.totalBalance = totalBalance;
    }
    public double getTotalBalance(){
        return totalBalance;
    }
    public void setInternetOrMobileBankingEnabled(String internetOrMobileBankingEnabled){
        this.internetOrMobileBankingEnabled = internetOrMobileBankingEnabled;
    }
    public String getInternetOrMobileBankingEnabled(){
        return internetOrMobileBankingEnabled;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setModeOfOperation(String modeOfOperation){
        this.ModeOfOperation = ModeOfOperation;
    }
    public String getModeOfOperation(){
        return ModeOfOperation;
    }
    public double credit(double money){
        totalBalance = totalBalance + money;
        System.out.println("Balance after $"+money+" credited to the account:"+totalBalance);
        return totalBalance;
    }
    public double debit(double money){
        totalBalance = totalBalance - money;
        System.out.println("Balance after $"+money+" debited from the account:"+totalBalance);
        return totalBalance;
    }
    public double retrieveBalance(){
        System.out.println("Retrieve Balance: $"+totalBalance);
        return totalBalance;
    }
}
