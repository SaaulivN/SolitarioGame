package com.example.solitario.GUI;

import solitaire.FoundationDeck;
import DeckOfCards.CartaInglesa;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FoundationGrafico extends StackPane {
    private FoundationDeck deckLogico;

    public FoundationGrafico(FoundationDeck deckLogico) {
        this.deckLogico = deckLogico;
        actualizar();
    }

    public void actualizar() {
        this.getChildren().clear();

        // Dibujar el marco base
        Rectangle marco = new Rectangle(100, 145);
        marco.setFill(Color.TRANSPARENT);
        marco.setStroke(Color.WHITE);
        marco.setStrokeWidth(2);
        marco.setArcWidth(10);
        marco.setArcHeight(10);
        this.getChildren().add(marco);

        // Si hay cartas en la lógica, mostrar la última (la de arriba)
        CartaInglesa ultima = deckLogico.getUltimaCarta();
        if (ultima != null) {
            ultima.makeFaceUp(); // Asegurar que sea visible
            this.getChildren().add(new CartaGrafica(ultima));
        }
    }
}