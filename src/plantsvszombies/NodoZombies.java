/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class NodoZombies {
Object valor,nombre,ataque,tipo,defensa;
        NodoZombies siguiente;
    
    public NodoZombies(Object valor,Object nombre, Object ataque, Object tipo,Object defensa){
        this.valor=valor;
        this.nombre=nombre;
        this.ataque=ataque;
        this.tipo=tipo;
        this.defensa=defensa;
        this.siguiente=null;
    }
    public Object verValor(){
        return valor;
    }
    public Object verNombre(){
        return nombre;
    }
    public Object verAtaque(){
        return ataque;
    }
    public Object verTipo(){
        return tipo;
    }
    public Object verDefensa(){
        return defensa;
    }
    public void apuntar(NodoZombies n){
        siguiente=n;
    }
    public NodoZombies verSiguiente(){
        return siguiente;
    }
    
}
