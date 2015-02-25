/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class ListaZombies {
    
   NodoZombies cabeza;
    int tamaño;
        public ListaZombies(){
            
            cabeza=null;
            tamaño=0;
            
            
            
        }
        public Object Obtener(int indice){
            int contador=0;
            NodoZombies temporal=cabeza;
            
            while(contador<indice){
                
                temporal=temporal.verSiguiente();
                contador++;
                
                }
            return temporal.verNombre();
        }
        public void InsertarPrimero(Object ob,Object ob1,Object ob2,Object ob3,Object ob4){
            if(cabeza==null){
                cabeza=new NodoZombies(ob,ob1,ob2,ob3,ob4);}
            else{
                NodoZombies temp=cabeza;
                NodoZombies nuevo=new NodoZombies(ob,ob1,ob2,ob3,ob4);
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
