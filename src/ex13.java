import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a altura da pessoa: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        double pesoIdeal;
        
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("%s, seu peso ideal é %.2f kg.", nome, pesoIdeal);
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("%s, seu peso ideal é %.2f kg.", nome, pesoIdeal);
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}
/*Esse programa irá ler o nome, a altura e o sexo (M ou F) de uma pessoa. Em seguida, ele calculará o peso ideal de acordo com o sexo usando as fórmulas fornecidas no enunciado. Se o sexo informado for M ou m, ele usará a primeira fórmula. Se for F ou f, ele usará a segunda fórmula. Caso contrário, ele imprimirá a mensagem "Sexo inválido". Por fim, ele imprimirá o nome da pessoa e o seu peso ideal em quilogramas com duas casas decimais.
 */
