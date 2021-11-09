package Controle;

import Dados.PessoaDados;
import Modelo.pessoa.Pessoa;
import Modelo.vacina.Vacina;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ControlePessoa {

    public void cadastrarPessoa (String nome, int idade, String cpf, String dataNascimento, String endereco,
                                 String comobirdade) throws IOException, ClassNotFoundException,
            FileNotFoundException {

        Pessoa p = new Pessoa(nome, idade, cpf, dataNascimento, endereco, comobirdade) {
            @Override
            public String imprimirDados() {
                return null;
            }

            @Override
            public String tipoPessoa() {
                return null;
            }

            @Override
            public boolean vacinar() {
                return false;
            }

        };
        p.cadastrarPessoa(p);
    }

    public void removerPessoa (String nome, int idade, String cpf, String dataNascimento, String endereco,
                               String comobirdade) throws IOException, ClassNotFoundException, FileNotFoundException {
        Pessoa p = new Pessoa(nome, idade, cpf, dataNascimento, endereco, comobirdade) {
            @Override
            public String imprimirDados() {
                return null;
            }

            @Override
            public String tipoPessoa() {
                return null;
            }

            @Override
            public boolean vacinar() {
                return false;
            }

        };
        p.removerPessoa(p);
    }

    public ArrayList<Pessoa> listarPessoa () throws IOException, FileNotFoundException, ClassNotFoundException {
        Pessoa p = new Pessoa () {

            @Override
            public String imprimirDados() {
                return null;
            }

            @Override
            public String tipoPessoa() {
                return null;
            }

            @Override
            public boolean vacinar() {
                return false;
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