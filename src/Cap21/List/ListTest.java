package Cap21.List;


public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>("Integer List");

        //insere os inteiros na lista
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        list.print();

        try {
            int removedItem = list.removeFromFront();
            System.out.printf("%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromFront();
            System.out.printf("%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromBack();
            System.out.printf("%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromBack();
            System.out.printf("%d removed%n", removedItem);
            list.print();

        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
