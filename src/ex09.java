import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Digite o salário por hora: ");
        double salarioHora = scanner.nextDouble();
        
        int horasExtras = horasTrabalhadas - 40;
        
        if (horasExtras > 0) {
            double salarioTotal = (40 * salarioHora) + (horasExtras * salarioHora * 1.5);
            System.out.println("O salário total do funcionário é: R$" + salarioTotal);
        } else {
            double salarioTotal = horasTrabalhadas * salarioHora;
            System.out.println("O salário total do funcionário é: R$" + salarioTotal);
        }
    }
    
}
/*Esse programa irá ler o número de horas trabalhadas em um mês e o salário por hora. Em seguida, ele calculará as horas extras, caso tenham sido trabalhadas, e calculará o salário total do funcionário. O salário total será acrescido das horas extras, considerando um acréscimo de 50% sobre o valor da hora regular. */
