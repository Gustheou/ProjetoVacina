package Controle;

import java.io.FileNotFoundException;
import java.io.IOException;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

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
    private TextField aplicadorTextField;

    @FXML
    private Label laboratorioLabel;

    @FXML
    private Label validadeLabel;
    
    @FXML
    private GridPane gridPaneValidadeCovid;

    private String vacinaTipo;

    ControleVacina cV = new ControleVacina();

    public void setVacina (String vacinaTipo) {
        this.vacinaTipo = vacinaTipo;
    }

    public String getVacina() {
        return vacinaTipo;
    }

    @FXML
    void bcgMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("BCG");
        setVacina("BCG");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void cadastrarVacinaButton(ActionEvent event) {
        try {
            String vacinaTipo = getVacina();
            int dia = Integer.parseInt(validadeDiaTextField.getText());
            int mes = Integer.parseInt(validadeMesTextField.getText());
            int ano = Integer.parseInt(validadeAnoTextField.getText());
            String dataDeValidade = String.valueOf(dia);
            dataDeValidade += " / "+ String.valueOf(mes);
            dataDeValidade += " / "+ String.valueOf(ano);

            String dataVacinacao = "";
            //String dataVacinacao = DataVacinacaoTextField.getText();
            
            String lote = String.valueOf(LoteTextField.getText());
            String aplicador = String.valueOf(aplicadorTextField.getText());
            String localVacinacao = String.valueOf(LocalDeDestinoTextField.getText());
            String laboratorio = String.valueOf(laboratorioTextField.getText());
           
            cV.cadastrarVacina(vacinaTipo, dataVacinacao, lote, aplicador, localVacinacao, laboratorio, dataDeValidade);
            //É para cadastrar a vacina, ou o usuário vacinando?
        } catch (NumberFormatException e) {
            validadeDiaTextField.setText("dia");
            validadeDiaTextField.requestFocus();
            validadeDiaTextField.selectAll();

            validadeMesTextField.setText("mês");
            validadeMesTextField.requestFocus();
            validadeAnoTextField.selectAll();

            validadeAnoTextField.setText("ano");
            validadeAnoTextField.requestFocus();
            validadeAnoTextField.selectAll();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        textSplitMenuButton.setText("Selecione uma");
        validadeDiaTextField.setText("");
        validadeMesTextField.setText("");
        validadeAnoTextField.setText("");
        laboratorioTextField.setText("");
        aplicadorTextField.setText("");
        LocalDeDestinoTextField.setText("");
        LoteTextField.setText("");
    }

     @FXML
    void voltarMenuPosLoginButton(ActionEvent event) {
        App.changeScreenPosLogin();
    }

    @FXML
    void covidMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Covid");
        setVacina("Covid");
        laboratorioLabel.setVisible(true);
        laboratorioTextField.setVisible(true);
        validadeLabel.setVisible(true);
        gridPaneValidadeCovid.setVisible(true);
    }

    @FXML
    void dtpMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("DTP");
        setVacina("DTP");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void febreAmarelaMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Febre amarela");
        setVacina("Febre amarela");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void influenzaMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Influenza");
        setVacina("Influenza");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void meninginteMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Meninginte");
        setVacina("Meninginte");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void poliomeliteMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Poliomelite");
        setVacina("Poliomelite");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void rotaVirusMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Rota virus");
        setVacina("Rota virus");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void tripliceViralMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Triplice viral");
        setVacina("Triplice viral");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

    @FXML
    void variolaMenuItem(ActionEvent event) {
        textSplitMenuButton.setText("Variola");
        setVacina("Variola");
        laboratorioLabel.setVisible(false);
        laboratorioTextField.setVisible(false);
        validadeLabel.setVisible(false);
        gridPaneValidadeCovid.setVisible(false);
    }

}
