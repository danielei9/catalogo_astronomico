package com.example.catalogoastronomico;

import java.util.Objects;

/**
 * @author (IOT)
 * @version (2020)
 */

public class Astro {
    private String nombre;
    private double brillo;
    private double distancia;

    //-----------------------------------//
    public Astro(String nombre, double brillo, double distancia) {
        this.nombre = nombre;
        this.brillo = brillo;
        this.distancia = distancia;
    }
    public Astro(){
        this.nombre = "Sirius";
        this.brillo = -1.42;
        this.distancia = 8.7;
    }
    //-----------------------------------//
    public String getNombre() {
        return nombre;
    }

    public double getBrillo() {
        return brillo;
    }

    public double getDistancia() {
        return distancia;
    }

    //-----------------------------------//
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBrillo(double brillo) {
        this.brillo = brillo;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    //-----------------------------------//


    public boolean masDistante(Astro otro) {
        double distanciaEntre = this.distancia - otro.distancia;
        if (distanciaEntre > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int masBrillante(Astro otro) {
        double brilloEntre = this.brillo - otro.brillo;
        if (brilloEntre > 0) {
            return 1;
        } else if (brilloEntre == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public String visibleCon() {
        if (this.brillo < 5) return "a simple vista";
        if ((this.brillo < 7) && (this.brillo > 5)) return "con prismaticos";
        if ((this.brillo < 25) && (this.brillo > 7)) return "con telescopio";
        if (this.brillo > 25) return "con grandes telescopios";
        else {
            return "false";
        }
    }

    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + nombre +
                ", brillo: " + brillo +
                ", distancia: " + distancia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Astro)) return false;
        Astro astro = (Astro) o;
        return Double.compare(astro.getBrillo(), getBrillo()) == 0 &&
                Double.compare(astro.getDistancia(), getDistancia()) == 0 &&
                Objects.equals(getNombre(), astro.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getBrillo(), getDistancia());
    }
}
