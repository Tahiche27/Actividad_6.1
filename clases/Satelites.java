/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author tahic
 */
public class Satelites extends Astros {
    
    private String orbitaPlaneta;



    public Satelites(String nombre,double masa, double diametro, double rotacion, double traslacion, double distancia, double gravedad,String orbitaPlaneta) {
        
        super(nombre,masa, diametro, rotacion, traslacion, distancia, gravedad);
        
        this.orbitaPlaneta = orbitaPlaneta;

    }

    public void setOrbita(String orbitaPlaneta) {
        this.orbitaPlaneta = orbitaPlaneta;
    }

    public String getOrbita() {
        return orbitaPlaneta;
    }
    
}
