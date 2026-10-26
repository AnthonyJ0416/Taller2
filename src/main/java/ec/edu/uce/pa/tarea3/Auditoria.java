package ec.edu.uce.pa.tarea3;

import java.util.UUID;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Auditoria {

    private final String id;

    public Auditoria() {
        this.id = UUID.randomUUID().toString();
    }

    public void registrar(String operacion) {
        System.out.println("Auditoria UUID: " + this.id + "] " + operacion);
    }

    public String getId() {
        return id;
    }
}
