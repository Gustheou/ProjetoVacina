package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class ControleCadastroVacina {

    @FXML
    private TextField validadeDiaTextField;

    @FXML
    private TextField validadeMesTextField;

    @FXML
    private TextField validadeAnoTextField;

    @FXML
    private TextField laboratorioTextField;

    @FXML
    private TextField LoteTextField;

    @FXML
    private TextField LocalDeDestinoTextField;

    @FXML
    private SplitMenuButton textSplitMenuButton;

    @FXML
    void bcgMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("BCG");
    }

    @FXML
    void cadastrarVacina(ActionEvent event) {

    }

    @FXML
    void covidMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Covid");
    }

    @FXML
    void dtpMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("DTP");
    }

    @FXML
    void febreAmarelaMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Febre amarela");
    }

    @FXML
    void influenzaMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Influenza");
    }

    @FXML
    void meninginteMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Meninginte");
    }

    @FXML
    void poliomeliteMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Poliomelite");
    }

    @FXML
    void rotaVirusMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Rota virus");
    }

    @FXML
    void tripliceViralMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Triplice viral");
    }

    @FXML
    void variolaMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Variola");
    }

}
