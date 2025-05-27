import java.util.Stack;

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
    public void preOrdemIte(No raiz){
        if (raiz == null) return;
            Stack<No> pilha= new Stack<>();
            pilha.push(raiz);

            while(!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.println(atual.getValor());
            if (atual.getDireito() != null) {
                pilha.push(atual.getDireito());
            }
            if (atual.getEsquerdo() != null) {
                pilha.push(atual.getEsquerdo());
            }
        }

    }
}