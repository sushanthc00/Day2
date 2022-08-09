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
    }

    public static void main(String[] args){
        savingsAccount();

    }
}

