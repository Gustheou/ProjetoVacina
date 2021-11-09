package Controle;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControleAjudaPesquisarUsuario {

    @FXML
    void VoltarMenu(ActionEvent event) {
        App.changeScreenMenu(event);
    }

}
