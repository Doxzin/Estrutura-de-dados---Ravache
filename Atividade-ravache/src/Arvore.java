public class Arvore {
    private No raiz = null;

    public Arvore() {
        this.raiz = null;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return raiz;
    }

    public int contarNo() {
        return contagem(raiz);
    }
    public int contagem(No no) {
        if (no == null) {
            return 0;

        } else {
            int esquerda = contagem(no.getEsquerdo());
            int direita = contagem(no.getDireito());
            return 1 + esquerda + direita;
        }
    }
    public void preOrdem (No no) {
        if (no != null){
            System.out.println(no.getValor());
            preOrdem(no.getEsquerdo());
            preOrdem(no.getDireito());
        }
    }
    public void emOrdem (No no){
        if (no != null);
            emOrdem(no.getEsquerdo());
            System.out.println(no.getValor());
            emOrdem(no.getDireito());
    }
    public void posOrdem (No no) {
        if (no != null) {
            posOrdem(no.getEsquerdo());
            posOrdem(no.getDireito());
            System.out.println((no.getValor()));
        }
    }
}
