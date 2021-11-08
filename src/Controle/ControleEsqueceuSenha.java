package Controle;
import Visao.App;
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControleEsqueceuSenha {

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    void recuperarSenha(ActionEvent event) {
        String senha = null; //Procurar pelo arquivo a senha que foi cadastrada.
        JOptionPane.showMessageDialog(null,"Sua senha é: "+senha);
        App.changeScreenMenu(event);
    }

}
