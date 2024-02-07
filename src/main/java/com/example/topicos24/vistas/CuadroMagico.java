package com.example.topicos24.vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class CuadroMagico extends Stage {
    private Scene escena;
    public CuadroMagico(){
        this.setTitle("Cuadro Magico");
        this.setScene(new Scene(new Button("da clic")));
        this.show();
    }

    private void CrearUI(){
        escena = new Scene(new Button("Da clic"));
    }

}
