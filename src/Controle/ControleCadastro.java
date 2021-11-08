package Controle;
import Visao.App;
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
            if (nome.equals("") || dataDeNascimento.equals("") || cpf.equals("") || endereco.equals("") || password.equals("") || email.equals("")) {
                JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!\nLogin: "+ cpf +"\nSenha: "+ password);
                //A partir dessa linha, será escrita no arquivo.
            }
            App.changeScreenMenu(event);
            
        } catch (Exception e) {
            
        }
        nomeTextField.setText("");
        dataDeNascimentoTextField.setText("");
        cpfTextField.setText("");
        enderecoTextField.setText("");
        senhaTextField.setText("");
        emailTextField.setText("");
        
        
    }

    @FXML
    void voltarParaMenu(ActionEvent event) {
        App.changeScreenMenu(event);
    }

}
