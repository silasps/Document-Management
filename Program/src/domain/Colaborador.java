package domain;

import domain.documento.Documento;
import repository.DocumentsList;
import repository.ListaPessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Pessoa {

    private List<Documento> documentosGerais = new ArrayList<>();
    public Colaborador(
               Integer identificador,
               String nome,
               String sobrenome,
               LocalDate dataDeNascimento,
               String cpf,
               String enderecoCompleto,
               String cargo
    ){
        super(identificador, nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto, cargo);
        ListaPessoa.adicionar(this);
    }

    public Colaborador(){

    }

    public void cadastrarDocumento(Documento documento) {
        documentosGerais.add(documento);
    }

    public void listarDocumentos(Colaborador usuario){
        DocumentsList.listar(usuario);
    }

    public void tramitarDocumento(Colaborador usuario){

    }
}
