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
public class Oficina extends Inmueble {
private String Tipo;

    public Oficina(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,String Tipo) {
        super(Id, NombreBarrio, estrato, valorArriendo, areaConstruida);
        this.Tipo=Tipo;
    }

    @Override
    public String darInformacion() {
       return "Oficina Id: "+this.Id+" Barrio: "+this.NombreBarrio+" estrato: "+this.estrato+" Arriendo: "+this.valorArriendo+" area: "+this.areaConstruida+" Tipo: "+this.Tipo+"\n";
    }
    
}
