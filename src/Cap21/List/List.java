package Cap21.List;
//Declaracoes de classe ListNode e List
//classe que representa um no em uma lista
 class ListNode<T> {
    
    T data; // dados para esse no
    ListNode<T> nextNode; // referencia para o proximo no da lista

    //construtor cria um ListNode que referencia o objeto
    ListNode(T object){

        this(object,null);

    }

    //construtor cria ListNode que referencia o objeto
    // especificado o procimo ListNode
    ListNode(T object, ListNode<T> node){
        this.data = object;
        this.nextNode = node;
    }

    //retorna refencia aos dados do no
    public T getData(){
        return data;
    }

    //retorna a referencia ao proximo no da lista
    public ListNode<T> getNode(){
        return nextNode;
    }
} // fim da classe ListNode<T>

//definicao da classe List<T>
    public class List<T>{
        private ListNode<T> firstNode;
        private ListNode<T> lastNode; 
        private String name; // String  como "lista" usada na impressao

        //construtor cria uma list vazia com "list" como o nome
        public List(){
            this("list");
        }

        // construtor que cria uma lista vazia com um nome
        public List(String listName){
            this.name = listName;
            this.firstNode = null;
        }

        //insere o item na frente de List
        public void insertAtFront(T inserItem){
            //firstNode e lastNode referenciam o besmo objeto
            if (isEmpty()) {
                firstNode = lastNode = new ListNode(inserItem);
            } else { //firstnode referencia um novo no
                firstNode = new ListNode(inserItem, firstNode);
            }
        }

        //insere o item no final da lista
        public void insertAtBack(T insertItem){
            if (isEmpty()) {
                firstNode = lastNode = new ListNode(insertItem);
            } else {
                lastNode = lastNode.nextNode = new ListNode(insertItem);
            } 
        }

        // remove o priemeiro no na lista
        public  T removeFromFront() throws EmptyListException{
            if (isEmpty()) { //lanca excecao se list estiver vazia
                throw new EmptyListException(name);
            }

            T removedItem = firstNode.data; //recupera dados a serem removidos

            //atualiza referencias firstNode e lastNode
            if (firstNode == lastNode) {
                firstNode = lastNode = null;
            } else { // quando no eh removido o primeiro elemento passa a ser o no seguinte do removido
                firstNode = firstNode.nextNode;
            }

            // retorna dados de nos removidos
            return removedItem;
        }

        //remove o ultimo no da lista
        public T removeFromBack() throws EmptyListException{
            
            if(isEmpty()){ //lanca excecao se list estiver vaza
                throw new EmptyListException(name);
            }

            T removedElement = lastNode.data; //recupera os elementos a serem removidos

            //atualiza as referencias de firstNode e LastNode
            if (firstNode == lastNode) {
                firstNode = lastNode = null;
            } else { //localiza o novo ultimo no
                ListNode<T> current = firstNode; //cria current para percorer a lista

                //faz um loop enquanto o no atual nao referncia o lastNode
                 while (current.nextNode != lastNode) {
                    current = current.nextNode;
                 }

                 lastNode = current; //atual eh o novo lastNode
                 current.nextNode = null;
            }

            return removedElement; //retorna dados de no removidos

        }

        //verifica se a lista esta vazia
        public boolean isEmpty() {
            return firstNode == null;
        }

        // enquanto não estiver no fim de lista, gera saída dos dados do nó atual
        public void print(){
            if (isEmpty()){
                System.out.println("Empty " + name);
                return;
            }

            System.out.println("The " + name + " is:");

            ListNode<T> current = firstNode;

            while (current != null) {
                System.out.println(current.data);
                current = current.nextNode;
            }

            System.out.println();

        }
    }
