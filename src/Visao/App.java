/*
UNIVERSIDADE ESTADUAL DO SUDOESTE DA BAHIA – UESB
DEPARTAMENTO DE CIENCIAS EXATAS E TECNOLÓGICAS- DCET
CURSO DE CIÊNCIA DA COMPUTAÇÃO
DISCIPLINA:  Algoritmos e Programação II 
PROFESSORA: Maísa Soares dos Santos Lopes
NOME DA EQUIPE: Codando Alpacas
ALUNOS: Gustavo Pereira Nunes, Jonathan Silva Reis, Jorge Fernando dos Humildes Neto, Lara Santos Pereira Soares e Lisandra Sapucaia Gumes
*/
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
    private static Scene posLogin;
    private static Scene cadastroVacina;
    private static Scene pesquisarVacina;
    private static Scene cadastroPaciente;
    private static Scene pesquisarPaciente;
    private static Scene vacinacao;

    public static void main(String[] args) throws Exception {
        launch (args);
    }

    @Override
    public void start(Stage cenario) throws Exception {
        stage = cenario;
        cenario.setTitle("Imuni App");
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        mainScene = new Scene (fxmlMain);
        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("CadastroAplicador.fxml"));
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
        Parent fxmlPosLogin = FXMLLoader.load(getClass().getResource("PosLogin.fxml"));
        posLogin = new Scene (fxmlPosLogin);
        Parent fxmlCadastroVacina = FXMLLoader.load(getClass().getResource("CadastroVacina.fxml"));
        cadastroVacina = new Scene (fxmlCadastroVacina);
        Parent fxmlPesquisarVacina = FXMLLoader.load(getClass().getResource("PesquisarVacina.fxml"));
        pesquisarVacina = new Scene (fxmlPesquisarVacina);
        Parent fxmlCadastrarPaciente = FXMLLoader.load(getClass().getResource("CadastroPaciente.fxml"));
        cadastroPaciente = new Scene (fxmlCadastrarPaciente);
        Parent fxmlPesquisarPaciente = FXMLLoader.load(getClass().getResource("PesquisarPaciente.fxml"));
        pesquisarPaciente = new Scene (fxmlPesquisarPaciente);
        Parent fxmlVacinacao = FXMLLoader.load(getClass().getResource("Vacinacao.fxml"));
        vacinacao = new Scene (fxmlVacinacao);

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

    public static void changeScreenPosLogin() {
        stage.setScene(posLogin);
    }

    public static void changeScreenCadastroVacina() {
        stage.setScene(cadastroVacina);
    }

    public static void changeScreenPesquisarVacina() {
        stage.setScene(pesquisarVacina);
    }

    public static void changeScreenCadastrarPaciete() {
        stage.setScene(cadastroPaciente);
    }

    public static void changeScreenPesquisarPaciente() {
        stage.setScene (pesquisarPaciente);
    }

    public static void changeScreenVacinacao() {
        stage.setScene (vacinacao);
    }

}

