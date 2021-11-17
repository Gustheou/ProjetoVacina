package Modelo.vacina;

import Dados.VacinaDados;
import Modelo.pessoa.Aplicador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Vacina implements Serializable{

    private String nome;
    private String dataVacinacao;
    private String lote;
    private String aplicador;
    private String localVacinacao;
    private String laboratorio;
    private String validadeLote;

    public Vacina() {}

    Aplicador ap;

    public Vacina(String nome, String dataVacinacao, String lote, String aplicador, String localVacinacao) {
        this.nome = nome;
        this.dataVacinacao = dataVacinacao;
        this.lote = lote;
        this.aplicador = aplicador;
        this.localVacinacao = localVacinacao;
    }

    public Vacina(String nome, String dataVacinacao, String lote, String aplicador, String localVacinacao, 
                  String laboratorio, String validadeLote) {
        this.nome = nome;
        this.dataVacinacao = dataVacinacao;
        this.lote = lote;
        this.aplicador = aplicador;
        this.localVacinacao = localVacinacao;
        this.laboratorio = laboratorio;
        this.validadeLote = validadeLote;
    }

    public void setLaboratorio (String laboratorio) {
        this.laboratorio = laboratorio;
    }
    public String getLaboratorio () {
        return laboratorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(String dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getAplicador() {
        return aplicador;
    }

    public void setAplicador(String aplicador) {
        this.aplicador = aplicador;
    }

    public String getValidadeLote() {
        return validadeLote;
    }

    public void setValidadeLote(String validadeLote ) {
        this.validadeLote = validadeLote;
    }

    public String getLocalVacinacao() {
        return localVacinacao;
    }

    public void setLocalVacinacao(String localVacinacao) {
        this.localVacinacao = localVacinacao;
    }

    public String tostring(){
        return "\nDados: \n" +
                "Nome:" + getNome() + '\n'+
                "Lote: " + getLote() + '\n'+
                "Aplicador: " + ap.getNome() + '\n'+
                "Local de Vacinacao: " + getLocalVacinacao() + '\n'+
                "Laboratório: " + getLaboratorio() + '\n'+
                "Validade de Lote: " + getValidadeLote() + '\n';
    }

    public void cadastrarVacina (Vacina v) throws IOException, ClassNotFoundException, FileNotFoundException {
        VacinaDados vd = new VacinaDados();
        vd.cadastrarVacina(v);
    }

    public ArrayList<Vacina> listarVacinas() throws IOException, ClassNotFoundException, FileNotFoundException {
        VacinaDados vd = new VacinaDados();
        return vd.listarVacinas();
    }


}