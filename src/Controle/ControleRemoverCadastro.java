package Controle;

import javax.swing.JOptionPane;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ControleRemoverCadastro {

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private PasswordField senhaTextField;

    @FXML
    private RadioButton simButton;

    @FXML
    private ToggleGroup group;
    @FXML
    private RadioButton naoButton;

    @FXML
    void removerCadastroButton(ActionEvent event) {
        String nome = nomeTextField.getText();
        String cpf = cpfTextField.getText();
        String password = senhaTextField.getText();
        if (simButton.isSelected()) {
            //Chamar o método de remover cadastro;
            JOptionPane.showMessageDialog(null,"Sentiremos sua falta (′⌒`)");
            App.changeScreenMenu(event);
        } else if (naoButton.isSelected()) {
            App.changeScreenMenu(event);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a confirmação ou não da remoção do cadastro!");
        }
    }

}
