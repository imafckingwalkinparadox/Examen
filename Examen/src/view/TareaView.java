package view;

import javax.swing.*;
import java.awt.*;

public class TareaView extends JPanel {

    private JLabel nombreTarea;
    private JButton eliminarBtn;

    public TareaView(String tarea) {
        setLayout(new FlowLayout());

        nombreTarea = new JLabel(tarea);
        eliminarBtn = new JButton("Eliminar");

        add(nombreTarea);
        add(eliminarBtn);
    }
}

