package com.iesam.edbooking.data;

public class Room {
    private int codHabitacion;
    private int numeroHabitacion;
    private String descripcionHabitacion;

    public Room(int codHabitacion, int numeroHabitacion, String descripcionHabitacion) {
        this.codHabitacion = codHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.descripcionHabitacion = descripcionHabitacion;
    }

    public int getCodHabitacion() {
        return codHabitacion;
    }

    public void setCodHabitacion(int codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getDescripcionHabitacion() {
        return descripcionHabitacion;
    }

    public void setDescripcionHabitacion(String descripcionHabitacion) {
        this.descripcionHabitacion = descripcionHabitacion;
    }
}
