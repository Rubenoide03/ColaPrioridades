package org.rubenfernandez;

import java.util.ArrayList;
import java.util.*;


public class ColaPrioridad {
    ArrayList<Proceso> cola = new ArrayList<>();

    public ColaPrioridad(int capacidad) {
        for (int i = 0; i < capacidad; i++) {
            UUID uuid = UUID.randomUUID();
            String nombre = "P" + (i);
            int quantum = (int) (Math.random() * 99) + 1;
            int prioridad = (int) (Math.random() * 9);
            Proceso p = new Proceso(uuid, nombre, quantum, prioridad);
            cola.add(p);


        }
        ordenarCola();
    }

    void anadirProceso(Proceso p) {
        cola.add(p);
        ordenarCola();

    }

    void ordenarCola() {
        cola.sort(Comparator.comparingInt(proceso -> proceso.prioridad));
    }

    Proceso elimiarProceso() {
        return cola.remove(0);


    }

    void ejecutarProceso() {

        while (!cola.isEmpty()) {

            Proceso p = elimiarProceso();
            p.quantum--;
            if (p.quantum > 0) {
                anadirProceso(p);


            }


        }
    }


    public static void main(String[] args) {
        ColaPrioridad colaPrioridad = new ColaPrioridad(50);
        colaPrioridad.ejecutarProceso();


    }


}