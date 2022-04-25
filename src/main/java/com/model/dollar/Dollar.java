package com.model.dollar;

public class Dollar {

    private String fecha;
    private String compra;
    private String venta;

    public Dollar() {
    }

    public Dollar(String fecha, String compra, String venta) {
        this.fecha = fecha;
        this.compra = compra;
        this.venta = venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "Dolar{" +
                "fecha='" + fecha + '\'' +
                ", compra='" + compra + '\'' +
                ", venta='" + venta + '\'' +
                '}';
    }
}
