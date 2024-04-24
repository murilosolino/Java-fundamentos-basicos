package Cap21.List.PraticeList;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho = 0;
    private No<T> ultimo;

    public void adicionar(T valor) {
        No<T> celula = new No<T>(valor);

        if (tamanho == 0) {
            this.inicio = celula;
            this.ultimo = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionaInicio (T valor){

        if (tamanho == 0) { // esta vazia insere no incio
            this.inicio = this.ultimo = new No<T>(valor);
            tamanho++;
        } else {
            No<T> novoNo = new No<T>(valor, inicio);
            inicio = novoNo;
            tamanho++;
        }

    }

    public void adicionar(int posicao, T valor){

        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posicao nao existe");
        }

        if (posicao == 0) { // esta vazia insere no incio
            adicionaInicio(valor);
        } else if (posicao == tamanho){ // insere no fim
            this.adicionar(valor);
        } else { //insere no meio
            No<T> anterior = buscaPosicao(posicao);
            No<T> proximoNo = anterior.getProximo();
            No<T> novoNo = new No<>(valor);
            novoNo.setProximo(proximoNo);
            anterior.setProximo(novoNo);
            tamanho++;
        }

    }

    public void removerInicio(){

        if(this.tamanho == 0){
            throw new RuntimeException("Lista vazia, nao ha elementos para serem removidos");
        }

        inicio = inicio.getProximo();
        tamanho--;

        if(this.tamanho == 0){
            this.ultimo = null;
        }
    }


    public void remover(int posicao){

        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }

        if (posicao == 0) {
            this.removerInicio();
            return; //return usado para sair do metodo remover
                    // impedindo o metodo de continuar e gerar um erro de execucao
        }

        if (posicao == this.tamanho -1) {
            this.removerFim();
            return;
        }

        No<T> anterior = this.buscaPosicao(posicao -1);
        No<T> atual = anterior.getProximo();
        No<T> proximo = atual.getProximo();
        anterior.setProximo(proximo);
        atual.setProximo(null);
        tamanho--;
    }



    public void removerFim(){

        if(this.tamanho == 0){
            throw new RuntimeException("Lista vazia, nao ha elementos para serem removidos");
        }

        if (tamanho == 1) {
            removerInicio();
        }

        No<T> penultimo = this.buscaPosicao(tamanho -2); // a  posicao 0 armazena o tamanho 1 entao para buscar o penultimo usa tamanho -2
        penultimo.setProximo(null);
        this.ultimo = penultimo;
        tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void limparLista() {

        if (tamanho == 0) {
            System.out.println("Lista Limpa");
        }

        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setValor(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;

    }

    private No<T> buscaPosicao(int posicao){

        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posicao nao existe");
        }

        No<T> atual = inicio;

        for(int i = 0; i < posicao; i++){
            atual = atual.getProximo();
        }
        

        return atual;
    }

    public T busca(int posicao){
        return this.buscaPosicao(posicao).getValor();
    }


    public void pesquisaElemento(T valor) {

        if (tamanho == 0) { // se a lista estiver vazia lanca uma excecao
            throw new IllegalStateException("Lista vazia. Não é possível buscar elementos.");
        }

        No<T> atual = inicio; // inicia um no para percorer a lista
        boolean encontrado = false; // inicia variavel que indica se o valor foi encontrado
        int posicao = 0;

        // caso o valor esteja na primeira posicao da lista
        if (atual.getValor().equals(valor)) {
            System.out.println(valor + " Encontrado no endereco de memoria: " + atual.toString() + "Posicao: " + posicao);
            encontrado = true;
        } else {
            // senao estiiver no primeiro valor, percorre a lista ate o fim
            while (atual.getProximo() != null) {
                posicao++;
                atual = atual.getProximo(); // avanca para verificar o proximo no
                if (atual.getValor().equals(valor)) { // verifica se o no atual eh igual a valor
                    encontrado = true; // caso seja passa encontrado como true e finaliza o loop
                    break;
                } // caso nao seja passa para o proximo no em busca do valor\
            }

            if (encontrado == true) {
                System.out.println(valor + " Encontrado  no endereco de memoria: " + atual.toString()  + " Posicao: " + posicao);
            } 
        }

        if(encontrado == false) {
            System.out.println(valor + " nao encontrado ");
        }

    }

    @Override
    public String toString() {

        if (tamanho == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();

        No<T> atual = inicio;
        sb.append("[");
        sb.append(atual.getValor());

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            sb.append(",");
            sb.append(atual.getValor());
        }

        sb.append("]");
        return sb.toString();
    }
}
