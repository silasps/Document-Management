package entities;

import java.util.Date;

public class Supervisor extends Pessoa{

    public Supervisor(){
        super();
    }

    public Supervisor(String identificador, String nome, String sobrenome, Date dataDeNascimento, String cpf, String enderecoCompleto){
        super(identificador, nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto);
    }
}
