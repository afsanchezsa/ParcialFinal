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
public class Edificio extends Inmueble {
private String propietario;
    public Edificio(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,String Propietario) {
        super(Id, NombreBarrio, estrato, valorArriendo, areaConstruida);
        this.propietario=Propietario;
    }

    @Override
    public String darInformacion() {
        return "Id:"+this.Id+"Barrio:"+this.NombreBarrio+"estrato:"+this.estrato+"Arriendo"+this.valorArriendo+"area"+this.areaConstruida+"Propietario:"+propietario;
    }

    
    
    

    
}
