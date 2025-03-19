package aulaExercicio;

abstract class People {

    private String cor;
    private String estatura;
    private int idade;

    public People(String cor, String estatura, int idade) {

        this.cor = cor;
        this.estatura = estatura;
        this.idade = idade;
        
    }
    public String getCor() {
        return cor;
    }

    public void getCor(String cor) {
        this.cor = cor;
    }

    public String getEstatura() {
        return estatura;
    }

    public void getEstatura(String estatura) {
        this.estatura = estatura;
    }
    public int getIdade(){
        return idade;
    }
    public void getIdade(int idade){
        this.idade = idade;
    }

    public void exibirInfo() {
    }
}