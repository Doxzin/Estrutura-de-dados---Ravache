public class No{
    private String valor;
    private No esquerdo, direito;

    public No(String valor){
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }

    public String getValor() {
        return valor;

    }

    public No getEsquerdo() {
        return esquerdo;

    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;

    }

    public No getDireito() {
        return direito;

    }

    public void setDireito(No direito) {
        this.direito = direito;

    }
}
