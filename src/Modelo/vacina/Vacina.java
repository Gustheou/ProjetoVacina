package Modelo.vacina;

import Dados.VacinaDados;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Vacina {

    private String nome;
    private String dataVacinacao;
    private String lote;
    private String vacinador;
    private String localVacinacao;
    private String laboratorio;

    public Vacina() {}

    public Vacina(String nome, String dataVacinacao, String lote,
                  String vacinador, String localVacinacao, String laboratorio) {
        this.nome = nome;
        this.dataVacinacao = dataVacinacao;
        this.lote = lote;
        this.vacinador = vacinador;
        this.localVacinacao = localVacinacao;
        this.laboratorio = laboratorio;
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

    public String getVacinador() {
        return vacinador;
    }

    public void setVacinador(String vacinador) {
        this.vacinador = vacinador;
    }

    public String getLocalVacinacao() {
        return localVacinacao;
    }

    public void setLocalVacinacao(String localVacinacao) {
        this.localVacinacao = localVacinacao;
    }

    public abstract String tostring();

    public void cadastrarVacina (Vacina v) throws IOException, ClassNotFoundException, FileNotFoundException {
        VacinaDados vd = new VacinaDados();
        vd.cadastrarVacina(v);
    }

    public void removerVacina(Vacina v) throws IOException, ClassNotFoundException, FileNotFoundException {
        VacinaDados vd = new VacinaDados();
        vd.removerVacina(v);
    }

    public ArrayList<Vacina> listarVacinas() throws IOException, ClassNotFoundException, FileNotFoundException {
        VacinaDados vd = new VacinaDados();
        return vd.listarVacinas();
    }


}












