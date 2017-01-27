/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.a03.obtension.de.hipotenusa;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGA03ObtensionDeHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hipotenusa a partir de catetos");
        //variables
        double ca, co, h;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce la medida del cateto opuesto");
        co= kb.nextDouble ();
        System.out.println("Introduce la medida del cateto adyacente");
        ca= kb.nextDouble();
        //Cálculo
        h= Math.sqrt( Math.pow(ca, 2) +Math.pow(co, 2));
        //Mostrar Resultado
        System.out.println("Hipotenusa= "+h);
    }
}

