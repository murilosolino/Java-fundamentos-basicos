package Cap18;
// Solução do problema das Torres de Hanói com um método recursivo.
public class TowersOfHanoi {
    
    //move recursivamente os discos entre as torres
    public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg){

        // caso basico ---> somente um disco a ser movido
        if (disks==1) {
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
            return;
        }

        //passo recursivo --> move os discos (disco -1) do souircePeg
        //para tempPeg usando destinationPag

        solveTowers(disks - 1 , sourcePeg, tempPeg, destinationPeg);

        // move o ultimo disco de destinationPag para sourcePeg
        System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);

        //move discos de tempPag para destinationPeg
        solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
    }

    public static void main(String[] args) {

        int startPeg = 1; // valor inicial para mover todos os discos
        int endPeg = 3; // valor final para mover todos os discos
        int tempPeg = 2; // torre temporaria usada para mover os discos
        int totalDisks = 3; // numero de discos

        // chamada não recursiva inicial: move todos os discos.
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);
    }

}
