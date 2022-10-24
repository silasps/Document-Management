package entities;

import java.util.Date;

public class Gerente extends Pessoa{

    public Gerente(){
        super();
    }

    public Gerente(String identificador, String nome, String sobrenome, Date dataDeNascimento, String cpf, String enderecoCompleto){
        super(identificador, nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto);
    }
}
