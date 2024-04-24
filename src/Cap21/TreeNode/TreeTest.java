package Cap21.TreeNode;

import java.security.SecureRandom;

public class TreeTest {
    
    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("Inserindo os seguintes valores: ");

        //insere 10 inteiros aleatorios de 0-99 na arvore
        for (int i = 1; i <= 10; i++) {
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        System.out.println("\n\nPercurso em pre-ordem");
        tree.preorderTraversal();

        System.out.println("\n\nPercurso em ordem");
        tree.inorderTraversal();

        System.out.println("\n\nPercurso em pos-ordem");
        tree.postorderTraversal();

    }

}
