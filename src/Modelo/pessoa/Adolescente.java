package Modelo.pessoa;

public class Adolescente extends Pessoa {
    public Adolescente(String nome, int idade,String cpf, String dataNascimento, String endereco, String comobirdade) {
        super(nome, idade, cpf, dataNascimento, endereco, comobirdade);
    }


    @Override
    public String imprimirDados() {
        return "\nDados: \n" +
                "Nome:" + getNome() + '\n'+
                "Tipo: " +tipoPessoa()+ '\n'+
                "Idade: " +getIdade()+ '\n'+
                "CPF: " + getCpf() + '\n'+
                "Data de Nascimento: =" + getDataNascimento() + '\n'+
                "Endereço: " + getEndereco() + '\n'+
                "Comorbidade: " + getComobirdade() + '\n';

    }

    @Override
    public String tipoPessoa() {
        return "Adolescente";
    }

    @Override
    public boolean vacinar() {
        return true;
    }
}
