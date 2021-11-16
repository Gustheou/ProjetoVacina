package Controle;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ControlePosLogin {

    @FXML
    private Label cadastrarPacienteLabel;

    @FXML
    private Label pesquisarPacienteLabel;

    @FXML
    private Label listarPacienteLabel;

    @FXML
    private Label cadastrarVacinaLabel;

    @FXML
    private Label pesquisarVacinaLabel;

    @FXML
    private Label listarVacinaLabel;

    @FXML
    private Label pacienteHelpLabel;

    @FXML
    private Label vacinaHelpLabel;

    @FXML
    void cadastrarPaciente(MouseEvent event) {

    }

    @FXML
    void cadastrarVacina(MouseEvent event) {
        App.changeScreenCadastroVacina();
    }

    @FXML
    void listarPaciente(MouseEvent event) {
        
    }

    @FXML
    void listarVacina(MouseEvent event) {

    }

    @FXML
    void pacienteButton(ActionEvent event) {
        cadastrarVacinaLabel.setVisible(false);
        pesquisarVacinaLabel.setVisible(false);
        listarVacinaLabel.setVisible(false);
        vacinaHelpLabel.setVisible(false);
        
        cadastrarPacienteLabel.setVisible(true);
        pesquisarPacienteLabel.setVisible(true);
        listarPacienteLabel.setVisible(true);
        pacienteHelpLabel.setVisible(true);
    }

    @FXML
    void pesquisarPaciente(MouseEvent event) {

    }

    @FXML
    void pesquisarVacina(MouseEvent event) {
        App.changeScreenPesquisarVacina();
    }

    @FXML
    void sairButton(ActionEvent event) {
        App.changeScreenMenu(event);
    }

    @FXML
    void vacinaButton(ActionEvent event) {
        cadastrarPacienteLabel.setVisible(false);
        pesquisarPacienteLabel.setVisible(false);
        listarPacienteLabel.setVisible(false);
        pacienteHelpLabel.setVisible(false);

        cadastrarVacinaLabel.setVisible(true);
        pesquisarVacinaLabel.setVisible(true);
        listarVacinaLabel.setVisible(true);
        vacinaHelpLabel.setVisible(true);
    }

}
