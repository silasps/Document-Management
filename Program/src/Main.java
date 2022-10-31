import domain.Funcionario;
import domain.Gerente;
import domain.Supervisor;
import repository.*;
import service.Servico;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Albert", "Marques", LocalDate.of(1991, 12, 2), "050123456789", "Av Marte 1732", "Funcionário");

        Funcionario funcionario1 = new Funcionario("Rosana", "Rodrigues", LocalDate.of(1980, 8, 8), "050123456789", "Av Amazonas 3789", "Funcionário");

        Funcionario funcionario3 = new Funcionario("Albert", "Marques", LocalDate.of(1991, 12, 2), "050123456789", "Av Marte 1732", "Funcionário");

        Supervisor supervisor = new Supervisor("Manoel", "Dias", LocalDate.of(1975, 5, 5), "050123456789", "Rua Timbiras 78", "Supervisor");

        Supervisor supervisor1 = new Supervisor("Michele", "Pietrowsky", LocalDate.of(1975, 5, 5), "050123456789", "Rua das Acácias 71", "Supervisor");

        Supervisor supervisor2 = new Supervisor("Manoel", "Dias", LocalDate.of(1975, 5, 5), "050123456789", "Rua Timbiras 78", "Supervisor");

        Gerente gerente = new Gerente("Mariane", "Rodrigues", LocalDate.of(1992, 12, 2), "050123456789", "Av Marte 1732", "Gerente");

        Gerente gerente1 = new Gerente("Silas", "Silva", LocalDate.of(1989, 11, 18), "19307685201", "Rua Hamilton 503", "Gerente");

        Gerente gerente3 = new Gerente("Priscila", "Matos", LocalDate.of(1966, 6, 16), "51312378952", "Rua Governador Valadares 132", "Gerente");


        //Início do programa
        boolean programa = true;
        while (programa){
            Scanner firstIn = new Scanner(System.in);
            System.out.println("Digite a opção desejada \n\n1. Entrar no Sistema \n2. Listar Pessoas \n3. Listar Documentos");
            Integer In = firstIn.nextInt();

                    boolean executa = true;
            switch (In) {
                case 3:
                    System.out.println("**** Documentos ****");
                    DocumentsList.listarDocumentos();
                    break;
                case 2:
                    System.out.println("**** Pessoas ****");
                    ListaPessoa.listarPessoas();
                    break;
                case 1:
                    while(executa) {
                        //Entrada do Cargo
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Qual é o seu cargo? \n1. Funcionário \n2. Supervisor \n3. Gerente \n4. Sair");
                        Integer role = scan.nextInt();

                        if (role.equals(4)){
                            executa = false;
                            break;
                        }

                        //Entrada do ID do colaborador
                        Scanner scan10 = new Scanner(System.in);
                        System.out.println("Qual é o seu ID?");
                        Integer id = scan10.nextInt();

                        //Nível hierárquico
                        switch (role) {
                            //-------------------------------------------------
                            case 1: //Ações pertinentes ao Funcinário
                                //-------------------------------------------------
                                while (id != null) {
                                    Funcionario func = ListaFuncionario.retornar(id);
                                    System.out.println("Olá, Funcionário(a) " + func.getNome() + ".");
                                    System.out.println("\nO que você deseja fazer?");

                                    //Entrada de serviço
                                    System.out.println("1. Cadastrar documento \n2. Listar documentos \n3. Tramitar documento \n4. Voltar");
                                    Integer optionFunc = scan.nextInt();

                                    //Execução do serviço
                                    switch (optionFunc) {
                                        case 1: //Cadastrar documento
                                            Servico servicoCadastro = new Servico();
                                            servicoCadastro.cadastrarDocumentoService(func);
                                            break;
                                        case 2: //Listar documentos
                                            Servico servicoListar = new Servico();
                                            servicoListar.listarDocumentosService(func);
                                            break;
                                        case 3: //Tramitar documento
                                            Servico servicoTramitar = new Servico();
                                            servicoTramitar.tramitarDocumentoService(func);
                                            break;
                                        case 4: //Retornar
                                            id = null;
                                    }
                                }
                                break;

                            //-------------------------------------------------
                            case 2: //Ações pertinentes ao Supervisor
                                //-------------------------------------------------
                                while(id != null) {
                                    Supervisor superv = ListaSupervisor.retornar(id);
                                    System.out.println("Olá, Supervisor(a) " + superv.getNome() + ".");
                                    System.out.println("\nO que você deseja fazer?");

//                    //Entrada do serviço
                                    System.out.println("1. Cadastrar documento \n2. Tramitar documento \n3. Listar documentos \n4. Voltar");
                                    Integer optionSupervisor = scan.nextInt();

                                    //Execução do serviço
                                    switch (optionSupervisor) {
                                        case 1: //Cadastrar documento
                                            Servico servicoCadastro = new Servico();
                                            servicoCadastro.cadastrarDocumentoService(superv);
                                            break;
                                        case 2: //Tramitar documento
                                            Servico servicoTramitar = new Servico();
                                            servicoTramitar.tramitarDocumentoService(superv);
                                            break;
                                        case 3: //Listar documentos
                                            Servico servicoListar = new Servico();
                                            servicoListar.listarDocumentosService(superv);
                                            break;
                                        case 4: //Retornar
                                            id = null;
                                            break;
                                    }
                                }
                                break;

                            //-------------------------------------------------
                            case 3: //Ações pertinentes ao Gerente
                                //-------------------------------------------------
                                while (id != null) {
                                    Gerente manager = ListaGerente.retornar(id);
                                    System.out.println("Olá, Gerente " + manager.getNome() + ".");
                                    System.out.println("\nO que você deseja fazer?");

                                    //Entrada do serviço
                                    System.out.println("1. Cadastrar documento \n2. Listar documento \n3. Tramitar documento \n4. Voltar");
                                    Integer optionManager = scan.nextInt();

                                    //Execução do serviço
                                    switch (optionManager) {
                                        case 1: //Cadastrar documento
                                            Servico servicoCadastro = new Servico();
                                            servicoCadastro.cadastrarDocumentoService(manager);
                                            break;
                                        case 2: //Listar documentos
                                            Servico servicoListar = new Servico();
                                            servicoListar.listarDocumentosService(manager);
                                            break;
                                        case 3: //Tramitar documento
                                            Servico servicoTramitar = new Servico();
                                            servicoTramitar.tramitarDocumentoService(manager);
                                            break;
                                        case 4:
                                            id = null;
                                            break;
                                    }
                                }
                                //-------------------------------------------------
                            case 4: //Voltar
                                //-------------------------------------------------
                                executa = false;
                                break;
                        }
                        break;
                    }
            }
        }
    }
}
