/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.sistemasolar;

import ec.edu.espoch.sistemasolar.clases.Planeta;
import ec.edu.espoch.sistemasolar.enumeraciones.TipoPlaneta;

/**
 *
 * @author SO-LAB-PC6
 */
public class SistemaSolar {

    public static void main(String[] args) {
        Planeta objPlaneta = new Planeta("Tierra", 2, 100, 2, 500, 1000, TipoPlaneta.ENANO);
        

        objPlaneta.imprimir();

        double densidad = objPlaneta.calcularDensidadPlaneta();
        System.out.println("La densidad es:" + densidad + "g/cc");

    }
}
