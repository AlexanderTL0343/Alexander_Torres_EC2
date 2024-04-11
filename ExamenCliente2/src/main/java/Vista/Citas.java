/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author alext
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Citas extends JFrame {

    private JList<String> citasList;
    private JButton activarButton;
    private JButton recibidaButton;

    public Citas() {
        setTitle("Sistema de Citas Médicas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        citasList = new JList<>();
        panel.add(new JScrollPane(citasList), BorderLayout.CENTER);

        activarButton = new JButton("Activar Jornada de Citas");
        panel.add(activarButton, BorderLayout.NORTH);

        recibidaButton = new JButton("Marcar como recibida");
        panel.add(recibidaButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public void mostrarCitas(String[] citas) {
        citasList.setListData(citas);
    }

    public void agregarActivarListener(ActionListener listener) {
        activarButton.addActionListener(listener);
    }

    public void agregarRecibidaListener(ActionListener listener) {
        recibidaButton.addActionListener(listener);
    }

    public int obtenerCitaSeleccionada() {
        return citasList.getSelectedIndex();
    }
}
