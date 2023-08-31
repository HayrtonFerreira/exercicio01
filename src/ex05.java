import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        
        System.out.print("Digite o ano de nascimento da pessoa: ");
        int anoNascimento = scanner.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        if (idade >= 16) {
            System.out.println("A pessoa pode votar este ano.");
        } else {
            System.out.println("A pessoa não pode votar este ano.");
        }
    }
    
}
/*Esse programa irá ler o ano atual e o ano de nascimento da pessoa, calcular a idade e informar se ela pode votar este ano, considerando que a idade mínima para votar é 16 anos.*/
