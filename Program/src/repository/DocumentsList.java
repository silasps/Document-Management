package repository;

import domain.Colaborador;
import domain.Funcionario;
import domain.documento.Documento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentsList {
        public static List<Documento> documents = new ArrayList<>();

        public static void adicionar(Documento documento){
            documents.add(documento);
        }

        public static Documento retornar(Integer id){
            return documents.get(id);
        }

    public static void setDocuments(List<Documento> documents) {
        DocumentsList.documents = documents;
    }

    //O usuário só poderá listar os documentos sob a responsabilidade do seu setor
    public static void listar(Colaborador usuario){
            documents.forEach(document ->{
                if(usuario.getCargo().equals(document.getLocal())){
                    System.out.println(document);
                }
                if(usuario.getCargo().equals("Gerente") && document.getLocal().equals("Arquivo")){
                    System.out.println(document);
                }
            });
        }

    public static void listarDocumentos(){
            if(documents.isEmpty()){
                System.out.println("Nenhum documento adicionado");
            }
        documents.forEach(System.out::println);
    }

    public static void tramitar(Colaborador usuario, Integer idDoc, Integer movimento){
        documents.forEach(document ->{
            if(idDoc == document.getIdentificador()){
                document.setIdentificadorResponsavel(usuario.getIdentificador());
                //Ação quando o usuário é Funcionário
                if(usuario.getCargo() == "Funcionário"){
                document.setLocal("Supervisor");
                    System.out.println("Documento enviado para o Supervisor");
                //Ação quando o usuário é Supervisor
                } else if (usuario.getCargo() == "Supervisor") {
                    if(movimento == 1){ //Aprovar
                        document.setLocal("Gerente");
                        System.out.println("Documento enviado para o Gerente");
                    } else{ //Reprovar
                        document.setLocal("Funcionário");
                        System.out.println("Documento enviado para o Funcionário");
                    }
                //Ação quando o usuário é Gerentee
                } else{
                    if(movimento == 1){
                        document.setLocal("Arquivo");
                        document.setEstadoDocumento("Arquivado");
                        System.out.println("Documento enviado para o Arquivo");
                    } else{
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Para onde deseja enviar o Documento?\n\n1. Para o Funcionário\n2. Para o Supervisor");
                        Integer option = scan.nextInt();
                        switch (option){
                            case 1: //Para o funcionário
                                document.setLocal("Funcionário");
                                document.setEstadoDocumento("Ativo");
                                System.out.println("Documento enviado para o Funcionário");
                                break;
                            case 2: //Para o Supervisor
                                document.setLocal("Supervisor");
                                document.setEstadoDocumento("Ativo");
                                System.out.println("Documento enviado para o Supervisor");
                                break;
                        }
                    }
                }
            }
        });
    }
}
