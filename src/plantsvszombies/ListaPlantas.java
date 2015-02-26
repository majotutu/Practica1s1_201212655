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
     public int tamanio;
     
     public ListaPlantas(){
            inicio=null;
            fin=null;}
   public Boolean Modificar(Object valor,Object nombre,Object ataque,Object tipo,Object defensa){
        NodoPlantas temp=inicio;
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
            tamanio++;
     }
     public void InsertarFin(Object valor,Object nombre,Object ataque,Object tipo,Object defensa){
                if(inicio==null){
                fin=new NodoPlantas(valor,nombre,ataque,tipo,defensa,null,null);
                inicio=fin;
            }
            else{
                NodoPlantas nuevo=new NodoPlantas(valor,nombre,ataque,tipo,defensa,fin,null);
                fin.setSiguiente(nuevo);
                fin=nuevo;
                
            }
    }
    public String ExtraerInicio(){
            Object valor=inicio.getValor();
            inicio=inicio.getSiguiente();
                if(inicio!=null){
                    inicio.setAnterior(null);}
                else{
                    fin=null;}
                tamanio--;
            return valor.toString();
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
       public Object ObtenerIt(int indice){
            int contador=0;
            NodoPlantas temporal=inicio;
            
            while(contador<indice){
                
                temporal=temporal.siguiente;
                contador++;
                
                }
            return temporal.nombre;
        }
        public void MostrarAdelante(){
            NodoPlantas temp=inicio;
            while(temp!=null){
                    System.out.println(temp.getNombre());
                    temp=temp.getSiguiente();
         
            }
        }
        public NodoPlantas IndiceDar(Object dato){
            NodoPlantas temp=inicio;
            while(temp!=null){
             if(temp.getNombre().equals(dato)){
                return temp;}
             temp=temp.siguiente;
            }
        return null;}
        
        public Boolean Eliminar(Object dato){
             NodoPlantas temp=inicio;
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
                                                                    NodoPlantas temp2=temp.siguiente;
                                                                    NodoPlantas temp3=temp.anterior;
                                                                    temp2.setAnterior(temp3);
                                                                    temp3.setSiguiente(temp2);
                                                                    tamanio--;
                                                                    return true;}}

                                                                    temp=temp.siguiente;}

                                                                    
                  return false;
               
       
        
        }
        public void MostrarAtras(){
            NodoPlantas temp=fin;
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
