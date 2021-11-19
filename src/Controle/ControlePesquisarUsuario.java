package Controle;
import Modelo.pessoa.Aplicador;
import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class ControlePesquisarUsuario {

    @FXML
    private TextField cpfTextField;


    @FXML
    private TextArea textArea;

    @FXML
    void voltarButton(ActionEvent event) {
        App.changeScreenMenu(event);
        cpfTextField.setText("");
        textArea.setText("");
        textArea.setVisible(false);
        
    }
    ControlePessoa cA = new ControlePessoa();
    @FXML
    void pesquisarButton(ActionEvent event) {
        try {
            String cpf = String.valueOf(cpfTextField.getText());
            Aplicador cpfzin = cA.pesquisarAplicador(cpf);
            String dados = String.valueOf(cpfzin);
            textArea.setText(dados);
            textArea.setVisible(true);
        } catch (Exception e) {

        }
    }

}
