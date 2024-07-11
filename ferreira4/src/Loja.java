import java.util.Scanner;
public class Loja {
    public static Scanner scanner;
    int  contador, secao;;
    public void adicionarInfos(){
        scanner = new Scanner(System.in);
        contador = 0;
        Produto produto = new Produto();
        Produto[][] matriz = new Produto[3][20];
        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();
        System.out.println("Nome do produto salvo");
        System.out.println("Digite o codigo do produto:");
        produto.codigo = scanner.nextInt();
        System.out.println("Codigo do produto salvo");
        System.out.println("Digite a quatidade que deseja adicionar desse produto:");
        produto.quantidade = scanner.nextInt();
        System.out.println("Quantidade do produto salva");
        System.out.println("Digite o preço do produto:");
        produto.preco = scanner.nextDouble();
        contador++;
        System.out.println("Em qual seção você deseja salvar o produto?");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        secao = scanner.nextInt();
        if(matriz[secao-1][contador] !=null){
            System.out.println("Já existe um produto nesse local, remova antes de adicionar outro.");
        }
        else{
            matriz[secao-1][contador] = produto;
        }
    }

}
