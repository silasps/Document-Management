package domain;

import domain.documento.Documento;
import repository.ListaGerente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Colaborador{

    private static Integer contador = 0;

    private List<Documento> documentosPendentesGer = new ArrayList<>();

    public Gerente(
                   String nome,
                   String sobrenome,
                   LocalDate dataDeNascimento,
                   String cpf,
                   String enderecoCompleto,
                   String cargo){
        super(contador++, nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto, cargo);
        ListaGerente.adicionar(this);
    }

    @Override
    public void cadastrarDocumento(Documento documento) {
        documentosPendentesGer.add(documento);
        System.out.println("Documento criado");
    }
}
