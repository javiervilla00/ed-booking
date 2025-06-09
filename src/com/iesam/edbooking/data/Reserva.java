package com.iesam.edbooking.data;

import java.util.Date;

public class Reserva {
    private Usuario usuarioReserva;
    private Room habitacionReserva;
    private Date fechaInicioReserva;
    private Date fechaFinReserva;
    private double precioReserva;

    public Reserva(Usuario usuarioReserva, Room habitacionReserva, Date fechaInicioReserva, Date fechaFinReserva, double precioReserva) {
        this.usuarioReserva = usuarioReserva;
        this.habitacionReserva = habitacionReserva;
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
        this.precioReserva = precioReserva;
    }
}
