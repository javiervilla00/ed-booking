package com.iesam.edbooking.data;

import java.util.ArrayList;

public class Hotel {
    private int idHotel;
    private String nombreHotel;
    private String direccionHotel;
    private String poblacionHotel;
    private ArrayList<Integer> habitaciones;

    public Hotel(int idHotel, String nombreHotel, String direccionHotel, String poblacionHotel, ArrayList<Integer> habitaciones) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.direccionHotel = direccionHotel;
        this.poblacionHotel = poblacionHotel;
        this.habitaciones = habitaciones;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getPoblacionHotel() {
        return poblacionHotel;
    }

    public void setPoblacionHotel(String poblacionHotel) {
        this.poblacionHotel = poblacionHotel;
    }

    public ArrayList<Integer> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Integer> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
