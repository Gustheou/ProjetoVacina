package Controle;
import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleEsqueceuSenha {

    

    @FXML
    private TextField cpfTextField;

    @FXML
    void voltarButton(ActionEvent event) {
        App.changeScreenMenu(event);
        senhaLabel.setVisible(false);
        senhaTextField.setVisible(false);
        cpfTextField.setText("");
        senhaTextField.setText("");
    }
    @FXML
    private Label senhaLabel;

    @FXML
    private TextField senhaTextField;

    ControlePessoa cA = new ControlePessoa();
    @FXML
    void recuperarSenha(ActionEvent event) {
        try {
            senhaLabel.setVisible(true);
            senhaTextField.setVisible(true);
            String cpf = cpfTextField.getText();
            String senha = cA.pesquisarSenha(cpf);
            senhaTextField.setText(senha);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }

}
