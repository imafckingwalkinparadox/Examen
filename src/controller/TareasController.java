package controller;

import services.DataTareas;
import view.TareasView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareasController {

    private DataTareas dataTareas;
    private TareasView view;

    public TareasController(TareasView view, DataTareas dataTareas) {
        this.view = view;
        this.dataTareas = dataTareas;
        inicializarControlador();
    }

    private void inicializarControlador() {
        // Cargar las tareas iniciales en la vista
        actualizarPanelTareas();

        // Botón para agregar una tarea
        view.getBotonAgregar1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevaTarea = view.getCampoTarea1().getText();
                if (!nuevaTarea.isEmpty()) {
                    dataTareas.agregarTarea(nuevaTarea);
                    actualizarPanelTareas(); // Recargar la vista con la nueva tarea
                }
            }
        });

        // Botón para eliminar una tarea
        view.getBotonEliminar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tituloTarea = view.getCampoTarea3().getText();
                dataTareas.eliminarTarea(tituloTarea);
                actualizarPanelTareas(); // Actualizar la vista eliminando la tarea
            }
        });
    }

    private void actualizarPanelTareas() {
        // Limpiar el panel antes de agregar nuevas tareas
        view.getPanelTareas().removeAll();

        for (String tarea : dataTareas.getListaTareas()) {
            JLabel tareaLabel = new JLabel(tarea);
            view.getPanelTareas().add(tareaLabel);
        }

        view.getPanelTareas().revalidate();
        view.getPanelTareas().repaint();
    }
}

