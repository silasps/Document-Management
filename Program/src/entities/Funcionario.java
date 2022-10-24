package entities;

import java.util.Date;

public class Funcionario extends Pessoa{

    public Funcionario(){
        super();
    }

    public Funcionario(String identificador, String nome, String sobrenome, Date dataDeNascimento, String cpf, String enderecoCompleto){
        super(identificador, nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto);
    }

}
