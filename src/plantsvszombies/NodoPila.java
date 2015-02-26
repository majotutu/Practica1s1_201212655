/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class NodoPila {
    NodoPila siguiente;
   NodoPila anterior;
   
   Object valor,nombre,ataque,tipo,defensa;
   
   public NodoPila(Object valor,Object nombre,Object ataque,Object tipo,Object defensa,NodoPila ant, NodoPila sig){
       this.valor=valor;
       this.nombre=nombre;
       this.ataque=ataque;
       this.tipo=tipo;
       this.defensa=defensa;
       this.anterior=ant;
       this.siguiente=sig;
   }
   public NodoPila getSiguiente(){
       return siguiente;
   }
   public void setSiguiente(NodoPila siguiente){
       this.siguiente=siguiente;
   }
   public NodoPila getAnterior(){
       return anterior;
   }
   public void setAnterior(NodoPila anterior){
       this.anterior=anterior;
   }
   public Object getValor(){
        return valor;
    }
   public Object getNombre(){
        return nombre;
    }
   public Object getAtaque(){
        return ataque;
    }
   public Object getTipo(){
        return tipo;
    }
   public Object getDefensa(){
        return defensa;
    }
   public void setValor(Object valor){
        this.valor=valor;
    }
   public void setNombre(Object nombre){
        this.nombre=nombre;
    }
   public void setAtaque(Object ataque){
        this.ataque=ataque;
    }
   public void setTipo(Object tipo){
        this.tipo=tipo;
    }
   public void setDefensa(Object defensa){
        this.defensa=defensa;
    }
    
}
