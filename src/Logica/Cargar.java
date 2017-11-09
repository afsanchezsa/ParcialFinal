/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Edificio;
import Datos.Inmueble;
import Datos.Local;
import Datos.Oficina;
import Datos.Piso;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Cargar {
    private ArrayList<Inmueble>inmuebles;
    Scanner entrada;
    public Cargar() throws FileNotFoundException {
        this.inmuebles=new ArrayList<>();
        File archivo=new File("Finca.txt");
        if(archivo.exists()){
          this.entrada=new Scanner(archivo);
          this.entrada.useDelimiter(",");
          while(entrada.hasNext()){
          String Tipo=entrada.next().trim();
              
          if(Tipo.equals("P")){
          int Id=entrada.nextInt();
          String nombrebarrio=entrada.next();
          int estrato=entrada.nextInt();
          double arriendo=entrada.nextDouble();
            int area=entrada.nextInt();
            
          int numerooficinas=entrada.nextInt();
          this.inmuebles.add(new Piso(Id, nombrebarrio, estrato, arriendo, area, numerooficinas));
              System.out.println("fgf");
          
          }else if(Tipo.equals("O")){
          int Id=entrada.nextInt();
          String nombrebarrio=entrada.next();
          int estrato=entrada.nextInt();
          double arriendo=entrada.nextDouble();
            int area=entrada.nextInt();
            String modo=entrada.next();
          this.inmuebles.add(new Oficina( Id, nombrebarrio, estrato, arriendo, area, Tipo));
          
          
          }else if(Tipo.equals("E")){
           int Id=entrada.nextInt();
          String nombrebarrio=entrada.next();
          int estrato=entrada.nextInt();
          double arriendo=entrada.nextDouble();
            int area=entrada.nextInt();
            String Propietario=entrada.next();
          this.inmuebles.add(new Edificio(Id, nombrebarrio, estrato, arriendo, area, Propietario));
          
          }else if(Tipo.equals("L")){
          
           int Id=entrada.nextInt();
          String nombrebarrio=entrada.next();
          int estrato=entrada.nextInt();
          double arriendo=entrada.nextDouble();
            int area=entrada.nextInt();
            String descripcion=entrada.next();
            boolean viaPrincipal=entrada.nextBoolean();
            this.inmuebles.add(new Local(Id, nombrebarrio, estrato, arriendo, area, descripcion, viaPrincipal));
          }
          
          
          
          
          
          
          }
          
        
        }else{
            System.out.println("ghgh");
        }
        
        
      
        
        
        
        
        
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }
    
    public String ListarInformacion(){
    String info="";
    for(Inmueble i:this.inmuebles){
    info+=i.darInformacion();
    
    
    
    }
            return info;
    
    
    
    
    
    }
    
    
}
