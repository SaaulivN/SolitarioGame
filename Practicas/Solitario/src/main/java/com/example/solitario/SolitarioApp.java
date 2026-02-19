package com.example.solitario;

import DeckOfCards.CartaInglesa;
import DeckOfCards.Mazo;
import com.example.solitario.GUI.CartaGrafica;
import com.example.solitario.GUI.FoundationGrafico;
import com.example.solitario.GUI.MazoGrafico;
import com.example.solitario.GUI.TableauDeckGrafico;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class SolitarioApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Mazo mazo = new Mazo();

        // Seccion del mazo
        MazoGrafico mazoVisual = new MazoGrafico(mazo);
        mazoVisual.setLayoutX(50);
        mazoVisual.setLayoutY(50);
        root.getChildren().add(mazoVisual);

        // Seccion del drawPile
        CartaInglesa cartaLogica = mazo.obtenerUnaCarta();
        if (cartaLogica != null) {
            cartaLogica.makeFaceUp();
            CartaGrafica cartaVisual = new CartaGrafica(cartaLogica);
            cartaVisual.setLayoutX(170);
            cartaVisual.setLayoutY(50);
            root.getChildren().add(cartaVisual);
        }

        // Seccion del Foundation
        for (int i = 0; i < 4; i++) {
            FoundationGrafico foundation = new FoundationGrafico();
            foundation.setLayoutX(400 + (i * 120));
            foundation.setLayoutY(50);
            root.getChildren().add(foundation);
        }

        // Seccion del Tableau
        for (int i = 0; i < 7; i++) {
            TableauDeckGrafico tableauGrafico = new TableauDeckGrafico();
            tableauGrafico.setLayoutX(50 + (i * 120));
            tableauGrafico.setLayoutY(250);
            root.getChildren().add(tableauGrafico);
        }



        Scene escena = new Scene(root, 1020, 800, Color.DARKRED);
        primaryStage.setTitle("Solitario");
        primaryStage.setScene(escena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}