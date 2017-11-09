/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Estudiante
 */
public abstract class Inmueble {
    protected int Id=0;
    protected String NombreBarrio;
    protected int estrato;
    protected double valorArriendo;
    protected int areaConstruida;

    public Inmueble(String NombreBarrio, int estrato, double valorArriendo, int areaConstruida) {
        this.NombreBarrio = NombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
        this.Id++;
    }
      public Inmueble(int Id,String NombreBarrio, int estrato, double valorArriendo, int areaConstruida) {
        this.NombreBarrio = NombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
        this.Id=Id;
    }
    public abstract String darInformacion();
    
    
    
    
}
