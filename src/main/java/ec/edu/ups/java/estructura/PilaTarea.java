/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.estructura;

import java.util.Stack;

/**
 *
 * @author aroon
 */
public class PilaTarea<T> {
    private Stack<Tarea<T>> pilasTareas;
    
    public PilaTarea() {
        pilasTareas = new Stack();
    }
    public void agregarTarea(Tarea<T> tarea){
        pilasTareas.push(tarea);
    }
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProcesar = pilasTareas.pop();
        return tareaProcesar;
    }
    public Tarea<T> procesarTareaCola(){
        Tarea<T> tareaProcesar = pilasTareas.pop();
        return tareaProcesar;
    }
    public boolean estaVacia(){
        return pilasTareas.isEmpty();
    }
}
