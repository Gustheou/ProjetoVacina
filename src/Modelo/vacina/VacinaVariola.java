package Modelo.vacina;

public class VacinaVariola extends Vacina{

    public VacinaVariola(String nome,String dataVacinacao, String lote, String vacinador, String localVacinacao) {
        super(nome,dataVacinacao, lote, vacinador, localVacinacao);
    }

    @Override
    public String tostring() {
        return "\nDados: \n" +
                "Nome: " +getNome() +'\n'+
                "Data de Vacinacao: " + getDataVacinacao() + '\n' +
                "Lote: " + getLote() + '\n' +
                "Vacinador: " + getVacinador() + '\n' +
                "Local de Vacinacao: " + getVacinador() + '\n';
    }
}
