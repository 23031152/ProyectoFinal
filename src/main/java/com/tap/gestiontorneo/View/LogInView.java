package com.tap.gestiontorneo.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

public class LoginView {

    public void start(Stage stage) {

        Label title = new Label("Inicio de Sesión");
        title.getStyleClass().addAll("h2", "text-primary");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Usuario o correo");
        usernameField.getStyleClass().add("form-control");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Contraseña");
        passwordField.getStyleClass().add("form-control");

        Button loginButton = new Button("Entrar");
        loginButton.getStyleClass().addAll("btn", "btn-primary", "btn-lg");

        // Aquí se abre el main view después de login
        loginButton.setOnAction(e -> {
            MainView mv = new MainView();
            mv.start(new Stage());
            stage.close();
        });

        Button registerButton = new Button("Crear cuenta");
        registerButton.getStyleClass().addAll("btn", "btn-secondary");
        registerButton.setOnAction(e -> abrirRegister(stage));

        VBox layout = new VBox(15, title, usernameField, passwordField, loginButton, registerButton);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(30));

        Scene scene = new Scene(layout, 400, 450);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        stage.setScene(scene);
        stage.setTitle("Gestión Torneos - Login");
        stage.show();
    }

    private void abrirRegister(Stage loginStage) {
        RegisterView rv = new RegisterView();
        rv.start(new Stage());
    }
}

