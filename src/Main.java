public class Main {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Bolinha", 2, 4.5);
        Comida comidaParaMeuGato = new Comida(meuGato);

        comidaParaMeuGato.servirRacao();
        comidaParaMeuGato.verificarGato();
        meuGato.miar();
    }
}
