package Controle;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
    private Label novaVacinaLabel;

    @FXML
    private ImageView imagemCadastroPaciente;

    @FXML
    private ImageView imagemPesquisarPaciente;

    @FXML
    private ImageView imagemListarPaciente;

    @FXML
    private ImageView imagemNovaVacinaPaciente;

    @FXML
    private ImageView imagemCadastroVacina;

    @FXML
    private ImageView imagemPesquisarVacina;

    @FXML
    private ImageView imagemListarVacina;

    @FXML
    void cadastrarPaciente(MouseEvent event) {
        App.changeScreenCadastrarPaciete();
    }

    @FXML
    void cadastrarVacina(MouseEvent event) {
        App.changeScreenCadastroVacina();
    }

    @FXML
    void imagemCadastrarPaciente(MouseEvent event) {
        App.changeScreenCadastrarPaciete();
    }

    @FXML
    void imagemCadastrarVacina(MouseEvent event) {
        App.changeScreenCadastroVacina();
    }

    @FXML
    void imagemListarPaciente(MouseEvent event) {

    }

    @FXML
    void imagemListarVacina(MouseEvent event) {

    }

    @FXML
    void imagemNovaVacinaPaciente(MouseEvent event) {

    }

    @FXML
    void imagemPesquisarPaciente(MouseEvent event) {
    }

    @FXML
    void imagemPesquisarVacina(MouseEvent event) {
        App.changeScreenPesquisarVacina();
    }

    @FXML
    void listarPaciente(MouseEvent event) {

    }

    @FXML
    void listarVacina(MouseEvent event) {

    }

    @FXML
    void novaVacinaButton(MouseEvent event) {

    }

    @FXML
    void pacienteButton(ActionEvent event) {

        imagemCadastroVacina.setVisible(false);
        imagemPesquisarVacina.setVisible(false);
        imagemListarVacina.setVisible(false);
        cadastrarVacinaLabel.setVisible(false);
        pesquisarVacinaLabel.setVisible(false);
        listarVacinaLabel.setVisible(false);
        vacinaHelpLabel.setVisible(false);
        
        cadastrarPacienteLabel.setVisible(true);
        pesquisarPacienteLabel.setVisible(true);
        listarPacienteLabel.setVisible(true);
        pacienteHelpLabel.setVisible(true);
        novaVacinaLabel.setVisible(true);
        imagemNovaVacinaPaciente.setVisible(true);
        imagemCadastroPaciente.setVisible(true);
        imagemListarPaciente.setVisible(true);
        imagemPesquisarPaciente.setVisible(true);
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
        imagemCadastroPaciente.setVisible(false);
        imagemListarPaciente.setVisible(false);
        imagemPesquisarPaciente.setVisible(false);
        novaVacinaLabel.setVisible(false);
        imagemNovaVacinaPaciente.setVisible(false);

        cadastrarVacinaLabel.setVisible(true);
        pesquisarVacinaLabel.setVisible(true);
        listarVacinaLabel.setVisible(true);
        vacinaHelpLabel.setVisible(true);
        imagemCadastroVacina.setVisible(true);
        imagemPesquisarVacina.setVisible(true);
        imagemListarVacina.setVisible(true);

    }

}
