package Controle;
import Visao.App;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;
import Controle.ControlePessoa;
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

    @FXML
    void ajudaListarUsuariosMenuBar(ActionEvent event) {
        App.changeScreenAjudaListarUsuario();
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
        App.changeScreenLoginMessage();

    }

    @FXML
    void pesquisarCadastroMenuBar(ActionEvent event) {
        App.changeScreenPesquisarUsuario();
    }

    @FXML
    void removerCadastroMenuBar(ActionEvent event) {
        App.changeScreenRemoverCadastro();
    }

    ControlePessoa cP = new ControlePessoa();
    @FXML
    void ListarUsuarioMenuBar(ActionEvent event) throws HeadlessException, FileNotFoundException, ClassNotFoundException, IOException {
        JOptionPane.showMessageDialog(null, cP.listarPessoa());
        //Não sei ao certo se isso está correto. ~ Gugu
    }

}

