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

    public ArrayList<Vacina> listarVacina () throws IOException, FileNotFoundException, ClassNotFoundException {
        Vacina v = new Vacina() {
            @Override
            public String tostring() {
                return null;
            }
        };
        return v.listarVacinas();
    }

    public Vacina pesquisarVacina(String nome) throws IOException, ClassNotFoundException, FileNotFoundException {
        Vacina v  = null;
        ArrayList<Vacina> vacinas = listarVacina();
        for (int i = 0; i < vacinas.size(); i++) {
            if (nome == vacinas.get(i).getNome()) {
                v = vacinas.get(i);
                break;
            }
        }
        return v;
    }

}