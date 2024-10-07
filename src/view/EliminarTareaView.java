package view;

import javax.swing.*;
import java.awt.*;

public class EliminarTareaView extends JPanel {

    private JTextField delete;
    private JButton eliminarBtn;

    public EliminarTareaView() {
        setLayout(new GridLayout(3,1));

        delete = new JTextField();
        eliminarBtn = new JButton("Eliminar Tarea");

        add(new JLabel("Tarea Eliminada"));
        add(delete);
        add(eliminarBtn);
    }
}
