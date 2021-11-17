package Modelo.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import Dados.PacienteDados;

public class Paciente implements Serializable {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;

    public Paciente(){}

    public Paciente(String nome, String cpf, String dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "\nDados: \n" +
                "Nome:" + getNome() + '\n'+
                "CPF: " + getCpf() + '\n'+
                "Data de Nascimento: " + getDataNascimento() + '\n'+
                "Endereço: " + getEndereco() + '\n';

        }

        
    public void cadastrarPaciente (Paciente p) throws IOException, ClassNotFoundException, FileNotFoundException {
        PacienteDados pd = new PacienteDados();
        pd.cadastrarPaciente(p);
    }
    
    public ArrayList<Paciente> listarPaciente() throws IOException, ClassNotFoundException, FileNotFoundException {
        PacienteDados pd = new PacienteDados();
        return pd.listaPaciente();
    }  
    

}