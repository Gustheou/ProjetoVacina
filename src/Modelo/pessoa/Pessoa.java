package Modelo.pessoa;

import Dados.PessoaDados;
import Dados.VacinaDados;
import Modelo.vacina.Vacina;
import Modelo.Vacinacao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Pessoa implements Vacinacao {
    // a comorbidade ta incompleta

    private String nome;
    private int idade;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String password;

    private Vacina v;

    public Pessoa(){};

    public Pessoa(String nome, int idade, String cpf, String dataNascimento, String endereco,
                  String password) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String imprimirDados();

    public abstract String tipoPessoa();

   /* public boolean primeiraDose (){
        return true;
    };  //????????

    public boolean segundaDose (){
        if (primeiraDose() == true){
            return true;
        }
        return false;
    }

    public boolean terceiraDose (){
        if (segundaDose() == true && v.getLaboratorio() == "Butantan"){
            return true;
        }
        return false;
    }

    public boolean idadeCerta (){
        if (idade > 12 ){
            return true;
        }
        return false;
    }

    public String tipoDeVacina () {
        if (primeiraDose() == true) {
            return v.getLaboratorio();
        }
        return null;
    }
    */

    public void cadastrarPessoa (Pessoa p) throws IOException, ClassNotFoundException, FileNotFoundException {
        PessoaDados pd = new PessoaDados();
        pd.cadastrarPessoa(p);
    }

    public void removerPessoa (Pessoa p) throws IOException, ClassNotFoundException, FileNotFoundException {
        PessoaDados pd = new PessoaDados();
        pd.removerPessoa(p);
    }

    public ArrayList<Pessoa> listarPessoa() throws IOException, ClassNotFoundException, FileNotFoundException {
        PessoaDados pd = new PessoaDados();
        return pd.listaPessoa();
    }


}


