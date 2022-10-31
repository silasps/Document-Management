package domain;

import domain.documento.Documento;
import repository.DocumentsList;
import repository.ListaFuncionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Colaborador {

    private static Integer contador = 0;

    public List<Documento> documentosFuncionario = new ArrayList<>();

    public Funcionario(
            String nome,
            String sobrenome,
            LocalDate dataDeNascimento,
            String cpf,
            String enderecoCompleto,
            String cargo) {
        super(contador++, nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto, cargo);
        ListaFuncionario.adicionar(this);
    }

    public Funcionario(){
        super();
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Funcionario.contador = contador;
    }

    public List<Documento> getDocumentosFuncionario() {
        return documentosFuncionario;
    }

    public void setDocumentosFuncionario(List<Documento> documentosFuncionario) {
        this.documentosFuncionario = documentosFuncionario;
    }



    @Override
    public void cadastrarDocumento(Documento documento) {
        DocumentsList.adicionar(documento);
    }

    @Override
    public void listarDocumentos(Colaborador usuario) {
        DocumentsList.listar(usuario);
    }

    @Override
    public void tramitarDocumento(Colaborador usuario){

    }
}