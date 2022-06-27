package com.example.mantenimiento2;

public class Ordenes {
    private String ID, IDEdificio, Descripcion, IDImagen, Prioridad, status;

    public Ordenes(){

    }

    public  Ordenes(String ID,
                    String IDEdificio,
                    String Descripcion,
                    String IDImagen,
                    String Prioridad,
                    String status){
        this.ID = ID;
        this.IDEdificio = IDEdificio;
        this.Descripcion = Descripcion;
        this.IDImagen = IDImagen;
        this.Prioridad = Prioridad;
        this.status = status;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDEdificio() {
        return IDEdificio;
    }

    public void setIDEdificio(String IDEdificio) {
        this.IDEdificio = IDEdificio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getIDImagen() {
        return IDImagen;
    }

    public void setIDImagen(String IDImagen) {
        this.IDImagen = IDImagen;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String prioridad) {
        Prioridad = prioridad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
