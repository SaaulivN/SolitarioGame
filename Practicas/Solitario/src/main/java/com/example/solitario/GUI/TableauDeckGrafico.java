package com.example.solitario.GUI;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TableauDeckGrafico extends Pane {
    public TableauDeckGrafico() {
        Rectangle base = new Rectangle(100, 145);
        base.setFill(Color.rgb(255, 255, 255, 0.1));
        base.setArcWidth(10);
        base.setArcHeight(10);

        this.getChildren().add(base);
    }

    /**
     * Método para añadir una carta con el efecto de escalonado
     */
    public void agregarCarta(CartaGrafica cartaVisual) {
        int indice = this.getChildren().size() - 1;
        cartaVisual.setLayoutY(indice * 30);
        this.getChildren().add(cartaVisual);
    }
}