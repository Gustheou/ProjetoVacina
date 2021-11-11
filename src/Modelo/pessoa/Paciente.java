package Modelo.pessoa;

public class Paciente extends Pessoa{
    public Paciente(String nome, String cpf, String dataNascimento, String endereco) {
        super(nome, cpf, dataNascimento, endereco);
    }

    @Override
    public String toString() {
        return "\nDados: \n" +
                "Nome:" + getNome() + '\n'+
                "CPF: " + getCpf() + '\n'+
                "Data de Nascimento: =" + getDataNascimento() + '\n'+
                "Endereço: " + getEndereco() + '\n';

        }
}
