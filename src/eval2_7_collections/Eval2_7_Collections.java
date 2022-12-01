/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author moviles
 */
public class Eval2_7_Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lista
        LinkedList<String> listaEnlazada = new LinkedList();
        listaEnlazada.add("Hola");
        listaEnlazada.add(" ");
        listaEnlazada.add("Mundo");
        listaEnlazada.add("!!");
        System.out.println("");
        System.out.println("linkedList-----------------");
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove(0);
        System.out.println(listaEnlazada);
        listaEnlazada.addFirst("Hola");
        System.out.println(listaEnlazada);
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.print(listaEnlazada.get(i)+" ");
            
        }
        //arraylist
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        System.out.println("");
        System.out.println("ArrayList--------------------");
        System.out.println(arrayList);
        arrayList.add(2,250);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
            
        }
        //queues
        //stack
        //conjuntos
    }
    
}
