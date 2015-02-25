/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class ListaPlantas {
     NodoPlantas inicio;
     NodoPlantas fin;
     
     public ListaPlantas(){
            inicio=null;
            fin=null;}
     
     public void InsertarInicio(Object valor,Object nombre,Object ataque,Object tipo,Object defensa){
            if(inicio==null){
                inicio=new NodoPlantas(valor,nombre,ataque,tipo,defensa,null,null);
                fin=inicio;
            }
            else{
                NodoPlantas nuevo=new NodoPlantas(valor,nombre,ataque,tipo,defensa,null,inicio);
                inicio.setAnterior(nuevo);
                inicio=nuevo;
                
            }
     }
     public void InsertarFin(Object valor,Object nombre,Object ataque,Object tipo,Object defensa){
                if(inicio==null){
                fin=new NodoPlantas(valor,nombre,ataque,tipo,defensa,null,null);
                inicio=fin;
            }
            else{
                NodoPlantas nuevo=new NodoPlantas(valor,nombre,ataque,tipo,defensa,null,inicio);
                fin.setAnterior(nuevo);
                fin=nuevo;
                
            }
            }
}
