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
public class Piso extends Inmueble {
private int NumeroOficinas;
    public Piso(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,int numeroficinas) {
        super(Id, NombreBarrio, estrato, valorArriendo, areaConstruida);
        this.NumeroOficinas=numeroficinas;
    }

    @Override
    public String darInformacion() {
       return "Id:"+this.Id+"Barrio:"+this.NombreBarrio+"estrato:"+this.estrato+"Arriendo"+this.valorArriendo+"area"+this.areaConstruida+"NumeroOficinas:"+this.NumeroOficinas;
    }
    
}
