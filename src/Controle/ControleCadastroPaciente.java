package Controle;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import Visao.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ControleCadastroPaciente {

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
    private TextField enderecoTextField;

    @FXML
    private TextField cpfTextField;

    @FXML
    private TextField emailTextField;

    ControlePessoa cP = new ControlePessoa();
    @FXML
    void concluirCadastro(ActionEvent event) {
        try {
            String nome = nomeTextField.getText();
            int dia = Integer.parseInt(diaTextField.getText());
            int mes = Integer.parseInt(mesTextField.getText());
            int ano = Integer.parseInt(anoTextField.getText());
            String cpf = cpfTextField.getText();
            String endereco = enderecoTextField.getText();
            String email = emailTextField.getText();
            
            int idade = 2021 - ano; //ANIVERSARIO COREANO. Procurar biblioteca
            if (nome.equals("") || dia == 0 || mes == 0 || ano == 0 || cpf.equals("") || endereco.equals("") || email.equals("") || idade == 0) {
                JOptionPane.showMessageDialog(null, "          Error Code: 604\n\nCadastro não foi efetuado. (′⌒`)\nMotivo: Informações incompletas.");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro do paciente efetuado com sucesso!");
                App.changeScreenPosLogin();
                //A partir dessa linha, será escrita no arquivo.
                String dataDeNascimento = (String.valueOf(dia)+" / ");
                dataDeNascimento += (String.valueOf(mes)+" / ");
                dataDeNascimento += (String.valueOf(ano));
                cP.cadastrarPaciente(nome, cpf, dataDeNascimento, endereco);
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
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        nomeTextField.setText("");
        diaTextField.setText("");
        mesTextField.setText("");
        anoTextField.setText("");
        cpfTextField.setText("");
        enderecoTextField.setText("");
        emailTextField.setText("");
        
    }

    @FXML
    void voltarParaMenu(ActionEvent event) {
        App.changeScreenPosLogin();
    }

}
