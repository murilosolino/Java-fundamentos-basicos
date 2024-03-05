package Cap14.StringBuilder;
// metodos capacity, ensureCapacity, length e setLength de StringBuilder.
// length  - retornar o número de caracteres atualmente em um StringBuilder
// capacity - retornar a capacidade atual de um StringBuilder
// ensureCapacity - garantir que um StringBuilder tenha uma capacidade mínima
// setLength - aumenta ou diminui o número de caracteres em um StringBuilder
public class StringBuilderCaplen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n",
            buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d\n\n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d\nbuffer = %s\n", buffer.length(), buffer.toString());
    }
}
