/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class ListaJugadorZ {
     NodoJugadorZ cabeza;
    int tamaño;
        public ListaJugadorZ(){
            
            cabeza=null;
            tamaño=0;
            
            
            
        }
        public Object Obtener(int indice){
            int contador=0;
            NodoJugadorZ temporal=cabeza;
            
            while(contador<indice){
                
                temporal=temporal.verSiguiente();
                contador++;
                
                }
            return temporal.verValor();
        }
        public void InsertarPrimero(Object ob){
            if(cabeza==null){
                cabeza=new NodoJugadorZ(ob);}
            else{
                NodoJugadorZ temp=cabeza;
                NodoJugadorZ nuevo=new NodoJugadorZ(ob);
                nuevo.apuntar(temp);
                cabeza=nuevo;
                
               
                }
            tamaño++;
        }
        
        public int Largo(){
            return tamaño;
        }
            
        
        public boolean EstaVacia(){
            
        return (cabeza==null)?true:false;
        
        }
    
}
