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

    public void preOrdemNR(No raiz) {
        if (raiz == null) return;
        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.getValor() + " ");
            if (atual.getDireito() != null) {
                pilha.push(atual.getDireito());
            }
            if (atual.getEsquerdo() != null) {
                pilha.push(atual.getEsquerdo());
            }
        }
    }

    public void emOrdemNR(No raiz) {
        Stack<No> pilha = new Stack<>();
        No atual = raiz;

        while (atual != null || !pilha.isEmpty()) {
            while (atual != null) {
                pilha.push(atual);
                atual = atual.getEsquerdo();
            }
            if (!pilha.isEmpty()) {
                atual = pilha.pop();
                System.out.print(atual.getValor() + " ");
                atual = atual.getDireito();
            }
        }
    }

    public void posOrdemNR(No raiz) {
        if (raiz == null) return;

        Stack<No> pilha1 = new Stack<>();
        Stack<No> pilha2 = new Stack<>();

        pilha1.push(raiz);

        while (!pilha1.isEmpty()) {
            No no = pilha1.pop();
            pilha2.push(no);

            if (no.getEsquerdo() != null) pilha1.push(no.getEsquerdo());
            if (no.getDireito() != null) pilha1.push(no.getDireito());
        }
        while (!pilha2.isEmpty()) {
            System.out.print(pilha2.pop().getValor() + " ");
        }
    }

    public void emNivel(No raiz) {
        if (raiz == null) return;

        Stack<No> pilha1 = new Stack<>();
        Stack<No> pilha2 = new Stack<>();

        pilha1.push(raiz);

        while (!pilha1.isEmpty()) {
            No no = pilha1.pop();
            pilha2.push(no);

            if (no.getEsquerdo() != null) pilha1.push(no.getEsquerdo());
            if (no.getDireito() != null) pilha1.push(no.getDireito());
        }
        while (!pilha2.isEmpty()) {
            System.out.print(pilha2.pop().getValor() + " ");
        }
    }

    public int contarF(No raiz) {
        if (raiz == null)
            return 0;

        Stack<No> pilha = new Stack<>();
        int contador = 0;
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();

            if (atual.getEsquerdo() == null && atual.getDireito() == null) {
                contador++;
            }

            if (atual.getDireito() != null) {
                pilha.push(atual.getDireito());
            }
            if (atual.getEsquerdo() != null) {
                pilha.push(atual.getEsquerdo());
            }
        }

        return contador;
    }
}