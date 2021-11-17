package Controle;

import Modelo.pessoa.Paciente;
import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControlePesquisarPaciente {

    @FXML
    private TextField cpfTextField;

    @FXML
    private TextArea textArea;

    ControlePessoa cP = new ControlePessoa();
    @FXML
    void pesquisarButton(ActionEvent event) {
        try {
            String cpf = String.valueOf(cpfTextField.getText());
            Paciente cpfzin = cP.pesquisarPaciente(cpf);
            String dados = String.valueOf(cpfzin);
            textArea.setText(dados);
            textArea.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @FXML
    void voltarButton(ActionEvent event) {
        App.changeScreenPosLogin();
        textArea.setText("");
        textArea.setVisible(false);
    }

}
