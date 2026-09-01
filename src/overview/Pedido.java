package overview;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Integer> cdPedido = new ArrayList<Integer>();
    ArrayList<Integer> cdProdutoPedido = new ArrayList<Integer>();
    ArrayList<Integer> qtProdutoPedido = new ArrayList<Integer>();
    ArrayList <Double> vlTotalPedido = new ArrayList<Double>();
    ArrayList<Produto> pro = new ArrayList<>();
    Integer controle = 0;
    void cadastrarPedido(Integer cdProduto, Integer qtProduto) {
        controle++;
        cdPedido.add(controle);
        cdProdutoPedido.add(cdProduto);
        qtProdutoPedido.add(qtProduto);
        vlTotalPedido.add(pro.get(cdProduto)
                .getVlProduto()
                .get(cdProduto - 1) * qtProduto);
    }
    void consultarPedido(Integer consultaPedido){
        cdPedido.get(consultaPedido);
        cdProdutoPedido.get(consultaPedido);
        qtProdutoPedido.get(consultaPedido);
        vlTotalPedido.get(consultaPedido);
    }
}