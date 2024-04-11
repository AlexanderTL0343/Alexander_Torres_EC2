/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alext
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private String nombrePaciente;
    private Medico medicoJefe;
    private boolean recibida;

    public CitaMedica(String fecha, String hora, String nombrePaciente, Medico medicoJefe) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombrePaciente = nombrePaciente;
        this.medicoJefe = medicoJefe;
        this.recibida = false;
    }

    public void setRecibida(boolean recibida) {
        this.recibida = recibida;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public Medico getMedicoJefe() {
        return medicoJefe;
    }

    public boolean isRecibida() {
        return recibida;
    }

    @Override
    public String toString() {
        return fecha + " - " + hora + " - " + nombrePaciente + (recibida ? " (Recibida)" : "");
    }
}
