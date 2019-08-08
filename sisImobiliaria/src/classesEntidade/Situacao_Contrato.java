package classesEntidade;

public enum Situacao_Contrato {

    EM_ABERTO(0), FECHADO(1), CANCELADO(2);

    private final int valor;

    private Situacao_Contrato(int val) {
        this.valor = val;
    }

    public int getValor() {
        return valor;
    }
}
