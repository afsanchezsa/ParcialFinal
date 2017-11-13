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
public class Local extends Inmueble {
    private String descripcion;
    private boolean viaPrincipal;

    public Local(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,String descripcion,boolean viaPrincipal) {
        super(Id, NombreBarrio, estrato, valorArriendo, areaConstruida);
    this.descripcion=descripcion;
    this.viaPrincipal=viaPrincipal;
    
    }

    @Override
    public String darInformacion() {
       return  "Local Id: "+this.Id+" Barrio: "+this.NombreBarrio+" estrato: "+this.estrato+" Arriendo: "+this.valorArriendo+" area: "+this.areaConstruida+" Descripcion: "+this.descripcion+" ViaPrincipal: "+this.viaPrincipal+"\n";
    }
     
}
