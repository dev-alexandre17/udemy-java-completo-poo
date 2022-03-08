package entities;

public class Bank {

    private int accountNumber;
    private String titularName;
    private double balance;
    private double deposit;
    private double withdrawal;

    public Bank(int accountNumber, String titularName, double balance,
                double deposit, double withdrawal) {
        this.accountNumber = accountNumber;
        this.titularName = titularName;
        this.balance = balance;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }

    public Bank(int accountNumber, String titularName, double balance) {
        this.accountNumber = accountNumber;
        this.titularName = titularName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public String getTitularName() {
        return titularName;
    }

    public void setDeposit(double deposit) { this.deposit = deposit; }

    public double getDeposit() {
        return deposit;
    }

    public double deposit(double deposit) {
        return (balance += deposit);
    }

    public double saque(double withdrawal) {
        balance = ((balance - withdrawal) - 5.00);
        return balance;
    }

    public String toString() {
        return "Account " + String.format("%d", accountNumber)
        + ", Holder: " + String.format("%s", titularName)
        + ", Balance: $ " + String.format("%.2f", balance);
    }

}
