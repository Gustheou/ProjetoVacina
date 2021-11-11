package Controle;

import Modelo.pessoa.Pessoa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ControlePessoa {

    public void cadastrarPessoa (String nome, String cpf, String dataNascimento, String endereco) throws IOException,
            ClassNotFoundException,FileNotFoundException {

        Pessoa p = new Pessoa(nome, cpf, dataNascimento, endereco) {
            @Override
            public String toString() {
                return null;
            }
        };
        p.cadastrarPessoa(p);
    }

    public ArrayList<Pessoa> listarPessoa () throws IOException, FileNotFoundException, ClassNotFoundException {
        Pessoa p = new Pessoa () {
            @Override
            public String toString() {
                return null;
            }
        };
        return p.listarPessoa();
    }

    public Pessoa pesquisarPessoa (String nome) throws IOException, ClassNotFoundException, FileNotFoundException {
        Pessoa p  = null;
        ArrayList<Pessoa> pessoas = listarPessoa();
        for (int i = 0; i < pessoas.size(); i++) {
            if (nome == pessoas.get(i).getNome()) {
                p = pessoas.get(i);
                break;
            }
        }
        return p;
    }

}