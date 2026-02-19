package com.example.solitario.GUI;

import DeckOfCards.CartaInglesa;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class CartaGrafica extends StackPane {
    private CartaInglesa cartaLogica;
    private ImageView vistaImagen;
    private Image imagenCarta;
    private Image imagenReverso;

    public CartaGrafica(CartaInglesa carta) {
        this.cartaLogica = carta;
        this.vistaImagen = new ImageView();

        this.imagenReverso = cargarImagen("BackgroundCard.png");

        String nombreArchivo = generarNombreArchivo();
        this.imagenCarta = cargarImagen(nombreArchivo);

        vistaImagen.setFitWidth(100);
        vistaImagen.setPreserveRatio(true);

        actualizarVista();
        this.getChildren().add(vistaImagen);
    }

    private Image cargarImagen(String nombre) {
        String ruta = "/com/example/solitario/Recursos/" + nombre;

        try {
            var recurso = getClass().getResource(ruta);
            if (recurso != null) {
                return new Image(recurso.toExternalForm());
            }
        } catch (Exception e) {
            System.err.println("Error al cargar: " + nombre);
        }

        System.err.println("Sigo sin hallar el archivo en: " + ruta);
        return null;
    }

    private String generarNombreArchivo() {
        String valorStr = "";
        valorStr = switch (cartaLogica.getValor()) {
            case 14 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 2 -> "Dos";
            case 3 -> "Tres";
            case 4 -> "Cuatro";
            case 5 -> "Cinco";
            case 6 -> "Seis";
            case 7 -> "Siete";
            case 8 -> "Ocho";
            case 9 -> "Nueve";
            case 10 -> "Diez";
            default -> "";
        };

        String paloStr = switch (cartaLogica.getPalo()) {
            case CORAZON -> "Corazones";
            case DIAMANTE -> "Diamantes";
            case PICA -> "Espadas";
            case TREBOL -> "Treboles";
        };

        return valorStr + paloStr + ".png";
    }

    public void actualizarVista() {
        if (cartaLogica.isFaceup()) {
            vistaImagen.setImage(imagenCarta);
        } else {
            vistaImagen.setImage(imagenReverso);
        }
    }
}