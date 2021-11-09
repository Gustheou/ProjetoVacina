package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextFlow;

public class ControlePesquisarUsuario {

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private TextFlow mostrarVacinasText;

    @FXML
    private TextField mostrarNomeTextField;

    @FXML
    private TextField mostrarEnderecoTextField;

    @FXML
    private TextField mostrarEmailTextField;

    @FXML
    private GridPane gridPane;

    @FXML
    void pesquisarButton(ActionEvent event) {
        try {
            String nome = ""; //Pesquisar nome nos arquivos
            String endereco = ""; //Pesquisar endereco nos arquivos
            String email = ""; //Pesquisar email nos arquivos
            String vacina = ""; //Pesquisar vacinas no arquivo
            mostrarNomeTextField.setText(nome);
            mostrarEnderecoTextField.setText(endereco);
            mostrarEmailTextField.setText(email);
            //mostrarVacinasText.setText(vacina);   Como mostrar as vacinas??? (Colocar um botao e listar pelo JOptionPane?)
            gridPane.setVisible(true);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

}
