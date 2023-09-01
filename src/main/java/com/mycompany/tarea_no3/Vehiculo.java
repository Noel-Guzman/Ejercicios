/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_no3;

/**
 *
 * @author fauri
 */
public class Vehiculo {
    
    protected String marca;
    
  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public void arrancar (){
        System.out.println("el vehiculo esta en movimiento");
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }


  
    
}
