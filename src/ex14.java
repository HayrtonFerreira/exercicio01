import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        
        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }
    }
    
}
/*Esse programa irá ler um valor digitado pelo usuário. Em seguida, ele verificará se o valor é maior que zero, menor que zero ou igual a zero. Dependendo do resultado, ele imprimirá a mensagem "O valor é positivo", "O valor é negativo" ou "O valor é zero". */
