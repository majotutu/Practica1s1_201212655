/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class ListaJugPlanta {
    public static NodoJugadorP cabeza;
    public static int tamaño;
        public ListaJugPlanta(){
            
            cabeza=null;
            tamaño=0;
            
            
            
        }
        public static Object Obtener(int indice){
            int contador=0;
            NodoJugadorP temporal=cabeza;
            
            while(contador<indice){
                
                temporal=temporal.verSiguiente();
                contador++;
                
                }
            return temporal.verValor();
        }
        public void InsertarPrimero(Object ob){
            if(cabeza==null){
                cabeza=new NodoJugadorP(ob);}
            else{
                NodoJugadorP temp=cabeza;
                NodoJugadorP nuevo=new NodoJugadorP(ob);
                nuevo.apuntar(temp);
                cabeza=nuevo;
                }
            tamaño++;
        }
        
        public static int Largo(){
            return tamaño;
        }
            
        
        public boolean EstaVacia(){
            
        return (cabeza==null)?true:false;
        
        }
        
}
