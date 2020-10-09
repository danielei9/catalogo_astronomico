package com.example.catalogoastronomico;

import java.util.ArrayList;

public interface Astros {

    boolean esEstrellaSimpleVista(int i); //Devuelve true si el Astro en una posición válida del catálogo es una estrella visible a simple vista

    boolean anade(Astro a); //Añade un astro al catálogo y devuelve true si se ha podido añadir. Si el nombre ya existe no será añadido.

    void borrar(String nombre); //Elimina el astro con el nombre indicado.

    Astro buscaAstro(String nombre); //Busca un astro por su nombre

    Astro primeroMasBrillanteQue(Astro a); // Devuelve el primer Astro del catálogo que es más brillante en magnitud absoluta que un Astro dado (lo de primero puede tener varias interpretaciones)

    ArrayList<Astro> filtraEstrellasSimpleVista(); //Devuelve un array de objetos Astro con las estrellas visibles a simple vista que contiene el catálogo (creo que se van a liar menos si usan una lista)

    Astro masBrillante(); //Devuelve el Astro que es más brillante en magnitud absoluta de todos los del catálogo
}
