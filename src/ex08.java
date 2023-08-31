import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();
        
        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();
        
        int duracao;
        
        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }
        
        System.out.println("A duração do jogo é de " + duracao + " horas.");
    }
    
}
/*Esse programa irá ler a hora de início e a hora de fim do jogo de Xadrez, considerando apenas horas inteiras. Em seguida, ele calculará a duração do jogo em horas, levando em consideração que o tempo máximo de duração é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */
