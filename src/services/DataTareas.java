package services;
import java.util.ArrayList;
import java.util.List;

public class DataTareas {
    private List<String> listaTareas;

    public DataTareas() {
        listaTareas = new ArrayList<>();
    }

    public List<String> getListaTareas() {
        return listaTareas;
    }

    public void agregarTarea(String tarea) {
        listaTareas.add(tarea);
    }

    public void eliminarTarea(String tituloTarea) {
        listaTareas.removeIf(tarea -> tarea.equals(tituloTarea));
    }
}
