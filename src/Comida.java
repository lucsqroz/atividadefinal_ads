public class Comida {
    private Gato gato;

    public Comida(Gato gato) {
        this.gato = gato;
    }

    public void servirRacao() {
        double quantidadeRacao = gato.calcularQuantidadeRacaoDiaria();
        System.out.println("Servindo " + quantidadeRacao + "g de ração para o gato " + gato.getNome());
    }
}