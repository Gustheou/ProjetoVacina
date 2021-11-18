package Controle;
import Modelo.vacina.Vacina;

import java.io.FileNotFoundException;
import java.io.IOException;

import Modelo.pessoa.Paciente;
import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControleVacinacao {

    ControleVacina cV = new ControleVacina();

    @FXML
    private TextField cpfTextField;

    @FXML
    private Label mensagemHelpLabel;

    @FXML
    private Label loteLabel;

    @FXML
    private TextField loteTextField;

    @FXML
    private Button continuarButtonSumir;

    @FXML
    private TextArea textAreaDados;

    @FXML
    private TextArea textAreaLote;

    @FXML
    private Button vacinarButtonAparecer;

    @FXML
    private Button continuar2ButtonAparecer;

    @FXML
    void continuar2Button(ActionEvent event) {
        //pesquisar lote
        try {
            String lote = String.valueOf(loteTextField.getText());
            Vacina vzin = cV.pesquisarVacina(lote);
            String dados = String.valueOf(vzin.tostring());
            textAreaLote.setText(dados);
            textAreaLote.setVisible(true);
            vacinarButtonAparecer.setVisible(true);
            
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
    ControlePessoa cP = new ControlePessoa();

    @FXML
    void continuarButton(ActionEvent event) {

        try {
            String cpf = String.valueOf(cpfTextField.getText());
            Paciente cpfzin = cP.pesquisarPaciente(cpf);
            String dados = String.valueOf(cpfzin);
            textAreaDados.setText(dados);

            continuarButtonSumir.setVisible(false);
            textAreaDados.setVisible(true);
            mensagemHelpLabel.setVisible(true);
            loteLabel.setVisible(true);
            loteTextField.setVisible(true);
            continuar2ButtonAparecer.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void vacinarButton(ActionEvent event) {

    }

    @FXML
    void voltarButton(ActionEvent event) {
        App.changeScreenPosLogin();
        continuarButtonSumir.setVisible(true);
        textAreaDados.setVisible(false);
        mensagemHelpLabel.setVisible(false);
        loteLabel.setVisible(false);
        loteTextField.setVisible(false);
        continuar2ButtonAparecer.setVisible(false);
        textAreaLote.setVisible(false);

        textAreaDados.setText("");
        cpfTextField.setText("");
        textAreaLote.setText("");

    }

}
