package Cap14.StringBuilder;
// metodos insert e delete de StringBuilder.
public class StringBuilderInsertDelete {
    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        
        StringBuilder buffer = new StringBuilder();

        // Permite concatenar valores de qualquer tipo de dados ao objeto StringBuilder
        buffer.insert(0, objectRef)
            .insert(0, "\n")
            .insert(0, string)
            .insert(0, "\n")
            .insert(0, charArray)
            .insert(0, "\n")
            .insert(0, charArray, 3, 3)
            .insert(0, "\n")
            .insert(0, booleanValue)
            .insert(0, "\n")
            .insert(0, characterValue)
            .insert(0, "\n")
            .insert(0, integerValue)
            .insert(0, "\n")
            .insert(0, longValue)
            .insert(0, "\n")
            .insert(0, floatValue)
            .insert(0, "\n")
            .insert(0, doubleValue);

        System.out.printf("buffer after inserts:\n%s\n\n", buffer.toString());

        buffer.deleteCharAt(10);
        buffer.delete(2, 6);
        
        
        System.out.printf("buffer after deletes:\n%s\n", buffer.toString());
    }
}
