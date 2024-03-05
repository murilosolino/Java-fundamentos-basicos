package Cap8.Secao8_9;
//Declaracando um enum com construtor e campos de instancia explicitos e metodos de acesso
public enum Book {
    
    //Declarando constantes do tipo enum
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    //Campos de instancia
    private final String title; //Titulo do livro
    private final String year; //Ano do livro

     Book(String title, String year) {
        this.title = title;
        this.year = year;
    }

    //Metodo de acesso para o campo title
    public String getTitle() {
        return title;
    }

    //Metodo de acesso para o campo year
    public String getYear() {
        return year;
    }

}//Fim da enum Book
