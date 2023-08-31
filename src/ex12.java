import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();
        
        System.out.print("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();
        
        System.out.print("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();
        
        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
        
        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
    
}
/*Esse programa irá ler a quantidade atual em estoque, a quantidade máxima em estoque e a quantidade mínima em estoque de um produto. Em seguida, ele calculará a quantidade média, que é obtida pela soma da quantidade máxima com a quantidade mínima dividida por 2. Depois disso, ele verificará se a quantidade atual em estoque é maior ou igual à quantidade média e imprimirá a mensagem "Não efetuar compra" nesse caso, ou "Efetuar compra" caso contrário. */
