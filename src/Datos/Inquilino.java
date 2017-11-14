/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author USUARIO
 */
public class Inquilino {
    private String Nombre;
    private int DNI;
    private int edad;
    private String Sexo;

    public Inquilino(String Nombre, int DNI, int edad, String Sexo) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "Nombre=" + Nombre + ", DNI=" + DNI + ", edad=" + edad + ", Sexo=" + Sexo + '}';
    }
    
}
