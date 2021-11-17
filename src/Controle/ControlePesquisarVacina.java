package Controle;

import Modelo.vacina.Vacina;
import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControlePesquisarVacina {

    @FXML
    private TextField numeroDoLoteTextField;

    @FXML
    private TextArea textArea;

    ControleVacina cV = new ControleVacina();
    @FXML
    void pesquisarButton(ActionEvent event) {
        try {
            String lote = String.valueOf(numeroDoLoteTextField.getText());
            Vacina vzin = cV.pesquisarVacina(lote);
            String dados = String.valueOf(vzin);
            textArea.setText(dados);
            textArea.setVisible(true);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }

    @FXML
    void voltarButton(ActionEvent event) {
        App.changeScreenPosLogin();
        textArea.setVisible(false);
        textArea.setText("");
    }

}
