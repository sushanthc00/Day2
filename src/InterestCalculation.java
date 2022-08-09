public class InterestCalculation {

    public static void savingsAccount(){
        float amritaBalance = 100000f;
        //float withdrawAmount = 45000f;
        float roiSaving = 0.03f;
        float roiPerMonthSavings = (roiSaving/12);
        float interest =0;
        float newBalanceSavings;

        //First 3 months

        interest = interest + (amritaBalance*3*roiPerMonthSavings);

        newBalanceSavings = amritaBalance + interest;

        System.out.println("Interest for the first quarter = " + interest);
        System.out.println("Amount in the account after first quarter = " + newBalanceSavings);
        System.out.println();
    }

    public static void currentAccount(){
        float initialBalance =50000;
        float deposit = 10000;
        float newBalance = initialBalance+ deposit;
        float overdraft = 0.2f;
        float withdrawAmount = 70000;
        float maxWithdraw = 0;
        float remainingBalance = 0;

            maxWithdraw = newBalance + newBalance*overdraft;
            remainingBalance = maxWithdraw - withdrawAmount;

            if (maxWithdraw > withdrawAmount){
                System.out.println("Yes, the requested funds can be withdrawn");
                System.out.println("Your new balance after withdrawal is: " + remainingBalance);
            }
            else{
                System.out.println("Insufficient Funds");
            }

    }

    public static void main(String[] args){
        savingsAccount();
        currentAccount();

    }
}

