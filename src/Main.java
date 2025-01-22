import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();



        scanner.close();
    }
}

class Conta{
    private int id;
    private String nome;
    private double saldo;

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean realizarSaque(double valor){
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        return true;
    }

    public boolean realizarDepósito(double valor){
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser maior que zero.");
            return false;
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        return true;
    }

    public double consultarSaldo(double saldo){
        return saldo;
    }

}