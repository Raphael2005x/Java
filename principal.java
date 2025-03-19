package aulaExercicio;

public class principal {
    
    public static void main(String[] args) {
        informacoes info = new informacoes(30, "lucas", 59, "branca", "magro");
        
        info.exibirInfo();
        System.out.println("Nome: " + info.getNome());
        System.out.println("Idade: " + info.getIdade() + " anos");
        System.out.println("Peso: " + info.getPeso() + "kg");
        System.out.println("Cor: " + info.getCor());
        System.out.println("Estatura: " + info.getEstatura());
    }
}
