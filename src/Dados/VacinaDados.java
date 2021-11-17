package Dados;
import Modelo.vacina.Vacina;
import java.io.*;
import java.util.ArrayList;

public class VacinaDados {

    public void cadastrarVacina (Vacina v) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Vacina> vacinas = new ArrayList<>();
        File arq = new File("listaVacinas.ser");
        if (arq.exists()) {
            vacinas = listarVacinas();
        }
        vacinas.add(v);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(vacinas);
        }
    }

    public ArrayList<Vacina> listarVacinas() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Vacina> vacinas;

        File arq = new File("listaVacinas.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);

        vacinas = (ArrayList<Vacina>) lerObj.readObject();
        return vacinas;
    }


}
