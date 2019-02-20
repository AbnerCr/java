
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abner
 */
public class ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner entrada=new Scanner(System.in);
   int dia,mes,año;
   System.out.print("Introduzca día: ");
   dia=entrada.nextInt();
   System.out.print("Introduzca mes: "); 
   mes=entrada.nextInt();
   System.out.print("Introduzca año: ");
   año=entrada.nextInt();
   if (dia >= 1 && dia <=30)
   if (mes >= 1 && mes <= 12)
    if (año != 0)
     System.out.println ("Fecha correcta");
     else
     System.out.println ("Año incorrecto");
     else
     System.out.println("Mes incorrecto");
     else
     System.out.println("Día incorrecto");
    }
    
}
