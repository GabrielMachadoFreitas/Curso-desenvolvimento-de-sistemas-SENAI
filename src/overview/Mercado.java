package overview;

import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Integer consulta;
        Scanner inputText = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        Produto pro = new Produto();
        System.out.println("O que você deseja fazer.");
        System.out.println("[1] Cadastrar Produto");
        System.out.println("[2] Consultar Produto");
        consulta = inputNumber.nextInt();

        switch (consulta) {
            case 1:
                pro.cadastrarProduto();
                break;
            case 2:
                pro.consultarProduto();
                break;
            default:
                System.out.println("Digite um valor válido");
                break;
        }
    }
}
