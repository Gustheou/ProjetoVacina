package Controle;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControlePosLogin {

    @FXML
    void sairMenuBar(ActionEvent event) {
        App.changeScreenMenu(event);
    }
    
    @FXML
    void cadastroVacina(ActionEvent event) {
        App.changeScreenCadastroVacina();
    }

}
