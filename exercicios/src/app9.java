import java.util.Scanner; 

public class app9 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double prestacao;
        //double vinte_porcento;
        double vinte_porcento_salario;

        System.out.println("Informe o seu salário: ");
        salario = input.nextDouble();
        System.out.println("Informe a sua prestação: ");
        prestacao = input.nextDouble();

    
       

        vinte_porcento_salario = (salario * 20)/100;

        if(prestacao > vinte_porcento_salario){
            System.out.println("Empréstimo concedido.");
        }else{ 
            System.out.println("Empréstimo não concedido.");
        }





    }
}