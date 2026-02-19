package com.example.solitario.GUI;

import DeckOfCards.Mazo;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MazoGrafico extends StackPane {
    private Mazo mazoLogico;
    private ImageView vistaReverso;

    public MazoGrafico(Mazo mazo) {
        this.mazoLogico = mazo;
        this.vistaReverso = new ImageView();

        try {
            Image imgReverso = new Image(getClass().getResourceAsStream("/com/example/solitario/Recursos/BackgroundCard.png"));
            vistaReverso.setImage(imgReverso);
        } catch (Exception e) {
            System.err.println("No se pudo cargar el reverso en MazoGrafico");
        }

        vistaReverso.setFitWidth(100);
        vistaReverso.setPreserveRatio(true);

        this.getChildren().add(vistaReverso);
        actualizarMazo();
    }

    public void actualizarMazo() {
        if (mazoLogico.getCartas().isEmpty()) {
            this.setOpacity(0.5);
        } else {
            this.setOpacity(1.0);
        }
    }
}