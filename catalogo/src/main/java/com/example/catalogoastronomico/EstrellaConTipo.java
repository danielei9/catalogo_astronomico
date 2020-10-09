package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class EstrellaConTipo extends Estrella{
    private TipoEstrella tipo;

    public EstrellaConTipo(String nombre, double brillo, double distancia, int planetas, Galaxia galaxia,TipoEstrella tipo) {
        super(nombre, brillo, distancia, planetas, galaxia);
        this.tipo = tipo;
    }

    public TipoEstrella getTipo() {
        return tipo;
    }
    public void setTipo(TipoEstrella tipo) {
        this.tipo = tipo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstrellaConTipo)) return false;
        if (!super.equals(o)) return false;
        EstrellaConTipo that = (EstrellaConTipo) o;
        return Objects.equals(getTipo(), that.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipo());
    }
//"objeto-Astro {nombre: Alfa Centauri, tipo: EstrellaConTipo, brillo: -0.27, distancia: 4.5, planetas: 3, galaxia: Vía Láctea, info: Enana Blanca \"https://es.wikipedia.org/wiki/Enana_blanca
    @Override
    public String toString() {
        return "objeto-Astro {" +
                " nombre: " + this.getNombre()   + ", tipo: EstrellaConTipo," + " brillo: " + this.getBrillo() + ", distancia: " + this.getDistancia() + ", planetas: " + this.getPlanetas() + ", galaxia: "+
                this.getGalaxia().getNombre() + ", info: " + this.getTipo().getNombre() +" \""+ this.getTipo().getUrl() + "\""+
                '}';
    }
}
