package proyectoalfa;
import java.util.Scanner;
public class Proyectoalfa {

    public static void main(String[] args) {
     float cambio= 1.2f,euros,resultado;//Nueva variable
     Scanner dolares=new Scanner(System.in);
     System.out.println("cambio= "+cambio);//Visualizar cambio
     System.out.println("euros");
     euros=dolares.nextFloat();
     resultado=euros*cambio;
     System.out.println("Dolares= "+resultado+"$");
    
    

    }
    
}
