public class Nome {
    public static String nome;
    public static String sobrenome;

    public void receberNome() {
        System.out.println("Digite o seu nome:");
        this.nome = Main.scanner.nextLine();
    }

    public void receberSobrenome() {
        System.out.println("Digite o seu sobrenome:");
        this.sobrenome = Main.scanner.nextLine();
    }

    public void nomeCompleto() {
        System.out.println("Seu nome é: " + nome.concat(sobrenome));
    }
}
