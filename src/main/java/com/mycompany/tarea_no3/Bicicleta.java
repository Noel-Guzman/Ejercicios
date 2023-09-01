/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_no3;

/**
 *
 * @author fauri
 */
public class Bicicleta extends Vehiculo implements Conducible, Trasporte {
    
    public Bicicleta(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("La Bicicleta esta en Marcha");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta se detubo");
    }

    @Override
    public void TrasportarPersonas(int cantidad) {
        System.out.println("La bicicleta traspota\t"+cantidad+ "\tpersonas");
    }

    @Override
    public void Carateristicas() {
        
        System.out.println("Carro es de color Azul");
         System.out.println("El modelo del Carro es : 2010 ");
         System.out.println("El Propitari es Pedro");
        
    }
    
    
    
    
    
    
}
