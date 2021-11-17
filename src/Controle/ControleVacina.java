package Controle;

import Modelo.vacina.Vacina;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ControleVacina {

    public void cadastrarVacina (String nome, String dataVacinacao, String lote, String aplicador, String localVacinacao, 
            String laboratorio, String validadeLote ) throws IOException, ClassNotFoundException,FileNotFoundException {

        Vacina v = new Vacina(nome, dataVacinacao, lote, aplicador, localVacinacao, laboratorio, validadeLote);
        v.cadastrarVacina(v);
    }

    public void cadastrarVacina2 (String nome, String dataVacinacao, String lote, String aplicador, String localVacinacao) throws IOException, ClassNotFoundException,FileNotFoundException {

        Vacina v = new Vacina(nome, dataVacinacao, lote, aplicador, localVacinacao);
        v.cadastrarVacina(v);
    }

    public ArrayList<Vacina> listarVacina () throws IOException, FileNotFoundException, ClassNotFoundException {
        Vacina v = new Vacina();
        return v.listarVacinas();
    }
    
    public String imprimirVacina() throws IOException, FileNotFoundException, ClassNotFoundException{
        String vacina ="";
        ArrayList<Vacina> v = listarVacina();
        for (int i=0; i<v.size(); i++){
            vacina += v.get(i).tostring() + "\n=-=-=-=-=-=-=-=-=-=-=-=\n";
        }
        return vacina;
    }

    public Vacina pesquisarVacina(String lote) throws IOException, ClassNotFoundException, FileNotFoundException {
        Vacina v  = null;
        ArrayList<Vacina> vacinas = listarVacina();
        for (int i = 0; i < vacinas.size(); i++) {
            if (lote.equals(vacinas.get(i).getLote())) {
                v = vacinas.get(i);
                break;
            }
        }
        return v;
    }

}
