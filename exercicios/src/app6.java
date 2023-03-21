import java.util.Scanner;

public class app6 {
  public static void main (String[] args) {
  
    try (Scanner input = new Scanner (System.in)) {
      int numero;

      System.out.println("Digite um número: ");
 
      numero = input.nextInt();
      if (numero % 2 == 0){
          System.out.println("É par!");
      }else{
          System.out.println("É impar!");
      }
    }
  }  
}
