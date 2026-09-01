package overview;

import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Integer consulta;
        Integer operacao;
        Scanner inputNumber = new Scanner(System.in);
        Produto pro = new Produto();
        Pedido ped = new Pedido();
        do {
            System.out.println("O que você deseja fazer.");
            System.out.println("[1] Cadastrar Produto");
            System.out.println("[2] Consultar Produto");
            System.out.println("[3] Cadastrar produto");
            System.out.println("[4] Consultar pedido");
            System.out.println("[0] Para sair do sistema");
            consulta = inputNumber.nextInt();

            switch (consulta) {
                case 1:
                    pro.cadastrarProduto();
                    break;
                case 2:
                    pro.consultarProduto();
                    break;
                case 3:
                    Integer receberCdProduto, recebeQtProduto;
                    System.out.println("Digite o código do produto e depois a quantidade");
                    receberCdProduto = inputNumber.nextInt();
                    recebeQtProduto = inputNumber.nextInt();
                    ped.cadastrarPedido(receberCdProduto, recebeQtProduto);
                    break;
                case 4:
                    System.out.println("Digite o código do pedido desejado para consulta");
                    operacao = inputNumber.nextInt();
                    ped.consultarPedido(operacao);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                default:
                    System.out.println("Digite um valor válido");
                    break;
            }
        }while (consulta != 0 );
    }
}