package Modelo.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

import Dados.AplicadorDados;

public class Aplicador implements Serializable {
    
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String senha;

    public Aplicador(){}

    public Aplicador(String nome, String cpf, String dataNascimento, String endereco, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha () {
        return senha;
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

    public void cadastrarAplicador (Aplicador ap) throws IOException, ClassNotFoundException, FileNotFoundException {
        AplicadorDados apd = new AplicadorDados();
        apd.cadastrarAplicador(ap);
    }

    public ArrayList<Aplicador> listarAplicador() throws IOException, ClassNotFoundException, FileNotFoundException {
        AplicadorDados apd = new AplicadorDados();
        return apd.listaAplicador();
    }
}