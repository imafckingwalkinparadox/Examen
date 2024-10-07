package view;
import javax.swing.*;
import java.awt.*;

public class TareasView extends JFrame {

    private JPanel panelControles;
    private JPanel panelTareas;
    private JPanel panelNuevaTarea;
    private JPanel panelEliminarTarea;

    public TareasView() {
        setTitle("Gestor de Tareas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(new BorderLayout());

        panelControles = new JPanel();
        panelTareas = new JPanel();
        panelNuevaTarea = new JPanel();
        panelEliminarTarea = new JPanel();

        panelControles.setBorder(BorderFactory.createTitledBorder("Controles"));
        panelTareas.setBorder(BorderFactory.createTitledBorder("Lista de Tareas"));
        panelNuevaTarea.setBorder(BorderFactory.createTitledBorder("Nueva Tarea"));
        panelEliminarTarea.setBorder(BorderFactory.createTitledBorder("Eliminar Tarea"));

        add(panelControles, BorderLayout.NORTH);
        add(panelTareas, BorderLayout.CENTER);
        add(panelNuevaTarea, BorderLayout.EAST);
        add(panelEliminarTarea, BorderLayout.WEST);

        this.setVisible(true);
    }
}