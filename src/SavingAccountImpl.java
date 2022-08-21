public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingsAccount object = new SavingsAccount();
        object.setAccountNumber("411223365888");
        object.setAccountHolderName("John");
        object.setAccountOpeningDate("12/01/2021");
        object.setStatus("Active");
        object.setModeOfOperation("Joint Account");
        object.setTotalBalance(500000.55);
        object.setAvailableBalance(500000.55);
        object.setInterestRate(5.5);
        object.setInternetOrMobileBankingEnabled("yes");
        System.out.println("Account Holder Name: "+object.getAccountHolderName());
        System.out.println("Account Number: "+object.getAccountNumber());
        System.out.println("Date of Opening of Account: "+object.getAccountOpeningDate());
        System.out.println("Account Status: "+object.getStatus());
        System.out.println("Available balance: $"+object.getAvailableBalance());
        System.out.println("Total Balance: $"+object.getTotalBalance());
        System.out.println("Internet Or Mobile Banking Enabled: "+object.getInternetOrMobileBankingEnabled());
        System.out.println("Interest Rate: "+object.getInterestRate());
        System.out.println("Mode Of Operation: "+object.getModeOfOperation());
        object.credit(450.55);
        object.debit(500.56);
        object.retrieveBalance();
    }
}
