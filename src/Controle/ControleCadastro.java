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
    private TextField diaTextField;

    @FXML
    private TextField mesTextField;

    @FXML
    private TextField anoTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private TextField enderecoTextField;

    @FXML
    private TextField senhaTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    void concluirCadastro(ActionEvent event) throws ClassNotFoundException, FileNotFoundException, IOException {
        try {
            String nome = nomeTextField.getText();
            int dia = Integer.parseInt(diaTextField.getText());
            int mes = Integer.parseInt(mesTextField.getText());
            int ano = Integer.parseInt(anoTextField.getText());
            String cpf = cpfTextField.getText();
            String endereco = enderecoTextField.getText();
            String password = senhaTextField.getText();
            String email = emailTextField.getText();
            
            int idade = 2021 - ano; //ANIVERSARIO COREANO. Procurar biblioteca
            if (nome.equals("") || dia == 0 || mes == 0 || ano == 0 || cpf.equals("") || endereco.equals("") || password.equals("") || email.equals("") || idade == 0) {
                JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro do aplicador efetuado com sucesso!\nLogin: "+ cpf +"\nSenha: "+ password);
                App.changeScreenMenu(event);
                //A partir dessa linha, será escrita no arquivo.
                String dataDeNascimento = (String.valueOf(dia)+" ");
                dataDeNascimento += (String.valueOf(mes)+" ");
                dataDeNascimento += (String.valueOf(ano));
                cP.cadastrarPessoa(nome, cpf, dataDeNascimento, endereco);
            }
            
        } catch (NumberFormatException e) {
            diaTextField.setText("Dia:");
            diaTextField.selectAll();
            diaTextField.requestFocus();

            mesTextField.setText("Mês:");
            mesTextField.selectAll();
            mesTextField.requestFocus();

            anoTextField.setText("Ano:");
            anoTextField.selectAll();
            anoTextField.requestFocus();
        }
        nomeTextField.setText("");
        diaTextField.setText("");
        mesTextField.setText("");
        anoTextField.setText("");
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
