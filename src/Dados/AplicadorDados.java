package Dados;
import Modelo.pessoa.*;
import Modelo.vacina.*;

import java.io.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AplicadorDados {

    public void cadastrarAplicador(Aplicador ap) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Aplicador> aplicadores = new ArrayList<>();
        File arq = new File("listaAplicador.ser");
        if (arq.exists()) {
            aplicadores = listaAplicador();
        }
        aplicadores.add(ap);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(aplicadores);
        }
    }

    public ArrayList<Aplicador> listaAplicador() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Aplicador> aplicadores;

        File arq = new File("listaAplicador.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);

        aplicadores = (ArrayList<Aplicador>) lerObj.readObject();
        return aplicadores;
    }

}


