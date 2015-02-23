/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class NodoJugadorZ {
        Object valor;
        NodoJugadorZ siguiente;
    
    public NodoJugadorZ(Object valor){
        this.valor=valor;
        this.siguiente=null;
    }
    public Object verValor(){
        return valor;
    }
    public void apuntar(NodoJugadorZ n){
        siguiente=n;
    }
    public NodoJugadorZ verSiguiente(){
        return siguiente;
    }
    
}
