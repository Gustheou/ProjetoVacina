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

    @FXML
    void cadastrarUsuario(MouseEvent event) throws IOException {
        App.changeScreenCadastro(event);
    }

    @FXML
    void cadastrarUsuarioMenuBar() {
        App.changeScreenCadastro();
    }

    @FXML
    void ajudaCadastroMenuBar() {
        App.changeScreenAjudaCadastro();
    }

    @FXML
    void esqueceuSenha(MouseEvent event) {
        App.changeScreenEsqueceuSenha();
    }

    @FXML
    void logarButton(ActionEvent event) {

    }

}

