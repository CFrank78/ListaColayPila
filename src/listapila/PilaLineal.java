/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listapila;

/**
 *
 * @author manff
 */
public class PilaLineal {
    private NodoPila cima;
    
    public PilaLineal(){
        cima = null;
    }
    
    public boolean pilaVacia(){
        return cima == null;
    }
    
    public void insertar (Object elemento){
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima= nuevo;
    }
    
    public Object quitar() throws Exception{
        if (pilaVacia()) {
            throw new Exception ("Pila vacia, no se puede extraer");
        }
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
    
    public Object cimaPila(){
        return cima.elemento;
    }
    
    public void limpiarPila(){
        NodoPila t;
        while(!pilaVacia()){
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
    
    public void imprimir(){
        NodoPila reco = cima;
        
        System.out.println("Elemento de la lista: ");
        while(reco != null){
            System.out.print(reco.elemento + " - ");
            reco = reco.siguiente;
        }
        System.out.println();
    }
}
