package org.rubenfernandez;
import java.time.LocalDate;

import java.util.UUID;

public class Proceso {
    UUID uuid;
    String nombre;
    LocalDate tiempoCreacion;
    LocalDate tiempoModificacion;
    int quantum;
    int prioridad;

    @Override
    public String toString() {
        return "Proceso{" +
                "uuid=" + uuid +
                ", nombre='" + nombre + '\'' +
                ", tiempoCreacion=" + tiempoCreacion +
                ", tiempoModificacion=" + tiempoModificacion +
                ", quantum=" + quantum +
                ", prioridad=" + prioridad +
                '}';
    }

    public Proceso(UUID uuid, String nombre,  int quantum, int prioridad) {
        this.uuid = uuid;
        this.nombre = nombre;
        tiempoCreacion=LocalDate.now();
        tiempoModificacion=LocalDate.now();
        this.quantum = quantum;
        this.prioridad = prioridad;
    }
}