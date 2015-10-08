
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Proyectoalfa {

    public static void main(String[] args) {
     float cambio= 1.2f,euros,resultado;
     Scanner dolares=new Scanner(System.in);
     System.out.println("cambio= "+cambio);//Visualizar cambio
     System.out.println("euros");
     euros=dolares.nextFloat();
     resultado=euros*cambio;
     System.out.println("Dolares= "+resultado+"$");
    
    

    }
    
}
