/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class NodoPlantas {
   NodoPlantas siguiente;
   NodoPlantas anterior;
   
   Object valor,nombre,ataque,tipo,defensa;
   
   public NodoPlantas(Object valor,Object nombre,Object ataque,Object tipo,Object defensa,NodoPlantas ant, NodoPlantas sig){
       this.valor=valor;
       this.nombre=nombre;
       this.ataque=ataque;
       this.tipo=tipo;
       this.defensa=defensa;
       this.anterior=ant;
       this.siguiente=sig;
   }
   public NodoPlantas getSiguiente(){
       return siguiente;
   }
   public void setSiguiente(NodoPlantas siguiente){
       this.siguiente=siguiente;
   }
   public NodoPlantas getAnterior(){
       return anterior;
   }
   public void setAnterior(NodoPlantas anterior){
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
