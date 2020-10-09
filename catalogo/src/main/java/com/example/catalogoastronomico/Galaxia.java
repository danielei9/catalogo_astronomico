package com.example.catalogoastronomico;

/**
 * @author (IOT)
 * @version (2020)
 */
public class Galaxia extends Astro {
    private String tipo;

    public Galaxia(String nombre /*, String tipo*/, double brillo, double distancia) {
        super(nombre, brillo, distancia);
        this.tipo = "Galaxia";
    }

    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() + ", tipo: " + tipo + ", brillo: " +
                this.getBrillo() + ", distancia: " + this.getDistancia() + '}';
    }
}
