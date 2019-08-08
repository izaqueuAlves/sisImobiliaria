package classesEntidade;

public enum Situacao_Imovel {

    DISPONIVEL_ALGUEL(0), DISPONIVEL_VENDA(1), DISPONIVEL_VENDA_ALUGUEL(2), ALUGADO(3), VENDIDO(4);

    private final int valor;

    private Situacao_Imovel(int val) {
        this.valor = val;
    }

    public int getValor() {
        return valor;
    }
}
