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
    protected Inquilino inquilino;

    public Inmueble(String NombreBarrio, int estrato, double valorArriendo, int areaConstruida) {
        this.NombreBarrio = NombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
        this.Id++;
        this.inquilino=null;
    }
      public Inmueble(int Id,String NombreBarrio, int estrato, double valorArriendo, int areaConstruida) {
        this.NombreBarrio = NombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
        this.Id=Id;
        this.inquilino=null;
    }
public void setInquilino(Inquilino inquilino){
this.inquilino=inquilino;
}  
public boolean Desocupado(){
if(this.inquilino==null){
return true;
}else{
return false;
}
}
    public int getId() {
        return Id;
    }
    public abstract String darInformacion();
    
    
    
    
}
