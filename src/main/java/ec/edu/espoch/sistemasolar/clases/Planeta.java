/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemasolar.clases;

import ec.edu.espoch.sistemasolar.enumeraciones.TipoPlaneta;

/**
 *
 * @author SO-LAB-PC6
 */
public class Planeta {

    public String nombre;
    public int cantidadSatelites;
    public float masaKg;
    public float volumenKm3;
    public float diametroKm;
    public float distanciaSol;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior = false;

    //Constructor

    public Planeta(String nombre, int cantidadSatelites, float masaKg, float volumenKm3, float diametroKm, float distanciaSol, TipoPlaneta tipoPlaneta) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masaKg = masaKg;
        this.volumenKm3 = volumenKm3;
        this.diametroKm = diametroKm;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.exterior();
    }
 
    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Cantidad de Satelites" + cantidadSatelites);
        System.out.println("La cantidad de masa en Kilogramos es:" + masaKg + "Km");
        System.out.println("La cantidad de volumen en Km cubicos es:" + volumenKm3 + "Km");
        System.out.println("El diametro en Kilometros es:" + diametroKm + "Km");
        System.out.println("La distancia al Sol es:" + distanciaSol + "Km");
        System.out.println("El tipo de Planeta es:" + tipoPlaneta);
        System.out.println("El diametro es:" + exterior);
    }

    public float calcularDensidadPlaneta() {
        return masaKg / volumenKm3;
    }

    public boolean exterior() {

        double maximo = 3.4;
        double distancia = 149597870;
        double limite = maximo * distancia;

        if (distanciaSol > limite) {
            exterior = true;

        }
        return exterior;
    }
}
