package entities;

public class Bank {

    private int numConta;
    private String nomeT;
    private double saldo;
    private double deposito;
    private double saque;

    public Bank(int numConta, String nomeT, double saldo,
                double deposito, double saque) {
        this.numConta = numConta;
        this.nomeT = nomeT;
        this.saldo = saldo;
        this.deposito = deposito;
        this.saque = saque;
    }

    public Bank(int numConta, String nomeT, double saldo) {
        this.numConta = numConta;
        this.nomeT = nomeT;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNomeT(String nomeT) {
        this.nomeT = nomeT;
    }

    public String getNomeT() {
        return nomeT;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return deposito;
    }

    public double deposito(double deposito) {
        return (saldo += deposito);
    }

    public double saque(double saque) {
        saldo = ((saldo - saque) - 5.00);
        return saldo;
    }

    public String toString() {
        return "Account " + String.format("%d", numConta)
        + ", Holder: " + String.format("%s", nomeT)
        + ", Balance: $ " + String.format("%.2f", saldo);
    }

}
