package org.rubenfernandez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ColaPrioridadTest {

    @Test
    void anadirProceso() {
        ArrayList<Proceso> cola =new ArrayList<>();
        UUID uuid=UUID.randomUUID();
        Proceso p=new Proceso(uuid,"p1",100,7);
        cola.add(p);
        assertTrue(cola.contains(p));
        assertEquals(1,cola.size());





        

    }

    @Test

    void ordenarCola() {
            ArrayList<Proceso> cola = new ArrayList<>();
            UUID uuid1 = UUID.randomUUID();
            UUID uuid2 = UUID.randomUUID();
            Proceso p1 = new Proceso(uuid1, "p1", 100, 7);
            Proceso p2 = new Proceso(uuid2, "p2", 100, 8);
            assertTrue( p1.prioridad<= p2.prioridad);
        }


    @Test
    void elimiarProceso() {

        ArrayList <Proceso> cola = new ArrayList<>();
        UUID uuid1=UUID.randomUUID();
        UUID uuid2=UUID.randomUUID();
        UUID uuid3=UUID.randomUUID();
        UUID uuid4=UUID.randomUUID();
        cola.add(new Proceso (uuid1,"P1",100,8) );
        cola.add(new Proceso(uuid2,"P2",70,7) );
        cola.add(new Proceso(uuid3,"P3",56,7) );
        cola.add(new Proceso(uuid4,"P4",54,7) );
        cola.remove(0);
        assertFalse(cola.contains(uuid1));
        assertEquals(3,cola.size());

    }

    @Test
    void ejecutarProceso() {
        ArrayList<Proceso> cola=new ArrayList<>();
        UUID uuid1=UUID.randomUUID();
        Proceso p=new Proceso(uuid1,"p1",1,7);
        cola.add(p);
        p.quantum--;
        if(p.quantum==0){
            cola.remove(p);
        }
        assertEquals(0,cola.size());

    }



}