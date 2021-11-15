package Controle;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ControlePesquisarVacina {

    @FXML
    private TextField numeroDoLoeTextField;

    @FXML
    private GridPane gridPane;

    @FXML
    private TextField mostrarNomeVacinaTextField;

    @FXML
    private TextField mostrarValidadeTextField;

    @FXML
    private TextField mostrarLocalDestinoTextField;

    @FXML
    void pesquisarButton(ActionEvent event) {
        gridPane.setVisible(true);
        //Pesquisar e settar texto
    }

    @FXML
    void voltarButton(ActionEvent event) {
        App.changeScreenPosLogin();
        mostrarNomeVacinaTextField.setText("");
        mostrarLocalDestinoTextField.setText("");
        mostrarValidadeTextField.setText("");
        gridPane.setVisible(false);

    }

}
