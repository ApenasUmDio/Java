public class Senha {
    String senha;
    String senha2;
    public void digiteSenha() {
        System.out.println("Digite sua senha (Deve conter o quarto caracter como 'Z': ");
        this.senha = Main.scanner.nextLine();
        if (senha.charAt(4) == 'Z'){
            digiteNovamente();
            verificacao();
        }
        else{
            System.out.println("ERROOOOOOOOR");

        }
    }
        public void digiteNovamente() {
            System.out.println("Digite novamente sua senha");
            this.senha2 = Main.scanner.nextLine();
        }
        public void verificacao(){
        if (senha.equals(senha2)){
            System.out.println("Senhas gravadas com sucesso");}
        }
    }


