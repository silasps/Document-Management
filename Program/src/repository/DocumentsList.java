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

    public static void listar(Colaborador usuario){
            documents.forEach(document ->{
                if(usuario.getCargo() == document.getLocal()){
                    System.out.println(document);
                }
            });
        }

    public static void tramitar(Colaborador usuario, Integer idDoc, Integer movimento){
        documents.forEach(document ->{
            if(idDoc == document.getIdentificador()){
                document.setIdentificadorResponsavel(usuario.getIdentificador());
                if(usuario.getCargo() == "Funcionário"){
                document.setLocal("Gestor");
                    System.out.println("Documento enviado para o Gestor");
                } else if (usuario.getCargo() == "Gestor") {
                    if(movimento == 1){
                        document.setLocal("Gerente");
                        System.out.println("Documento enviado para o Gerente");
                    } else{
                        document.setLocal("Funcionário");
                        System.out.println("Documento enviado para o Funcionário");
                    }
                } else{
                    if(movimento == 1){
                        document.setLocal("Arquivo");
                        System.out.println("Documento enviado para o Arquivo");
                    } else{
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Para onde deseja enviar o Documento?\n\n1. Para o Funcionário\n2. Para o Gestor");
                        Integer option = scan.nextInt();
                        switch (option){
                            case 1: //Para o funcionário
                                document.setLocal("Funcionário");
                                System.out.println("Documento enviado para o Funcionário");
                            case 2: //Para o Gestor
                                document.setLocal("Gestor");
                                System.out.println("Documento enviado para o Gestor");
                        }
                    }
                }
            }
        });
    }
}
