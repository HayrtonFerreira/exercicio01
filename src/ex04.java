import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("A média calculada é: " + media);
        
        if (media >= 6) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno não foi aprovado.");
        }
    }
    
}
/*Esse programa irá ler as notas da 1ª e 2ª avaliações do aluno, calcular a média aritmética simples e informar se o aluno foi aprovado ou não, considerando que a nota de aprovação é igual ou maior que 6.
 */