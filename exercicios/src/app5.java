import java.util.Scanner;

public class app5 {
    public static void main (String[] args ){

     try (Scanner input = new Scanner (System.in)) {
      int numero;
       double raiz, potencia;

       System.out.println("Digite um número: ");

       numero = input.nextInt();
       raiz = Math.sqrt(numero);
       potencia = Math.pow(numero,2);

        if (numero >= 0) {
          System.out.println("O número digitado ao quadrado é: "+ potencia + " e a raiz quadrada é " + raiz);

        }
    }
    }
}
