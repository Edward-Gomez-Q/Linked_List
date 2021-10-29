/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.adt;

/**
 *
 * @author HP
 */
public class Planet implements Comparable {
    private String name;
    private double radius;
    public Planet (String name, double radius){
        this.name=name;
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Planet[ "  + this.name + " - "+this.radius + ']';
    }
    @Override
    public boolean equals (Object obj){
        
        boolean result=false;
        //verificamos que no sea nulo y que sea instancia de planet
        if(obj != null && obj instanceof Planet)
        {
            Planet other=(Planet)obj;
            if(this.getName().equals(other.getName()) && this.radius == other.radius)
            {
                result=true;
            }
        }
        return result;
    }
    public double  compareTo(Object object){
        if(object!=null && object instanceof Planet)
        {
            Planet other =(Planet)object;
            return other.radius/this.radius;
        }
        else
        {
            throw new RuntimeException("Se intento comparar un objeto diferente de Planet");
        }
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}
