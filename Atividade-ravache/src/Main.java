public class Main {
    public static void main(String[] args) {

        Arvore arvore = new Arvore();
        arvore.setRaiz(new No("A"));
        arvore.getRaiz().setEsquerdo(new No("B"));
        arvore.getRaiz().setDireito(new No("C"));
        arvore.getRaiz().getEsquerdo().setEsquerdo(new No("D"));
        arvore.getRaiz().getEsquerdo().setDireito(new No("E"));
        arvore.getRaiz().getDireito().setDireito(new No("F"));

        System.out.println("preOrdemNR");
        arvore.preOrdemNR((arvore.getRaiz()));
        System.out.println();
        System.out.println();
        System.out.println("emOrdemNR");
        arvore.emOrdemNR((arvore.getRaiz()));
    }
}

