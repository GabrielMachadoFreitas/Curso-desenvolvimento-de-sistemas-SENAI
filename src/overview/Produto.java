package overview;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {

    ArrayList <Integer> cdProduto = new ArrayList<Integer>();
    ArrayList <String> nmProduto = new ArrayList<String>();
    ArrayList <Integer> qtProduto = new ArrayList<Integer>();
    ArrayList <Double> vlProduto = new ArrayList<Double>();
    Integer controle = 0, consulta;
    Scanner inputText = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);

    void cadastrarProduto(){
        cdProduto.add(controle+1);
        System.out.println("Informe os dados abaixo");
        System.out.println("Informe o nome do produto");
        nmProduto.add(inputText.nextLine());
        System.out.println("Informe a quantidade de produto");
        qtProduto.add(inputNumber.nextInt());
        System.out.println("Informe o valor do Produto");
        vlProduto.add(inputNumber.nextDouble());
    }
    void consultarProduto(){
        System.out.println("Para consultar um produto " +
                "informe o código do produto");
        System.out.println("Qual o código do produto?");
        consulta = inputNumber.nextInt();
        System.out.println(cdProduto.get(consulta -1));
        System.out.println(nmProduto.get(consulta -1));
        System.out.println(qtProduto.get(consulta -1));
        System.out.println(vlProduto.get(consulta -1));
    }
    private void produtosAutomatico(String nmProdutoA,
                                    Integer qtProdutoA,
                                    double vlProdutoA) {
        controle++;
        cdProduto.add(controle);
        nmProduto.add(nmProdutoA);
        qtProduto.add(qtProdutoA);
        vlProduto.add(vlProdutoA);
    }
    public Produto(){
        produtosAutomatico("Arroz 1", 20,5.00);
        produtosAutomatico("Tampa de Vaso", 15, 100.00);
        produtosAutomatico("Óleo de Soja", 30, 6.20);
        produtosAutomatico("Açúcar Refinado", 10,4.50);
        produtosAutomatico("Café Torrado", 25, 14.90);
    }

}
