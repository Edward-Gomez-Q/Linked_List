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
public class Person implements Comparable{
    private String firstname;
    private String lastname;
    
    public Person (String firstname, String lastname ){
        this.firstname=firstname;
        this.lastname=lastname;
    }
    
    public double compareTo(Object object)
    {
        if(object!= null && object instanceof Person)
        {
            Person other =(Person)object;
            char myFirstChar = this.lastname.charAt(0);
            char otherFirstChar = other.lastname.charAt(0);
            return (-otherFirstChar+myFirstChar)+1;
        } else{
            throw new RuntimeException("Se intento comparar un objeto diferente de Person");
        }
        
    }

    @Override
    public String toString() {
        return  this.firstname + " " + this.lastname;
    }
    @Override
    public boolean equals (Object obj){
        boolean result=false;
        if(obj != null && obj instanceof Person)
        {
            Person other =(Person) obj;
            if(this.getFirstname().equals(other.getFirstname()) && this.getLastname().equals(other.getLastname()))
            {
                result=true;
            }
            
        }
        return result;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
