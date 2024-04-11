/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examencliente2;

import Controlador.Controlador;
import Modelo.CitaMedica;
import Modelo.Modelo;
import Modelo.Medico;
import Vista.Citas;

/**
 *
 * @author alext
 */
public class ExamenCliente2 {


    public static void main(String[] args) {
        Modelo model = new Modelo();
        Citas view = new Citas();
        Controlador controller = new Controlador(model, view);

        // Ejemplo: Agregar datos al modelo
        Medico jefe1 = new Medico("Juan Romero", "109858663");
        Medico jefe2 = new Medico("Sofia Tames", "30652745");
        model.agregarMedico(jefe1);
        model.agregarMedico(jefe2);

        model.agregarCita(new CitaMedica("15/08/2025", "15:30", "Andres Chavez", jefe1));
        model.agregarCita(new CitaMedica("06/07/2023", "13:00", " Kennedy Rocha", jefe2));
        model.agregarCita(new CitaMedica("02/04/2022", "09:00", "Johan Venegas", jefe2));
    }
}

