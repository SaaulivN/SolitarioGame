package com.example.solitario;

import DeckOfCards.CartaInglesa;
import DeckOfCards.Mazo;
import com.example.solitario.GUI.CartaGrafica;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SolitarioApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 1. Contenedor principal (Pane permite posicionamiento libre con coordenadas X, Y)
        Pane root = new Pane();

        // 2. Lógica del juego: Crear un mazo y sacar una carta
        Mazo mazo = new Mazo();
        CartaInglesa cartaLogica = mazo.obtenerUnaCarta();

        // La ponemos boca arriba para que se vea el .png del valor y no el reverso
        if (cartaLogica != null) {
            cartaLogica.makeFaceUp();

            // 3. Crear la representación gráfica de la carta
            CartaGrafica cartaVisual = new CartaGrafica(cartaLogica);

            // Ubicarla en la ventana
            cartaVisual.setLayoutX(100);
            cartaVisual.setLayoutY(100);

            // 4. Agregar la carta al panel
            root.getChildren().add(cartaVisual);
        }

        // Configurar la escena (Fondo verde tipo mesa de casino)
        Scene escena = new Scene(root, 800, 600, Color.DARKGREEN);

        primaryStage.setTitle("Solitario - Visualización de Cartas");
        primaryStage.setScene(escena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}