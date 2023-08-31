import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
     
          Scanner in = new Scanner(System.in);
          // pedir a o usuario um valor e armazena na variavel valor
          System.out.println("Digite um numero");
          int valor = in.nextInt();
          // ...
         if(valor>10){
            System.out.println(valor + " E mair que 10");
         }else{
            System.out.println(valor +" Nao e mair que 10");}

         
         }
    }

