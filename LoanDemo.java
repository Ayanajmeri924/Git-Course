abstract class Loan {
    double loanAmount;
    double interestRate;
    int noOfYears;

    // Constructor
    Loan(double loanAmount, double interestRate, int noOfYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.noOfYears = noOfYears;
    }

    // Abstract method
    abstract void calculateInterest();
}

// EducationLoan using Simple Interest
class EducationLoan extends Loan {

    EducationLoan(double amount, double rate, int years) {
        super(amount, rate, years);
    }
    

    void calculateInterest() {
        // double si = (loanAmount * interestRate * noOfYears) / 100;
        double si = (loanAmount * interestRate * noOfYears) / 100;

        System.out.println("Education Loan Simple Interest: " + si);
    }
}

// HomeLoan using Compound Interest
class HomeLoan extends Loan {

    HomeLoan(double amount, double rate, int years) {
        super(amount, rate, years);
    }

    void calculateInterest() {
        double ci = loanAmount *
                Math.pow((1 + interestRate / 100), noOfYears) - loanAmount;
        System.out.println("Home Loan Compound Interest: " + ci);
    }
}

public class LoanDemo {
    public static void main(String[] args) {

        // Loan edu = new EducationLoan(500000, 5, 4);
        Loan edu = new EducationLoan(500000, 5,4);
        Loan home = new HomeLoan(1000000, 7, 10);

        edu.calculateInterest();
        home.calculateInterest();
    }
}
