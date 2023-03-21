import java.util.Scanner;

public class app7 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int numero_1;
        int numero_2;
        int dif_1;
        int dif_2;

        System.out.println("Informe um número: ");
        numero_1 = input.nextInt();
        System.out.println("Informe outro número: ");
        numero_2 = input.nextInt();

        dif_1 = numero_2 - numero_1;
        dif_2 = numero_1 - numero_2;

        if (numero_2 > numero_1) {
         System.out.println("O número " + numero_2 + " é maior do que " + numero_1 + " e a diferença é: " + dif_1);
        } if (numero_1 > numero_2){
            System.out.println("O número " + numero_1 + " é maior do que " + numero_2 + " e a diferença é: " + dif_2);
         } if (numero_1 == numero_2){
            System.out.println("O número " + numero_1 + " e o número " + numero_2 + " são iguais");
         }
        
    }
}
