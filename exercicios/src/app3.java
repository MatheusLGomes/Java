import java.util.Scanner;

public class app3 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
			int numero;
			double raiz;

			System.out.println("Digite um número positivo: ");
			numero = input.nextInt();
			raiz = Math.sqrt(numero);
			if (numero >= 0){

			    System.out.println(raiz);
			}else{
			    System.out.println("Número é invalido ");
			}
		}
        
    }
    
}
