package Dados;
import Modelo.pessoa.*;
import Modelo.vacina.*;

import java.io.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PacienteDados {

    public void cadastrarPaciente(Paciente p) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        File arq = new File("listaPaciente.ser");
        if (arq.exists()) {
            pacientes = listaPaciente();
        }
        pacientes.add(p);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(pacientes);
        }
    }

    public ArrayList<Paciente> listaPaciente() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Paciente> pacientes;

        File arq = new File("listaPaciente.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);

        pacientes = (ArrayList<Paciente>) lerObj.readObject();
        return pacientes;
    }

}


