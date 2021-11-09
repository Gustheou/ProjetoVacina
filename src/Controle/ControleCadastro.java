package Controle;
import Visao.App;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import Controle.ControlePessoa;

public class ControleCadastro {

    ControlePessoa cP = new ControlePessoa();
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
    private TextField IdadeTextField;

    @FXML
    void concluirCadastro(ActionEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
        try {
            String nome = nomeTextField.getText();
            String dataDeNascimento = dataDeNascimentoTextField.getText();
            String cpf = cpfTextField.getText();
            String endereco = enderecoTextField.getText();
            String password = senhaTextField.getText();
            String email = emailTextField.getText();
            int idade = Integer.parseInt(IdadeTextField.getText());
            if (nome.equals("") || dataDeNascimento.equals("") || cpf.equals("") || endereco.equals("") || password.equals("") || email.equals("") || idade == 0) {
                JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!\nLogin: "+ cpf +"\nSenha: "+ password);
                App.changeScreenMenu(event);
                //A partir dessa linha, será escrita no arquivo.
                cP.cadastrarPessoa(nome, idade, cpf, dataDeNascimento, endereco, password);
                //modifiquei nas classes o termo comorbidade pela senha.... Não sei como proceder ~ Gugu

            }
            
        } catch (NumberFormatException e) {
            IdadeTextField.setText("Digite a sua idade:");
            IdadeTextField.selectAll();
            IdadeTextField.requestFocus();
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
