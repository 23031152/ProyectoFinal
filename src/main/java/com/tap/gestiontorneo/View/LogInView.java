package com.tap.gestiontorneo.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

public class LoginView {

    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginButton;
    private Button goToRegisterButton;

    private Scene scene;

    public LoginView() {
        inicializar();
    }

    private void inicializar() {
        Label title = new Label("Inicio de Sesión");
        title.getStyleClass().addAll("h2", "text-primary");
        title.setStyle("-fx-font-weight: bold;");

        usernameField = new TextField();
        usernameField.setPromptText("Usuario o correo");
        usernameField.getStyleClass().add("form-control");

        passwordField = new PasswordField();
        passwordField.setPromptText("Contraseña");
        passwordField.getStyleClass().add("form-control");

        loginButton = new Button("Entrar");
        loginButton.getStyleClass().addAll("btn", "btn-primary", "btn-lg");

        goToRegisterButton = new Button("Crear cuenta");
        goToRegisterButton.getStyleClass().addAll("btn", "btn-secondary");

        VBox layout = new VBox(15, title, usernameField, passwordField,
                loginButton, goToRegisterButton);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(30));
        layout.getStyleClass().add("bg-light");

        scene = new Scene(layout, 400, 450);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
    }

    // ------------- MÉTODOS QUE EL CONTROLLER USARÁ -----------------

    public Scene getScene() {
        return scene;
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public Button getGoToRegisterButton() {
        return goToRegisterButton;
    }
}

