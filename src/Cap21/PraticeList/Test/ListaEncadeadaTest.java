package Cap21.PraticeList.Test;

import Cap21.PraticeList.ListaEncadeada;

public class ListaEncadeadaTest {
    
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adicionar(1);
        
        
        listaEncadeada.adicionar(2);
       

        listaEncadeada.adicionar(3);
       System.out.println(listaEncadeada.toString());

        System.out.println("Tamanho da lista: " + listaEncadeada.getTamanho());

        listaEncadeada.limparLista();

        System.out.println(listaEncadeada.toString());
        System.out.println("Tamanho da lista: " + listaEncadeada.getTamanho());

        listaEncadeada.adicionar(10);
        listaEncadeada.adicionar(30);
        listaEncadeada.adicionar(100);
        listaEncadeada.adicionar(20);
        listaEncadeada.adicionar(50);

        System.out.println(listaEncadeada.toString());
        System.out.println("Tamanho da lista: " + listaEncadeada.getTamanho());

        listaEncadeada.pesquisaElemento(20);
        listaEncadeada.pesquisaElemento(1);
        listaEncadeada.pesquisaElemento(10);

        listaEncadeada.adicionar(1);

        System.out.println(listaEncadeada.toString());
        
        listaEncadeada.pesquisaElemento(1);

        System.out.println("Elemento na posicao: " + listaEncadeada.busca(2));

        listaEncadeada.adicionar(3, 2);

        System.out.println(listaEncadeada.toString());
        listaEncadeada.removerInicio();
        System.out.println(listaEncadeada.toString());
        listaEncadeada.removerInicio();
        System.out.println(listaEncadeada.toString());
        System.out.println("Tamanho da lista: " + listaEncadeada.getTamanho());
        
        listaEncadeada.removerFim();
        System.out.println(listaEncadeada.toString());
        listaEncadeada.removerFim();
        System.out.println(listaEncadeada.toString());
        listaEncadeada.remover(1);
        System.out.println(listaEncadeada.toString());

        listaEncadeada.remover(1);
        System.out.println(listaEncadeada.toString());

        listaEncadeada.remover(0);
        System.out.println(listaEncadeada.toString());
        
        
        

    }

}
