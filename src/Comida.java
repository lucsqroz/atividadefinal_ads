public class Comida {
    private Gato gato;

    public Comida(Gato gato) {
        this.gato = gato;
    }

    public void servirRacao() {
        double quantidadeRacao = gato.calcularQuantidadeRacaoDiaria();
        System.out.println("Servindo " + quantidadeRacao + "g de ração para o gato " + gato.getNome());
    }

    public void verificarGato() {
        System.out.println("Verificando informações do gato:");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Idade: " + gato.getIdade() + " anos");
        System.out.println("Peso: " + gato.getPeso() + " kg");
    }
}
