public class Gato {
    private String nome;
    private int idade;
    private double peso;

    public Gato(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public double calcularQuantidadeRacaoDiaria() {
        double quantidadeRacao;

        if (idade < 1) {
            quantidadeRacao = peso * 0.5;
        } else if (idade >= 1 && idade <= 10) {
            quantidadeRacao = peso * 0.75;
        } else {
            quantidadeRacao = peso * 0.5;
        }

        return quantidadeRacao;
    }

    public void miar() {
        System.out.println("O gato " + nome + " está miando.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
}