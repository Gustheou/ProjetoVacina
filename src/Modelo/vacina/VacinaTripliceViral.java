package Modelo.vacina;

public class VacinaTripliceViral extends Vacina{

    public VacinaTripliceViral(String nome, String dataVacinacao, String lote, String vacinador, String localVacinacao, String laboratorio) {
        super(nome, dataVacinacao, lote, vacinador, localVacinacao, laboratorio);
    }

    @Override
    public String tostring() {
        return "\nDados: \n" +
                "Nome: " +getNome() +'\n'+
                "Data de Vacinacao: " + getDataVacinacao() + '\n' +
                "Lote: " + getLote() + '\n' +
                "Vacinador: " + getVacinador() + '\n' +
                "Local de Vacinacao: " + getLocalVacinacao() + '\n';
    }
}
