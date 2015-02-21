/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class JugadorPlanta {
public String dato;
public JugadorPlanta siguiente;
            public JugadorPlanta(String Dato, JugadorPlanta sig){
            dato=Dato;
            siguiente=sig;
            }
            
            public JugadorPlanta(String Dato)              //Constructor con parametro dato
    {
            this.dato = Dato;
            this.siguiente = null;
    }
    
            public JugadorPlanta()                      //Constructor sin parametros
    {
            this.dato = "";
            this.siguiente = null;
    }
}
