/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

/**
 *
 * @author MariaJose
 */
public class ListaPila {
    NodoPila inicio;
     NodoPila fin;
     public int tamanio;
     
     public ListaPila(){
            inicio=null;
            fin=null;}
   public Boolean Modificar(Object valor,Object nombre,Object ataque,Object tipo,Object defensa){
        NodoPila temp=inicio;
        while(temp!=null){
                if(temp.getNombre().equals(nombre)){
                    temp.setNombre(nombre);
                    temp.setValor(valor);
                    temp.setAtaque(ataque);
                    temp.setTipo(tipo);
                    temp.setDefensa(defensa);
                        return true;}
        temp=temp.siguiente;
       }
        return false;
   }
   
     

     public void InsertarFin(Object valor,Object nombre,Object ataque,Object tipo,Object defensa){
                if(inicio==null){
                fin=new NodoPila(valor,nombre,ataque,tipo,defensa,null,null);
                inicio=fin;
            }
            else{
                NodoPila nuevo=new NodoPila(valor,nombre,ataque,tipo,defensa,fin,null);
                fin.setSiguiente(nuevo);
                fin=nuevo;
                
            }
                tamanio++;
    }

    
        public String ExtraerFin(){
            Object valor=fin.getValor();
            fin=fin.getAnterior();
                if(inicio!=null){
                    fin.setSiguiente(null);}
                else{
                    inicio=null;}
                tamanio--;
            return valor.toString();
    }
      
        
        public Boolean Eliminar(Object dato){
             NodoPila temp=inicio;
             int contador=-1;
             while(contador<tamanio){
                 contador++;
                 

                 if(temp.getNombre().equals(dato)){
                            if(contador==0){
                                                    inicio=inicio.getSiguiente();
                                                    if(inicio!=null){
                                                                    inicio.setAnterior(null);}
                                                    else{
                                                                    fin=null;}
                                                                    tamanio--;
                                                                    return true;}
                            else if(contador==tamanio-1){
                                                    fin=fin.getAnterior();
                                                    if(inicio!=null){
                                                                    fin.setSiguiente(null);}
                                                    else{
                                                                    inicio=null;}
                                                                    tamanio--;
                                                                    return true;}
                            else{
                                                                    NodoPila temp2=temp.siguiente;
                                                                    NodoPila temp3=temp.anterior;
                                                                    temp2.setAnterior(temp3);
                                                                    temp3.setSiguiente(temp2);
                                                                    tamanio--;
                                                                    return true;}}

                                                                    temp=temp.siguiente;}

                                                                    
                  return false;
               
       
        
        }
        public void MostrarAtras(){
            NodoPila temp=fin;
            while(temp!=null){
                    System.out.println(temp.getNombre());
                    System.out.println(temp.getAtaque());
                    System.out.println(temp.getDefensa());
                    System.out.println(temp.getTipo());
                    System.out.println(temp.getValor());
                    System.out.println("=====================================");
                    temp=temp.getAnterior();
         
            }
        }   
}
