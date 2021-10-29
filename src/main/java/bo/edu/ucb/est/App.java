package bo.edu.ucb.est;

import bo.edu.ucb.est.adt.Dummy;
import bo.edu.ucb.est.adt.LinkedList;
import bo.edu.ucb.est.adt.Node;
import bo.edu.ucb.est.adt.Planet;
import bo.edu.ucb.est.adt.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Planet tierra= new Planet ("Tierra", 5.6);
        Planet jupiter= new Planet ("Jupiter", 15.6);
        Planet marte= new Planet ("Marte", 6.3);
        Planet urano= new Planet ("Urano", 4.2);
        System.out.println(tierra.compareTo(marte));
        System.out.println(marte.compareTo(jupiter));
        System.out.println(jupiter.compareTo(urano));
        
        LinkedList<Planet> listaP = new LinkedList<>();
        listaP.add(marte);
        listaP.add(tierra);
        listaP.add(jupiter);
        listaP.add(urano);
        listaP.print();
        System.out.println( "================" );
        
        Person juan = new Person ("Juan", "Perez");
        Person maria = new Person ("Maria", "Gomez");
        Person melany = new Person ("Melany", "Kaune");
        Person ramiro = new Person ("Ramiro", "Bravo");
        Person roberto = new Person ("Roberto", "Alanoca");
        Person natalia = new Person ("Natalia", "Argandoña");
        Person manuel = new Person ("Manuel", "Segaline");
        Person paola = new Person ("Paola", "Quisbert");
        Person jareth = new Person ("Jareth", "Dzuik");
        System.out.println(juan.compareTo(maria));
        System.out.println(ramiro.compareTo(roberto));
        System.out.println(roberto.compareTo(melany));
        
        System.out.println( "================" );
        
        LinkedList<Person> listaPersonas = new LinkedList<>();
        listaPersonas.add(juan);
        listaPersonas.add(maria);
        listaPersonas.add(melany);
        listaPersonas.add(ramiro);
        listaPersonas.add(roberto);
        //Roberto Alanoca -> Ramiro Bravo -> Maria Gomez -> Melany Kaune -> Juan Perez
        listaPersonas.print();
        listaPersonas.add(natalia);
        listaPersonas.add(paola);
        listaPersonas.add(manuel);
        listaPersonas.add(jareth);
        listaPersonas.print();
        listaPersonas.delete(melany);
        System.out.println( listaPersonas.get(2));//Maria Gomez
        listaPersonas.print();
        //Roberto Alanoca -> Ramiro Bravo -> Maria Gomez -> Juan Perez
        listaPersonas.get(8);//Terminar programa

    }
}
