package view;
import controller.TareasController;
import services.DataTareas;

import javax.swing.*;
import java.awt.*;

public class TareasView extends JFrame {

    private JPanel panelControles;
    private JPanel panelTareas;
    private JTextField campoTarea1;
    private JTextField campoTarea3;
    private JButton botonAgregar1;
    private JButton botonEliminar;

    public TareasView() {
        setTitle("Gestor de Tareas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Panel de controles (Izquierda)
        panelControles = new JPanel();
        panelControles.setLayout(new BoxLayout(panelControles, BoxLayout.Y_AXIS));
        panelControles.setBorder(BorderFactory.createTitledBorder("Controles"));

        // Añadir campos de entrada y botones (diseño vertical)
        campoTarea1 = new JTextField(10);
        botonAgregar1 = new JButton("Agregar");

        campoTarea3 = new JTextField(10);
        botonEliminar = new JButton("Eliminar");

        panelControles.add(new JLabel("Nueva Tarea:"));
        panelControles.add(campoTarea1);
        panelControles.add(botonAgregar1);

        panelControles.add(new JLabel("Eliminar Tarea (por título):"));
        panelControles.add(campoTarea3);
        panelControles.add(botonEliminar);

        // Panel de tareas (Derecha)
        panelTareas = new JPanel();
        panelTareas.setLayout(new BoxLayout(panelTareas, BoxLayout.Y_AXIS));
        panelTareas.setBorder(BorderFactory.createTitledBorder("Lista de Tareas"));

        // Agregar paneles a la ventana principal
        add(panelControles, BorderLayout.WEST);
        add(panelTareas, BorderLayout.CENTER);
        this.setVisible(true);                  //
    }

    // Getters para los componentes que necesita el controlador
    public JTextField getCampoTarea1() {
        return campoTarea1;
    }

    public JTextField getCampoTarea3() {
        return campoTarea3;
    }

    public JButton getBotonAgregar1() {
        return botonAgregar1;
    }

    public JButton getBotonEliminar() {
        return botonEliminar;
    }

    public JPanel getPanelTareas() {
        return panelTareas;
    }


}


