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

    public void realizarSaque(double saldo){

    }

    public void realizarDepósito(double saldo){

    }

    public double consultarSaldo(double saldo){
        return saldo;
    }

}