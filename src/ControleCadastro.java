import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ControleCadastro {

    @FXML
    private AnchorPane AncherPane;

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField dataDeNascimentoTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private TextField enderecoTextField;

    @FXML
    private TextField senhaTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    void concluirCadastro(ActionEvent event) {
        try {
            String nome = nomeTextField.getText();
            String dataDeNascimento = dataDeNascimentoTextField.getText();
            String cpf = cpfTextField.getText();
            String endereco = enderecoTextField.getText();
            String password = senhaTextField.getText();
            String email = emailTextField.getText();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!\nLogin: "+ cpf +"\nSenha: "+ password);
            App.changeScreenMenu(event);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        
    }

    @FXML
    void voltarParaMenu(ActionEvent event) {
        App.changeScreenMenu(event);
    }

}
