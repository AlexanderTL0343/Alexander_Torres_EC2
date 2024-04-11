/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Modelo;
import Modelo.Medico;
import Vista.Citas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */


public class Controlador {
    private Modelo model;
    private Citas view;

    public Controlador(Modelo model, Citas view) {
        this.model = model;
        this.view = view;

        this.view.agregarActivarListener(new ActivarListener());
        this.view.agregarRecibidaListener(new RecibidaListener());

        actualizarVista();
    }
        private void actualizarVista() {
        String[] citas = new String[model.getCitasMedicas().size()];
        for (int i = 0; i < model.getCitasMedicas().size(); i++) {
            citas[i] = model.getCitasMedicas().get(i).toString();
        }
        view.mostrarCitas(citas);
    }

    class ActivarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String usuario = JOptionPane.showInputDialog(view, "Ingrese su nombre:");
            String cedula = JOptionPane.showInputDialog(view, "Ingrese su cédula:");

            boolean verificado = false;
            for (Medico medico : model.getMedicosJefes()) {
                if (medico.getNombre().equals(usuario) && medico.getCedula().equals(cedula)) {
                    verificado = true;
                    break;
                }
            }

            if (verificado) {
                JOptionPane.showMessageDialog(view, "Jornada de citas activada correctamente.");
            } else {
                JOptionPane.showMessageDialog(view, "Usuario no autorizado.");
            }
        }
    }

    class RecibidaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = view.obtenerCitaSeleccionada();
            if (selectedIndex != -1) {
                model.getCitasMedicas().get(selectedIndex).setRecibida(true);
                actualizarVista();
                JOptionPane.showMessageDialog(view, "Cita marcada como recibida.");
            } else {
                JOptionPane.showMessageDialog(view, "Seleccione una cita para marcar como recibida.");
            }
        }
    }
}






       

