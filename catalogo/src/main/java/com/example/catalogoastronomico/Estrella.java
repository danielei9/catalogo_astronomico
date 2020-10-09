package com.example.catalogoastronomico;

/**
 * @author (IOT)
 * @version (2020)
 */
public class Estrella extends Astro {
    //----------------------------------------------//
    private int planetas;
    private Galaxia galaxia;
    private Estrella estrella;
    private String tipo;

    public Estrella(String nombre, double brillo, double distancia, int planetas, Galaxia galaxia) {
        super(nombre, brillo, distancia);
        this.tipo = "Estrella";
        this.planetas = planetas;
        this.galaxia = galaxia;
    }
    //----------------------------------------------//

    public int getPlanetas() {
        return planetas;
    }

    public void setPlanetas(int planetas) {
        this.planetas = planetas;
    }

    public Galaxia getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(Galaxia galaxia) {
        this.galaxia = galaxia;
    }

    //----------------------------------------------//

    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() +
                ", tipo: " + tipo + ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() + ", planetas: " +
                String.valueOf(planetas) + ", galaxia: " + galaxia.getNombre() +
                '}';
    }


    //----------------------------------------------//
}
