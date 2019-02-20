
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
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese numero entre 0 a 9,99");
        int numero = entrada.nextInt();
        System.out.println("-------------------------------");
        if (numero<10)
            System.out.println("tiene 1");
        else if (numero<100)
            System.out.println("tiene 2 cifras");
        else if (numero<1000)
            System.out.println("tiene 3 cifras");
        else if (numero<10000)
            System.out.println("tiene 4 cifras");
        else if (numero<1000000)
            System.out.println("tiene 5 cifras");
    }
    
}
