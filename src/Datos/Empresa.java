/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    ArrayList<Inmueble>inmuebles;

    public Empresa() {
        this.inmuebles = new ArrayList<>();
    }
    public void AddInmueble(Inmueble inmueble){
    this.inmuebles.add(inmueble);
    
    
    }

}
