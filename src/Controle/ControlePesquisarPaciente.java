package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextFlow;

public class ControlePesquisarPaciente {

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private GridPane gridPane;

    @FXML
    private TextFlow mostrarVacinasText;

    @FXML
    private TextField mostrarNomeTextField;

    @FXML
    private TextField mostrarEnderecoTextField;

    @FXML
    private TextField mostrarEmailTextField;

    @FXML
    void pesquisarButton(ActionEvent event) {
        try {
            String nome = String.valueOf(nomeTextField.getText());
            String cpf = String.valueOf(cpfTextField.getText());
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        gridPane.setVisible(false);
        mostrarEmailTextField.setText("");
        mostrarEnderecoTextField.setText("");
        mostrarNomeTextField.setText("");
    }

    @FXML
    void voltarButton(ActionEvent event) {

    }

}
