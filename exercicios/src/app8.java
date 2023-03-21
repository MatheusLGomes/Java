import java.util.Scanner;

public class app8 {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        double nota_1;
        double nota_2;
        double media;

        System.out.println("Informe a sua 1° nota: ");
        nota_1 = input.nextDouble();
        System.out.println("Informe a sua 2° nota: ");
        nota_2 = input.nextDouble();
        
        media = (nota_1 + nota_2)/2;

        if (nota_1  >= 0  && nota_1 <= 10){
          System.out.println("A média é " + media);
        } if (nota_2 >= 0 && nota_2 <= 10){
           System.out.println("A média é " + media);
        } else{
            System.out.println(" O valor é inválido ");
        }
        
    }
}
