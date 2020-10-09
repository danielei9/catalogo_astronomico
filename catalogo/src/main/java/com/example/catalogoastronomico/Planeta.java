package com.example.catalogoastronomico;

import java.util.Objects;

/**
 * @author (IOT)
 * @version (2020)
 */
public class Planeta extends Astro {
    //----------------------------------------------//
    //  private String tipo;
    private boolean habitado;
    private Estrella estrella;

    public Planeta(String nombre,/* String tipo ,*/ double brillo, double distancia, boolean habitado, Estrella estrella) {
        super(nombre, brillo, distancia);
        //this.tipo = tipo;
        this.habitado = habitado;
        this.estrella = estrella;
    }

    //----------------------------------------------//

    //----------------------------------------------//

    public boolean isHabitado() {
        return habitado;
    }

    public void setHabitado(boolean habitado) {
        this.habitado = habitado;
    }

    public Estrella getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

    //----------------------------------------------//

    @Override
    public String toString() {
        return "objeto-Astro {nombre: " + this.getNombre() + ", tipo: Planeta" + ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() + ", habitado: " + this.isHabitado()
                + ", estrella: " + this.estrella.getNombre() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planeta)) return false;
        Planeta planeta = (Planeta) o;
        return isHabitado() == planeta.isHabitado() &&
                Objects.equals(getEstrella(), planeta.getEstrella());
    }


//----------------------------------------------//
}
