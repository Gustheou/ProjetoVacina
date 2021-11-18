package Controle;

import Modelo.pessoa.Aplicador;
import Modelo.pessoa.Paciente;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ControlePessoa {

    public void cadastrarAplicador (String nome, String cpf, String dataNascimento, String endereco, String senha) throws IOException,
            ClassNotFoundException,FileNotFoundException {

        Aplicador ap = new Aplicador(nome, cpf, dataNascimento, endereco, senha);
            ap.cadastrarAplicador(ap);
        }
    

    public ArrayList<Aplicador> listarAplicador () throws IOException, FileNotFoundException, ClassNotFoundException {
        Aplicador ap = new Aplicador();
        return ap.listarAplicador();
    }
    public String imprimirAplicador() throws IOException, FileNotFoundException, ClassNotFoundException{
        String aplicador ="";
        ArrayList<Aplicador> a = listarAplicador();
        for (int i=0; i<a.size(); i++){
            aplicador += a.get(i).toString() + "\n=-=-=-=-=-=-=-=-=-=-=-=\n";
        }
        return aplicador;
    }


    public Aplicador pesquisarAplicador (String cpf) throws IOException, ClassNotFoundException, FileNotFoundException {
        Aplicador p  = null;
        ArrayList<Aplicador> aplicadores = listarAplicador();
        for (int i = 0; i < aplicadores.size(); i++) {
            if (cpf.equals(aplicadores.get(i).getCpf())) {
                p = aplicadores.get(i);
                break;
            }
        }
        return p;
    }

    public String pesquisarSenha (String cpf) throws IOException, ClassNotFoundException, FileNotFoundException {
        String senha = null;
        ArrayList<Aplicador> aplicadores = listarAplicador();
        for (int i = 0; i < aplicadores.size(); i++) {
            if (cpf.equals(aplicadores.get(i).getCpf())) {
                 senha = aplicadores.get(i).getSenha();
            
            }
        }
        return senha;
    }

    public boolean pesquisarLoginMenu (String cpf) throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<Aplicador> aplicadores = listarAplicador();
        for (int i = 0; i < aplicadores.size(); i++) {
            if (cpf.equals(aplicadores.get(i).getCpf())) {
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarSenhaMenu (String senha) throws IOException, ClassNotFoundException, FileNotFoundException {
        ArrayList<Aplicador> aplicadores = listarAplicador();
        for (int i = 0; i < aplicadores.size(); i++) {
            if (senha.equals(aplicadores.get(i).getSenha())) {
                return true;
            }
        }
        return false;
    }

    //------------------------------------------------------------------------------------------------------------------//

    public void cadastrarPaciente (String nome, String cpf, String dataNascimento, String endereco) throws IOException,
            ClassNotFoundException,FileNotFoundException {

        Paciente p = new Paciente(nome, cpf, dataNascimento, endereco);
            p.cadastrarPaciente(p);
    }
    
    public String imprimirPaciente() throws IOException, FileNotFoundException, ClassNotFoundException{
        String paciente ="";
        ArrayList<Paciente> p = listarPaciente();
        for (int i=0; i<p.size(); i++){
            paciente += p.get(i).toString() + "\n=-=-=-=-=-=-=-=-=-=-=-=\n";
        }
        return paciente;
    }

    public ArrayList<Paciente> listarPaciente () throws IOException, FileNotFoundException, ClassNotFoundException {
        Paciente p = new Paciente();
        return p.listarPaciente();
    }

    public Paciente pesquisarPaciente (String cpf) throws IOException, ClassNotFoundException, FileNotFoundException {
        Paciente p  = null;
        ArrayList<Paciente> pacientes = listarPaciente();
        for (int i = 0; i < pacientes.size(); i++) {
            if (cpf.equals(pacientes.get(i).getCpf())) {
                p = pacientes.get(i);
                break;
            }
        }
        return p;
    }
}