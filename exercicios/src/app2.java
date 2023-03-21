
import java.util.Scanner;

public class app2 {
    public static  void main(String[]args) {
       Scanner texto = new Scanner("System.in");
       String str;

       System.out.println("Digite seu nome: ");
       str = texto.nextLine();
       System.out.println("Bem-vindo(a)" + str);

       texto.close();
   

   // Não funcionou com deveria, checar na aula depois https://youtu.be/0pjdxpI3WSs
}
}
