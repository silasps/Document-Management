package service;

import domain.Colaborador;
import domain.documento.Documento;
import repository.DocumentsList;

import java.util.Scanner;

public class Servico {

    public void cadastrarDocumentoService(Colaborador usuario, Colaborador responsavel){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o link do documento");
        String linkDocumento = scan.nextLine();

        Documento documento = new Documento(usuario.getIdentificador(), responsavel.getIdentificador(), linkDocumento, "Ativo", usuario.getCargo());
        usuario.cadastrarDocumento(documento);
        System.out.println("Documento criado");
        System.out.println(documento+"\n");
    }

    public void listarDocumentosService(Colaborador usuario){
        usuario.listarDocumentos(usuario);
    }

    public void tramitarDocumento(Colaborador usuario){
        Scanner scan = new Scanner(System.in);
        System.out.println("**** Segue Lista dos Documentos em sua responsabilidade ****");
        DocumentsList.listar(usuario);
        System.out.println("\nDigite o ID do documento a ser tramitado:");
        Integer idDoc = scan.nextInt();
        System.out.println("O que você deseja fazer?");

        if(usuario.getCargo() == "Funcionário"){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("1. Encaminhar para o Gestor");
            Integer option = scan1.nextInt();
            DocumentsList.tramitar(usuario, idDoc, 0);
        } else if (usuario.getCargo() == "Gestor") {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("1. Aprovar\n2. Reprovar");
            Integer option = scan1.nextInt();
            DocumentsList.tramitar(usuario, idDoc, option);
        } else {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("1. Arquivar\n2. Desarquivar");
            Integer option = scan1.nextInt();
            DocumentsList.tramitar(usuario, idDoc, option);
        }
    }
}
