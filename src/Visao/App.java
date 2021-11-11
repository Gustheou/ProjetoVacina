package Visao;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class App extends Application{

    private static Stage stage;
    private static Scene mainScene;
    private static Scene cadastroScene;
    private static Scene ajudaCadastro;
    private static Scene esqueceuSenha;
    private static Scene pesquisarUsuario;
    private static Scene ajudaPesquisarUsuario;
    private static Scene loginMessage;
    private static Scene ajudaListarUsuario;

    public static void main(String[] args) throws Exception {
        launch (args);
    }

    @Override
    public void start(Stage cenario) throws Exception {
        stage = cenario;
        cenario.setTitle("Codando Alpacas");
        //URL url = getClass().getResource("Menu.fxml");
        //Parent fxmlMain = FXMLLoader.load(url);
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        mainScene = new Scene (fxmlMain);
        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        cadastroScene = new Scene (fxmlCadastro);
        Parent fxmlAjudaCadastro = FXMLLoader.load(getClass().getResource("AjudaCadastro.fxml"));
        ajudaCadastro = new Scene (fxmlAjudaCadastro);
        Parent fxmlEsqueceuSenha = FXMLLoader.load(getClass().getResource("EsqueceuSenha.fxml"));
        esqueceuSenha = new Scene (fxmlEsqueceuSenha);
        Parent fxmlPesquisarUsuario = FXMLLoader.load(getClass().getResource("PesquisarUsuario.fxml"));
        pesquisarUsuario = new Scene (fxmlPesquisarUsuario);
        Parent fxmlAjudaPesquisarUsuario = FXMLLoader.load(getClass().getResource("AjudaPesquisarUsuario.fxml"));
        ajudaPesquisarUsuario = new Scene (fxmlAjudaPesquisarUsuario);
        Parent fxmlLoginMensagem = FXMLLoader.load(getClass().getResource("MensagemLogin.fxml"));
        loginMessage = new Scene (fxmlLoginMensagem);
        Parent fxmlAjudaListar = FXMLLoader.load(getClass().getResource("AjudaListarUsuarios.fxml"));
        ajudaListarUsuario = new Scene (fxmlAjudaListar);

        cenario.setScene(mainScene);
        cenario.show();   
    }

    public static void changeScreenCadastro (MouseEvent event) {
        stage.setScene(cadastroScene);
    }

    public static void changeScreenCadastro () {
        stage.setScene(cadastroScene);
    }

    public static void changeScreenMenu (ActionEvent event) {
        stage.setScene(mainScene);
    }

    public static void changeScreenAjudaCadastro () {
        stage.setScene(ajudaCadastro);
    }

    public static void changeScreenEsqueceuSenha() {
        stage.setScene(esqueceuSenha);
    }

    public static void changeScreenPesquisarUsuario() {
        stage.setScene(pesquisarUsuario);
    }

    public static void changeScreenAjudaPesquisarUsuario() {
        stage.setScene(ajudaPesquisarUsuario);
    }

    public static void changeScreenLoginMessage() {
        stage.setScene(loginMessage);
    }

    public static void changeScreenAjudaListarUsuario() {
        stage.setScene(ajudaListarUsuario);
    }

}

