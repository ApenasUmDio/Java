public class SenhaAutomatica {
    public String nome2;
    public String sobrenome2;
    public String senhaauto;

    public void receberNome2() {
        System.out.println("Digite o seu nome:");
        this.nome2 = Main.scanner.nextLine();
        nome2.toUpperCase();
    }

    public void receberSobreNome2() {
        System.out.println("Digite o seu sobrenome:");
        this.sobrenome2 = Main.scanner.nextLine();
        nome2.toUpperCase();
    }

    public void criarSenha(){
        this.senhaauto= nome2.substring(0,4).concat(sobrenome2.substring(sobrenome2.length()-4)).toUpperCase();
        System.out.println("Sua senha é :"+senhaauto);
    }
}
