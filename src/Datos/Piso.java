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
public class Piso extends Inmueble {
private int NumeroOficinas;
private ArrayList<Oficina>oficinas;
    public Piso(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,int numeroficinas) {
        super(Id, NombreBarrio, estrato, valorArriendo, areaConstruida);
        this.NumeroOficinas=numeroficinas;
        this.oficinas=new ArrayList<>();
    }

    @Override
    public String darInformacion() {
       String cadena=" Piso  Id: "+this.Id+" Barrio: "+this.NombreBarrio+" estrato: "+this.estrato+" Arriendo: "+this.valorArriendo+" area: "+this.areaConstruida+" NumeroOficinas: "+this.NumeroOficinas+"\n";
       if(this.oficinas.size()==0){
       return cadena;
       } else{
       cadena+="A continuacion se enuncian las oficinas que pertenecen a este piso:\n";
       for(Oficina o:this.oficinas){
       cadena+=o.darInformacion();
       }
       cadena+="--------------------------------\n";
       }
       return cadena;
    }
    public void AddOficina(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,String Tipo){
    this.oficinas.add(new Oficina(Id,NombreBarrio,estrato, valorArriendo, areaConstruida, Tipo));
    
    }
    public int getNumeroOficinas(){
    return this.NumeroOficinas;
    }
}
