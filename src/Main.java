import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        int opcao;

        do {
            System.out.println("Caixa Eletrônico");
            System.out.println("1. Consultar Saldo.");
            System.out.println("2. Realizar Saque.");
            System.out.println("3. Realizar Depósito.");
            System.out.println("4. Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Seu saldo é de R$ " + conta.consultarSaldo());
                    break;

                case 2:
                    System.out.print("Insira o valor do saque: ");
                    double valor = scanner.nextDouble();
                    conta.realizarSaque(valor);
                    break;

                case 3:
                    System.out.print("Insira o valor do depósito: ");
                    double valor_deposito = scanner.nextDouble();
                    conta.realizarDepósito(valor_deposito);
                    break;

                case 4:
                    System.out.println("Obrigado por usar nossos servicos, volte sempre!");
                    break;

                default:
                    System.out.println("Opcao inválida, tente novamente...");

            }
        } while (opcao != 4);



        scanner.close();
    }
}

class Conta{
    private int id;
    private String nome;
    private double saldo;

    public Conta(){
        this.saldo = 0.0;
    }

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

    public double consultarSaldo(){
        return saldo;
    }

}