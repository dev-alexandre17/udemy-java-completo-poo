package entities;

public class Bank {

    private int numConta;
    private String nomeT;
    private double deposito;

    public Bank(){}

    public Bank(int numConta, String nomeT) {
        this.numConta = numConta;
        this.nomeT = nomeT;
    }

    public Bank(double deposito) {
        this.deposito = deposito;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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

    /*public void verificarDeposito(char dinheiro) {
        if (dinheiro == 'y') {
            System.out.print("Enter initial deposit value: ");
            double money =
        } else {

        }
    }*/

    public String toString() {
        return "Account " + this.numConta
        + " Holder: " + nomeT
        + ", Balance: $ " + String.format("%.2f", deposito);
    }

}
