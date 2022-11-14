package college_programs;
import java.util.*;
class SavingAccount
{
    static float annualInterestRate;
    private float savingBalance;

    SavingAccount(float savingBalance) {
        this.savingBalance = savingBalance;
    }

    static float getAnnualInterestRate() {
        return annualInterestRate;
    }

    static void setAnnualInterestRate(float annualInterestRate1) {
        annualInterestRate = annualInterestRate1;
    }

    float getSavingBalance() {
        return savingBalance;
    }

    void setSavingBalance(float savingBalance) {
        this.savingBalance = savingBalance;
    }
    float calculateMonthlyInterest()
    {
        float MonthlyInterest = (savingBalance*((annualInterestRate/100)/12));
        savingBalance = savingBalance + MonthlyInterest;
        return MonthlyInterest;
    }
    void display(float annual_int_rate)
    {
        setAnnualInterestRate(annual_int_rate);
        System.out.println("Monthly interest  = "+calculateMonthlyInterest());
        System.out.println("New Balance  = "+getSavingBalance());
        System.out.println();

    }
}
public class Exp4_SavingAccount
{

    public static void main(String[] args) {
        SavingAccount server1 = new SavingAccount(2000);
        SavingAccount server2 = new SavingAccount(3000);

        System.out.println("For Annual interest 4....");
        System.out.println("For server 1...");
        server1.display(4);
        System.out.println("For server 2...");
        server2.display(4);

        System.out.println("For Annual interest 5....");
        System.out.println("For server 1...");
        server1.display(5);
        System.out.println("For server 2...");
        server2.display(5);

    }
}