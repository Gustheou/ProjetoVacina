package Dados;
import Modelo.pessoa.*;
import Modelo.vacina.*;

import java.io.*;
import java.util.ArrayList;

public class PessoaDados {

    public void cadastrarPessoa (Pessoa p) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        File arq = new File("listaPessoa.ser");
        if (arq.exists()) {
            pessoas = listaPessoa();
        }
        pessoas.add(p);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(pessoas);
        }
    }

    public ArrayList<Pessoa> listaPessoa() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Pessoa> pessoas;

        File arq = new File("listaPessoa.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);

        pessoas = (ArrayList<Pessoa>) lerObj.readObject();
        return pessoas;
    }

    public void removerPessoa (Pessoa p) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Pessoa> pessoas;
        pessoas = listaPessoa();

        for (int i = 0; i < pessoas.size(); i++) {
            if (p.getNome().equals(pessoas.get(i).getNome()))  {
                pessoas.remove(i);
                break;
            }
        }

        File arq = new File("listaPessoa.ser");
        FileOutputStream arquivos = new FileOutputStream(arq);

        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(pessoas);
        }

    }
}
