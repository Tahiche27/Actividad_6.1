/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clases;

/**
 *
 * @author tahic
 */
public class Astros {

  
    
   private String nombre; 
   private double masa;
   private double diametro;
   private double rotacion;
   private double traslacion;
   private double distancia; 
   private double gravedad;


  // public Astros(){ }

        public Astros(String nombre,double masa, double diametro, double rotacion, double traslacion, double distancia, double gravedad){
            
            this.nombre= nombre;
            this.masa = masa;
            this.diametro = diametro;
            this.rotacion = rotacion;
            this.traslacion = traslacion;
            this.distancia = distancia;
            this.gravedad = gravedad;

        }
    public String getNombre(){return this.nombre;}
    public double getMasa(){ return this.masa;}
    public double getDiametro(){ return this.diametro;}
    public double getRotacion(){ return this.rotacion;}
    public double getTraslacion(){ return this.traslacion;}
    public double getDistancia(){ return this.distancia;}
    public double getGravedad(){ return this.gravedad;}

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setMasa(double masa){ this.masa = masa;}
    public void setDiametro(double diametro){ this.diametro = diametro;}
    public void setRotacion(double rotacion){ this.rotacion = rotacion;}
    public void setTraslacion(double traslacion){ this.traslacion = traslacion;}
    public void setDistancia(double distancia){ this.distancia = distancia;}
    public void setGravedad(double gravedad){ this.gravedad = gravedad;}
    
    
    public void Muestra(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Masa: " + this.masa + " kg");
        System.out.println("Diametro: " + this.diametro + " km");
        System.out.println("Periodo de rotacion: " + this.rotacion + " km");
        System.out.println("Periodo de traslacion: " + this.traslacion + " km");
        System.out.println("Distancia media de: " + this.distancia + " horas");
        System.out.println("Gravedad: " + this.gravedad + "m/s2");
    
    }
    
}
