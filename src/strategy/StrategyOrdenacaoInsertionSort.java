package strategy;

import java.util.ArrayList;

import model.Produto;

/**
 *
 * @author karol
 */
public class StrategyOrdenacaoInsertionSort extends OrdenacaoStrategy {

    @Override
    public ArrayList<Produto> ordenar(ArrayList<Produto> produtos) {
        ArrayList<Produto> produtosOrdenados = produtos;
        insertionSort(produtosOrdenados, produtos.size());
        return produtosOrdenados;
    }

    public void insertionSort(ArrayList<Produto> produtos, int n) {
        int i, j;
        Produto x;

        for (i = 1; i < n; i++) {
            x =  produtos.get(i);
            j = i - 1;
            while ((j >= 0) && (produtos.get(j).getValor() > x.getValor())) {
                 produtos.set((j + 1), produtos.get(j));
                j--;
            }
             produtos.set((j + 1), x);
        }
    }

    @Override
    public String toString() {
        return ("Merge Sort");
    }
}
