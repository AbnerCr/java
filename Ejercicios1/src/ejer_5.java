
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
public class ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int año = 0;
        int mes = 0;
        int dia = 0;
        
        System.out.println("Ingrese año");
        año = entrada.nextInt();
        System.out.println("Ingrese mes");
        mes = entrada.nextInt();
        System.out.println("Ingrese dia");
        dia = entrada.nextInt();
        
        if (año > 0)
        {
            if (mes > 0 && mes <= 12)
            {
            switch(mes)
            {
                case 1:
                    if(dia > 0 && dia <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 2:
                    if (dia > 0 && dia <= 28)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 3:
                    if (dia > 0 && dia <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 4:
                    if (dia > 0 && dia <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 5:
                    if (dia > 0 && dia <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 6:
                    if (dia > 0 && dia <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 7:
                    if (dia > 0 && dia <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 8:
                    if (dia > 0 && dia <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 9:
                    if (dia > 0 && dia <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 10:
                    if (dia > 0 && dia <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 11:
                    if (dia > 0 && dia <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 12:
                    if (dia > 0 && dia <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                }
            }
            else
            {
                System.out.println("Fecha incorrecta");
            }
        }
        else
        {
            System.out.println("La fecha es incorrecta");
        }
    
    }
}
