package Cap21.TreeNode;

 class TreeNode<T extends Comparable<T>> {
    
    //membros de acesso de pacote
    TreeNode<T> leftNode;
    TreeNode<T> rigthNode;
    T data; // valor do no
  
    //Construtor que inicializa como no folha
    public TreeNode(T data){
        this.data = data;
        rigthNode = leftNode = null;
    }

    //Localiza um pnto de insercao e insere um novo no //ignora valores duplicados

    public void insert(T insertValue){

        //insere na subarvore da esquerda
        if(insertValue.compareTo(data) < 0){ //compara o valor a ser inserido com a raiz. Se for menor vai para o lado esquerdo da arvore
            if (leftNode == null){ 
                leftNode = new TreeNode<T>(insertValue); // so adiciona o valor quando o no esquerdo for null
            } else {
                leftNode.insert(insertValue);  // enquanto o no esquerdo nao for null, chama o metodo insert para ir percorrendo
                                                // e comparando os valores da arvore ate achar a posicao adequada
            }
        }

        //insere na subarvore a direita
        if(insertValue.compareTo(data) > 0){
            if (rigthNode == null) {
                rigthNode = new TreeNode<T>(insertValue);
            } else {
                rigthNode.insert(insertValue);
            }
        }
    }

}


public class Tree<T extends Comparable<T>>{

    private TreeNode<T> root;

    //construtor que inicializa Tree vazia
    public Tree(){
        root = null;
    }

    //insere um novo no na arvore binaria
    public void insertNode(T insertValue){
        if(root == null){
            root = new TreeNode(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    


    //inicia o percurso em pre ordem
    public void preorderTraversal(){
        preorderHelper(root);
    }

    //metodo recursivo para realizar o percurso de pre-ordem;
    private void preorderHelper(TreeNode<T> node) {
      
        if (node == null) {
            return;
        }

        System.out.printf("%s ", node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rigthNode);

    }

    public void inorderTraversal(){
        inorderHelper(root);
    }

    //metodo recursivo para realizar o percurso de ordem;
    private void inorderHelper(TreeNode<T> node) {
      
        if (node == null) {
            return;
        }

        inorderHelper(node.leftNode);
        System.out.printf("%s ", node.data);
        inorderHelper(node.rigthNode);

    }


    public void postorderTraversal(){
        postorderHelper(root);
    }

    //metodo recursivo para realizar o percurso de pos-ordem;
    private void postorderHelper(TreeNode<T> node) {
      
        if (node == null) {
            return;
        }

        postorderHelper(node.leftNode);
        postorderHelper(node.rigthNode);
        System.out.printf("%s ", node.data);

    }
}