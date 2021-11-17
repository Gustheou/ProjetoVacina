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

    ControlePessoa cA = new ControlePessoa();
    @FXML
    void logarButton(ActionEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
        String login = String.valueOf(loginTextField.getText());
        String senha = String.valueOf(senhaTextField.getText());
        boolean loginMenu = cA.pesquisarLoginMenu(login);
        boolean senhaMenu = cA.pesquisarSenhaMenu(senha);

        if (loginMenu == true && senhaMenu == true) {
            App.changeScreenLoginMessage();
        } else {
            JOptionPane.showMessageDialog(null,"Login ou senha incorretos, tente novamente!");
        }
        loginTextField.setText("");
        senhaTextField.setText("");

    }

    @FXML
    void pesquisarCadastroMenuBar(ActionEvent event) {
        App.changeScreenPesquisarUsuario();
    }

    ControlePessoa cP = new ControlePessoa();
    @FXML
    void ListarUsuarioMenuBar(ActionEvent event) throws HeadlessException, FileNotFoundException, ClassNotFoundException, IOException {
        JOptionPane.showMessageDialog(null, cP.imprimirAplicador());
        //Não sei ao certo se isso está correto. ~ Gugu
    }

}

