/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacola;

import java.util.Scanner;

/**
 *
 * @author manff
 */
public class Colaprog {
    
    public static void main(String[] args) {
        ColaLista simple = new ColaLista();
        int casos = 0;
        Scanner scanner = new Scanner(System.in);
        int select;
        while(casos != 5){
            try{
                System.out.println("Seleccione que desea hacer");
                System.out.println("1. Insertar dato \n2. Eliminar Dato \n3. Cola vacia \n4. Frente de la cola \n5. Salir");
                casos = scanner.nextInt();
                
                switch(casos){
                    case 1:
                        System.out.println("Escriba el dato a agregar");
                        select = scanner.nextInt();
                        simple.insertar(select);
                        simple.imprimir();
                        break;
                        
                    case 2:
                        if (!simple.colaVacia()) {
                            System.out.println("El elemento es " + simple.quitar());
                            simple.imprimir();
                        }else{
                            System.out.println("La cola esta vacia " + simple.quitar());
                            simple.imprimir();
                        }
                        break;
                    case 3:
                        if (simple.colaVacia()) {
                            System.out.println("La cola esta vacia " + simple.colaVacia());
                            simple.imprimir();
                        }else{
                            System.out.println("La cola no esta vacia " + simple.colaVacia());
                            simple.imprimir();
                        }
                        break;
                    case 4:
                        if (!simple.colaVacia()) {
                            System.out.println("Frente de la cola " + simple.InicioCola());
                            simple.imprimir();
                        }else{
                            System.out.println("La cola esta vacia " +simple.colaVacia());
                            simple.imprimir();
                        }
                        break;
                    case 5:
                        System.out.println("bye!!!");
                        break;
                }
            }catch(Exception e){
                System.out.println("ups error xd");
            }
        }
    }
}
