public class Main {
    public static void main(String[] args) {

        Arvore arvore = new Arvore();
        arvore.setRaiz(new No("A"));
        arvore.getRaiz().setEsquerdo(new No("B"));
        arvore.getRaiz().setDireito(new No("C"));
        arvore.getRaiz().getEsquerdo().setEsquerdo(new No("D"));
        arvore.getRaiz().getEsquerdo().setDireito(new No("D"));
        arvore.getRaiz().getDireito().setDireito(new No("F"));

        System.out.println("preOrdem");
        arvore.preOrdem((arvore.getRaiz()));
        System.out.println("emOrdem");
        arvore.emOrdem((arvore.getRaiz()));
        System.out.println("posOrdem");
        arvore.posOrdem((arvore.getRaiz()));
    }
}

