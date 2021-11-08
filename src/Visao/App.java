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

    public static void main(String[] args) throws Exception {
        launch (args);
    }

    @Override
    public void start(Stage cenario) throws Exception {
        stage = cenario;
        cenario.setTitle("Codando Alpacas");
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        mainScene = new Scene (fxmlMain);
        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        cadastroScene = new Scene (fxmlCadastro);
        Parent fxmlAjudaCadastro = FXMLLoader.load(getClass().getResource("AjudaCadastro.fxml"));
        ajudaCadastro = new Scene (fxmlAjudaCadastro);
        Parent fxmlEsqueceuSenha = FXMLLoader.load(getClass().getResource("EsqueceuSenha.fxml"));
        esqueceuSenha = new Scene (fxmlEsqueceuSenha);

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
}

