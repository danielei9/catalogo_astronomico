package com.example.catalogoastronomico;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author (IOT)
 * @version (2020)
 */

public class CatalogoAstronomico implements Astros {

    private ArrayList<Astro> catalogo;
    private HashSet<String> galaxias;
    private int numEstrellasSimpleVista;

    public CatalogoAstronomico() {
        this.catalogo = new ArrayList<>();
        this.galaxias = new HashSet<>();
        this.numEstrellasSimpleVista = 0;
    }

    //=======================================================================//
    public interface Dibujable {
        int AZUL = 0x0000FF;

        void dibuja(int color);

        void borra();

        boolean estaDibujado();
    }

    //=======================================================================//
    public ArrayList<Astro> getCatalogo() {
        return catalogo;
    }

    public HashSet<String> getGalaxias() {
        return galaxias;
    }

    public int getNumEstrellasSimpleVista() {
        return numEstrellasSimpleVista;
    }

    //=======================================================================//
    //Devuelve true si el Astro en una posición válida del catálogo es una estrella visible a simple vista
    @Override
    public boolean esEstrellaSimpleVista(int i) {
        if (catalogo.get(i).visibleCon() == "a simple vista") {
            return true;
        }
        return false;
    }

    //Añade un astro al catálogo (comprueba que no esté repetido) y devuelve true si se ha podido añadir
    @Override
    public boolean anade(Astro a) {
        boolean existe = false;

        for(int i = 0; i< catalogo.size();i++){
            if (catalogo.get(i).getNombre() == a.getNombre()){
                existe = true;
            }
        }

        if (existe) {
            return false;
        } else {
            this.catalogo.add(a);
            if (a instanceof Estrella) {
                this.catalogo.add(((Estrella) a).getGalaxia());
                this.galaxias.add(((Estrella) a).getGalaxia().getNombre());
            }
            if (a instanceof Galaxia) {
                //this.catalogo.add(a);
                this.galaxias.add(a.getNombre());
            }
            return true;
        }
    }

    //Elimina el astro con el nombre indicado
    @Override
    public void borrar(String nombre) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getNombre() == nombre) {
                catalogo.remove(i);
            }
        }
    }

    //Busca un astro por su nombre
    @Override
    public Astro buscaAstro(String nombre) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getNombre() == nombre) {
                return catalogo.get(i);
            }
        }
        return null;
    }

    // Devuelve el primer Astro del catálogo que es más brillante en magnitud absoluta que un Astro dado (devuelve el primero que cumpla esa condición)
    @Override
    public Astro primeroMasBrillanteQue(Astro a) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).masBrillante(a) == 1) {
                return catalogo.get(i);
            }
        }
        return null;
    }

    //Devuelve una lista de objetos Astro con las estrellas visibles a simple vista que contiene el catálogo
    public ArrayList<Astro> filtraEstrellasSimpleVista() {
         ArrayList<Astro> newArray = new ArrayList<>();

        for (int i = 0; i < catalogo.size(); i++) {
            if ((catalogo.get(i).visibleCon() == "a simple vista") && (catalogo.get(i) instanceof Estrella)) {
                //System.out.println("Entro a Simple Vista");
                newArray.add(catalogo.get(i));
                numEstrellasSimpleVista++;
            }
        }
        return newArray;
    }

    //Devuelve el Astro que es más brillante en magnitud absoluta de todos los del catálogo
    @Override
    public Astro masBrillante() {
        Astro newAstro = null;
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).masBrillante(newAstro) == 1) {
                newAstro = catalogo.get(i);
            }
        }
        return newAstro;
    }
//=======================================================================//

    @Override
    public String toString() {
        return  catalogo.toString();
    }
}