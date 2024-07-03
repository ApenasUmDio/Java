import java.util.Scanner;
public class Main {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
//        Nome strings = new Nome();
//        strings.receberNome();
//        strings.receberSobrenome();
//        strings.nomeCompleto();
//        Senha senhas = new Senha();
//        senhas.digiteSenha();
        SenhaAutomatica senhas2 = new SenhaAutomatica();
        senhas2.receberNome2();
        senhas2.receberSobreNome2();
        senhas2.criarSenha();

    }
}