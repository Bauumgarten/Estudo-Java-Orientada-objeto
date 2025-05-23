public class ContaBancaria {

    // Atributos
    private String titular;
    private double saldo;

    //Getter e Setter - Métodos padrões para acessar os atributos

    //Método para obter o titular
    public String getTitular(){
        return titular;
    }

    //Método para modificar o titular
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor com atributos
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Construtor sem atributos
    public ContaBancaria() {
    }

    //Construtor que inicializa a conta bancária com saldo zero
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
}
