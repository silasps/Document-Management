package domain;

import domain.documento.Documento;
import repository.ListaSupervisor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Supervisor extends Colaborador {

    private static Integer contador = 0;

    private List<Documento> documentosPendentesSup = new ArrayList<>();

    public Supervisor(
            String nome,
            String sobrenome,
            LocalDate dataDeNascimento,
            String cpf,
            String enderecoCompleto,
            String cargo) {
        super(contador++, nome, sobrenome, dataDeNascimento, cpf, enderecoCompleto, cargo);
        ListaSupervisor.adicionar(this);
    }

    @Override
    public void cadastrarDocumento(Documento documento) {
        documentosPendentesSup.add(documento);
    }


}