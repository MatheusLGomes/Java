import java.util.Scanner;

public class app10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner (System.in);

        
          
        
        
        double peso_ideal_M;    
        double peso_ideal_F;
        double altura;

        System.out.println("Digite a sua altura: ");
        altura = input.nextDouble();
        
       System.out.println("Digite o seu sexo M ou F: ");
       char sexo = scanner.next().charAt(0);
       System.out.println("Sexo: " + sexo);
      

     peso_ideal_M = (72.7 * altura) - 58;
     peso_ideal_F = (62.1 * altura) - 44.7;
      
       if (sexo == 'M' ) {
        System.out.println("Seu peso ideal é: " +peso_ideal_M+" e sua altura é: "+ altura);
        
       } if (sexo == 'F' ){
        System.out.println("Seu peso ideal é: " +peso_ideal_F+" e sua altura é: "+ altura);
       } else{
        System.out.println(" O valor digitado está incorreto!");
       }
  
  


        




        
    }
}
