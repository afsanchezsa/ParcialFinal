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
public class Edificio extends Inmueble {
private String propietario;
private ArrayList<Piso>pisos;
private ArrayList<Local>locales;
    public Edificio(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,String Propietario) {
        super(Id, NombreBarrio, estrato, valorArriendo, areaConstruida);
        this.propietario=Propietario;
       this.pisos=new ArrayList<>();
this.locales=new ArrayList<>();

    }

    @Override
    public String darInformacion() {
       String cadena=" Edificio Id: "+this.Id+" Barrio: "+this.NombreBarrio+" estrato: "+this.estrato+" Arriendo: "+this.valorArriendo+" area: "+this.areaConstruida+" Propietario: "+propietario+"\n";
       if(this.pisos.size()>0){
           cadena+="a continuacion se enuncian los pisos que pertenecen a este edificio \n";
        for(Piso piso:this.pisos){
        
        cadena+=piso.darInformacion();
        }
        cadena+="-------------------------------------------------\n";
       for(Local l:this.locales){
       cadena+=l.darInformacion();
       
       }
       cadena+="--------------------------------------------------\n";
       }        
        return cadena; 
    }
   
    
   public void addPiso(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,int numeroficinas){
   this.pisos.add(new Piso(Id, NombreBarrio, estrato, valorArriendo, areaConstruida, numeroficinas));
   
       
       
   }
public ArrayList<Inmueble>PisosYOficinasLibres(){
ArrayList<Inmueble>inmuebles=new ArrayList<>();
    for(Piso p:this.pisos){
if(p.Desocupado()==true){
inmuebles.add(p);
for(Oficina o:p.getOficinas()){
if(o.Desocupado()==true){
inmuebles.add(o);
}
}
}
}
    return inmuebles;
}
    public String getPropietario() {
        return propietario;
    }
    
    public void addLocal(int Id, String NombreBarrio, int estrato, double valorArriendo, int areaConstruida,String descripcion,boolean viaPrincipal){
    this.locales.add(new Local(Id, NombreBarrio, estrato, valorArriendo, areaConstruida, descripcion, viaPrincipal));
    
    }
    

    
}
