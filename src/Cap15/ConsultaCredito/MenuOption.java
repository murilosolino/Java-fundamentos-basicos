package Cap15.ConsultaCredito;
// tipo enum para as opcoes do programa de consulta de credito
public enum MenuOption {
    // declara conetudo do tipo enum

    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value; // valor associado a uma opcao

    private MenuOption(int value) {
        this.value = value;
    }
}
