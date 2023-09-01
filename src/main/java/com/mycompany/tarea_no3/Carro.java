/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_no3;

/**
 *
 * @author fauri
 */
public class Carro extends Vehiculo implements Conducible, Trasporte  {

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(int velocidad) {
        
        System.out.println("El carro esta en Marcha");
       
    }

    @Override
    public void frenar() {
        
        System.out.println("El carro se detubo");
        
    }

    @Override
    public void TrasportarPersonas(int cantidad) {
      
        
        System.out.println("El carro traspota\t"+cantidad+ "\tpersonas");
        
    }

    @Override
    public void Carateristicas() {
        
        
         System.out.println("Carro es de color rojo");
         System.out.println("El modelo del Carro es : 2021 ");
         System.out.println("El Propitari es Juan");
         System.out.println("El Nuemro de Placas es Mc125");
    }
    
 
    
    
    
}
