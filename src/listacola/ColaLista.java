/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacola;

/**
 *
 * @author manff
 */
public class ColaLista {
    NodoCola inicio,fin;
    int tam;
    
    public ColaLista(){
        inicio = fin = null;
        tam = 0;
    }
    
    public boolean colaVacia(){
        return (inicio == null);
    }
    
    public void insertar (int elemento){
        NodoCola a;
        a = new NodoCola (elemento);
        if (colaVacia()) {
            inicio = a;
        }else {
            fin.siguiente = a;
        }
        fin = a;
        tam++;
    }
    
    public int quitar(){
        int aux = inicio.elemento;
        inicio = inicio.siguiente;
        tam--;
        return aux;
    }
    
    public int sizeCola(){
        return tam;
    }
    
    public void borrarCola(){
        for (; inicio != null;) {
            inicio = inicio.siguiente;
        }
        System.gc();
    }
    
    public int InicioCola (){
        return (inicio.elemento);
    }
    
    public void imprimir (){
        NodoCola reco = inicio;
        
        System.out.println("Elementos en la cola: ");
        
        while (reco != null){
            System.out.print(reco.elemento + " - ");
            reco = reco.siguiente;
        }
        System.out.println();
    }
    
}
