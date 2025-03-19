package aulaExercicio;

class informacoes extends People {
    private String nome;
    private double peso;

    public informacoes(int idade, String nome, double peso, String cor, String estatura) {
        super(cor, estatura, idade);
        this.nome = nome;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override

    public void exibirInfo() {
        super.exibirInfo();
    }
}