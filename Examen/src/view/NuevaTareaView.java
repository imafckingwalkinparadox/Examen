package view;

import javax.swing.*;
import java.awt.*;

public class NuevaTareaView extends JPanel {

    private JTextField campoTarea;
    private JButton agregarBtn;

    public NuevaTareaView() {
        setLayout(new GridLayout(2, 1));

        campoTarea = new JTextField();
        agregarBtn = new JButton("Agregar Tarea");

        add(new JLabel("Nueva Tarea:"));
        add(campoTarea);
        add(agregarBtn);
    }
}
