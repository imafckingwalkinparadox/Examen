package model;
public class Tarea {

private String Titulo;
private String Descripcion;
private String FechaLimite;
private String Estado;

//Constructor
public Tarea (String Titulo, String Descripcion, String FechaLimite, String Estado) {

    this.Titulo = Titulo;
    this.Descripcion = Descripcion;
    this.FechaLimite = FechaLimite;
    this.Estado = Estado;
}
//GET & SET

    public String getTitulo() {
    return Titulo;
}
    public String getDescripcion() {
    return Descripcion;
}
    public String getFechaLimite() {
    return FechaLimite;
}
    public String getEstado() {
    return Estado;
}
    public void setTitulo(String titulo) {
    Titulo = titulo;
}
    public void setDescripcion(String descripcion) {
    Descripcion = descripcion;
}
    public void setFechaLimite(String fechaLimite) {
    FechaLimite = fechaLimite;
}
    public void setEstado(String estado) {
    Estado = estado;
}
}
