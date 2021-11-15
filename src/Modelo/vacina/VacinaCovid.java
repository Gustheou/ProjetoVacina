package Modelo.vacina;

public class VacinaCovid extends Vacina{

    private String laboratorio;
    private String validadeLote;

    public VacinaCovid() {}

    public VacinaCovid(String nome, String dataVacinacao, String lote, String vacinador, String localVacinacao,
                        String validadeLote, String laboratorio) {
        super(nome, dataVacinacao, lote, vacinador, localVacinacao, laboratorio);
        this.laboratorio = laboratorio;
        this.validadeLote = validadeLote;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getValidadeLote() {
        return validadeLote;
    }

    public void setValidadeLote(String validadeLote) {
        this.validadeLote = validadeLote;
    }

    @Override
    public String tostring() {
        return "\nDados: \n" +
                "Nome: " +getNome() +'\n'+
                "Laboratorio:" + getLaboratorio() + '\n'+
                "Data de Vacinacao: " + getDataVacinacao() + '\n' +
                "Lote: " + getLote() + '\n' +
                "Validade do lote: " + getValidadeLote() + '\n' +
                "Vacinador: " + getVacinador() + '\n' +
                "Local de Vacinacao: " + getLocalVacinacao() + '\n';
    }

}
