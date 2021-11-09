package Controle;
import Visao.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ControleMenu {

    @FXML
    private TextField loginTextField;

    @FXML
    private TextField senhaTextField;

    @FXML AnchorPane AnchorPane;

    //Aba de ajuda
    @FXML
    void ajudaCadastroMenuBar() {
        App.changeScreenAjudaCadastro();
    }

    @FXML
    void ajudaPesquisarUsuarioMenuBar(ActionEvent event) {
        App.changeScreenAjudaPesquisarUsuario();
    }

    @FXML
    void ajudaRemoverCadastroMenuBar(ActionEvent event) {
        App.changeScreenAjudaRemoverCadastro();
    }
    //Clique aqui
    @FXML
    void cadastrarUsuario(MouseEvent event) throws IOException {
        App.changeScreenCadastro(event);
    }
    //Aba do menu
    @FXML
    void cadastrarUsuarioMenuBar() {
        App.changeScreenCadastro();
    }

    @FXML
    void esqueceuSenha(MouseEvent event) {
        App.changeScreenEsqueceuSenha();
    }

    @FXML
    void logarButton(ActionEvent event) {

    }

    @FXML
    void pesquisarCadastroMenuBar(ActionEvent event) {
        App.changeScreenPesquisarUsuario();
    }

    @FXML
    void removerCadastroMenuBar(ActionEvent event) {
        App.changeScreenRemoverCadastro();
    }

}

