package services;
import model.Tarea;
import java.util.ArrayList;

public class DataTareas {
    private ArrayList<Tarea> data;

    public DataTareas() {
        data = new ArrayList<>();

        data.add(new Tarea("Desarrollo de algoritmos","En esta asignacion debe hacer un informe del tema","10 de octubre","En progreso"));
        data.add(new Tarea("Ciencia de datos","Crear una investigacion de 5 diapositivas con sus caracteristicas","7 de octubre","Completado"));
        data.add(new Tarea("Ingeniería de software","Crea un programa informátic que satisfagan las necesidades de la sociedad","6 de octubre","Pendiente"));
        data.add(new Tarea("Teoría de la computación","","",""));
        data.add(new Tarea("Robótica","Construye un artefacto que empaquete los informes de los temas Alumnos","12 de octubre","En progreso"));
    }
}