import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();
        
        int maior = valor1;
        
        if (valor2 > maior) {
            maior = valor2;
        }
        
        if (valor3 > maior) {
            maior = valor3;
        }
        
        System.out.println("O maior valor é " + maior + ".");
    }
    
}
/*Esse programa irá ler 3 valores digitados pelo usuário. Em seguida, ele verificará qual é o maior valor entre eles usando a variável `maior`. Primeiro, ele compara `valor2` com `maior`. Se `valor2` for maior que `maior`, ele atualiza o valor de `maior` para `valor2`. Depois, ele compara `valor3` com `maior`. Se `valor3` for maior que `maior`, ele atualiza o valor de `maior` para `valor3`. Por fim, ele imprime a mensagem "O maior valor é X.", onde X é o valor da variável `maior`. */
