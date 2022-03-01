
package strategy;

import java.util.ArrayList;

import model.Produto;

/**
 *
 * @author karol
 */
public class StrategyOrdenacaoQuickSort extends OrdenacaoStrategy {
    
    @Override
    public ArrayList<Produto> ordenar(ArrayList<Produto> produtos){
        ArrayList<Produto> produtosOrdenados = produtos;
        quickSort(produtosOrdenados, 0, produtos.size()-1);
        return produtosOrdenados;
    }
    
    public void quickSort(ArrayList<Produto> produtos, int ini, int fim){
        int i, j;
        float pivot;

        i = ini;
        j = fim;
        pivot = produtos.get((ini + fim) / 2).getValor();

        while (i <= j) {
            while (produtos.get(i).getValor() < pivot && i < fim) {
                i++;
            }
            while (produtos.get(j).getValor() > pivot && j > ini) {
                j--;
            }
            if (i <= j) {
                swap(produtos, i, j);
                i++;
                j--;
            }
        }

        if (j > ini) {
            quickSort(produtos, ini, j);
        }
        if (i < fim) {
            quickSort(produtos, i, fim);
        }
    }
    
    public static void swap(ArrayList<Produto> list, int i, int j) {
        Produto aux;
        aux = list.get(i);
        list.set(i, list.get(j));
        list.set(j, aux);
    }
    
    @Override
    public String toString(){
        return("Quick Sort");
    }
}
