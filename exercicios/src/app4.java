import java.util.Scanner;

public class app4 {
    public static void main(String[] args){

        try (Scanner input = new Scanner (System.in)) {
          int numero;
          double quadrado; 
          double raiz;

   System.out.println("Digite um número");

   numero = input.nextInt();
   raiz = Math.sqrt(numero);
   quadrado = Math.pow(numero,2);

   if (numero >= 0){
          System.out.println(" O número " + numero + " é positivo e a raiz quadrada é: " + raiz);
   }else{
          System.out.println(" O número " + numero + " é negativo e a potência quadrada é: " + quadrado);
   }
        }


    }
}
