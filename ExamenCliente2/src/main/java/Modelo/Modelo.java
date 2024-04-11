/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alext
 */
import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<CitaMedica> citasMedicas;
    private List<Medico> medicosJefes;

    public Modelo() {
        citasMedicas = new ArrayList<>();
        medicosJefes = new ArrayList<>();
    }

    public void agregarCita(CitaMedica cita) {
        citasMedicas.add(cita);
    }

    public List<CitaMedica> getCitasMedicas() {
        return citasMedicas;
    }

    public void agregarMedico(Medico medico) {
        medicosJefes.add(medico);
    }

    public List<Medico> getMedicosJefes() {
        return medicosJefes;
    }
}

