/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class NodoJugadorP {
        Object valor;
        NodoJugadorP siguiente;
    
    public NodoJugadorP(Object valor){
        this.valor=valor;
        this.siguiente=null;
    }
    public Object verValor(){
        return valor;
    }
    public void apuntar(NodoJugadorP n){
        siguiente=n;
    }
    public NodoJugadorP verSiguiente(){
        return siguiente;
    }
    
}
