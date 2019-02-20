
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
public class ejer_3 {

    /**
     * @param args the command line arguments
     */Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int numero, invertido =0, resto;
        System.out.println("Indrotuce un numero");
       numero=entrada.nextInt();
        while(numero> 0){
            resto=numero%10;
            invertido=invertido*10+resto;
            numero/=10;
        }
        System.out.println("numero invertido:"+invertido);
    }
    
}

