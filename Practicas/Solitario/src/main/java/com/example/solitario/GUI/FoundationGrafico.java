package com.example.solitario.GUI;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FoundationGrafico extends StackPane {
    public FoundationGrafico() {
        Rectangle marco = new Rectangle(100, 145);
        marco.setFill(Color.TRANSPARENT);
        marco.setStroke(Color.WHITE);
        marco.setStrokeWidth(2);
        marco.setArcWidth(10);
        marco.setArcHeight(10);

        this.getChildren().add(marco);
    }
}