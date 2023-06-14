/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.estructura;

/**
 *
 * @author aroon
 */
public class JavaEstructura {

    public static void main(String[] args) {
         System.out.println("Colas y Pilas implemaentacion generica");
        //Intancia de las clases 
        ColaTarea<String> colaTarea = new ColaTarea<>();
        ColaTarea<Integer> colaTareaInt = new ColaTarea<>();
        ColaTarea<int[]> colaTareArregloEntero = new ColaTarea<>();
        ColaTarea<String[]> colaTareaArregloSring = new ColaTarea<>();
        //Clases PilasTarea
        PilaTarea<Integer> pilaTareas = new PilaTarea<>();
        PilaTarea<ColaTarea> pilaTareasDePilas = new PilaTarea<>();
        //Insercion de tareas Cola
        colaTarea.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTarea.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTarea.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTarea.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTarea.agregarTarea(new Tarea(5, "Tarea 5"));
        //Colaint
        colaTareaInt.agregarTarea(new Tarea(1,1));
        colaTareaInt.agregarTarea(new Tarea(2,2));
        colaTareaInt.agregarTarea(new Tarea(3,3));
        //ColaArregloint
        Tarea<int[]> t2= new Tarea(8,new int[]{4,7});
        colaTareArregloEntero.agregarTarea(t2);
        Tarea<int[]> t3= new Tarea(9,new int[]{14,8});
        colaTareArregloEntero.agregarTarea(t3);
        Tarea<int[]> t4= new Tarea(10,new int[]{2,9});
        colaTareArregloEntero.agregarTarea(t4);
        //ColaArregloString
        Tarea<String[]> s2= new Tarea(10,new String[]{"juan","pepito"});
        colaTareaArregloSring.agregarTarea(s2);
        Tarea<String[]> s3= new Tarea(14,new String[]{"","pepito"});
        colaTareaArregloSring.agregarTarea(s3);
        Tarea<String[]> s4= new Tarea(16,new String[]{"luis","miguel"});
        colaTareaArregloSring.agregarTarea(s4);
        //Insercion de tareas a la pila
        pilaTareas.agregarTarea(new Tarea(6,6));
        pilaTareas.agregarTarea(new Tarea(7,7));
        pilaTareas.agregarTarea(new Tarea(8,8));
        //Insercion de pilas en colas
        pilaTareasDePilas.agregarTarea(new Tarea(1,12));
        //Procesar las tareas de la Cola<String>
        while(!colaTarea.estaVacia()){
        Tarea<String> tareaProcesar = colaTarea.procesarTarea();
            System.out.println("Procesando tarea de la cola\n\t sale-->"+tareaProcesar.getId()+"-"+tareaProcesar.getAtributo());
        }
        
        //Separar
        System.out.println("\n----------------\n");
        //Procesar las tareas de la Pila<Integer>
         while(!pilaTareas.estaVacia()){
        Tarea<Integer> tareaProcesar = pilaTareas.procesarTarea();
            System.out.println("Procesando tarea de la cola\n\t sale-->"+tareaProcesar.getId()+"-"+tareaProcesar.getAtributo());
        }
    }
}
