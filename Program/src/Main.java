import domain.Funcionario;
import domain.Gerente;
import domain.Supervisor;
import repository.ListaFuncionario;
import repository.ListaGerente;
import repository.ListaPessoa;
import repository.ListaSupervisor;
import service.Servico;

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

        System.out.println(ListaPessoa.pessoas);


        //Início do programa

        boolean executa = true;
        while(executa){
            //Entrada do Cargo
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual é o seu cargo? \n1. Funcionário \n2. Supervisor \n3. Gerente \n4. Sair");
            Integer role = scan.nextInt();

            //Entrada do ID do colaborador
            System.out.println("Qual é o seu ID?");
            Integer id = scan.nextInt();

            //Nível hierárquico
            switch (role){
                case 1: //Funcinário
                    Funcionario func = ListaFuncionario.retornar(id);
                    System.out.println("Olá, Funcionário(a) " + func.getNome() + ".");
                    System.out.println("\nO que você deseja fazer?");

                    //Entrada de serviço
                    System.out.println("1. Cadastrar documento \n2. Listar documentos \n3. Tramitar documento");
                    Integer optionFunc = scan.nextInt();

                    //Execução do serviço
                    switch (optionFunc){
                        case 1: //Cadastrar documento
                            Servico servicoCadastro = new Servico();
                            servicoCadastro.cadastrarDocumentoService(func, func);
                            break;
                        case 2: //Listar documentos
                            Servico servicoListar = new Servico();
                            servicoListar.listarDocumentosService(func);
                            break;
                        case 3: //Tramitar documento
                            Servico servicoTramitar = new Servico();
                            servicoTramitar.tramitarDocumento(func);
                            break;
                    }
                    break;
                case 2:
                    Supervisor superv = ListaSupervisor.retornar(id);
                    System.out.println("Olá, Supervisor(a) " + superv.getNome() + ".");
                    System.out.println("\nO que você deseja fazer?");
                    System.out.println("1. Aprovar documento \n2. Recusar documento \n3. Listar documentos pendentes no processo \n3. ");
                    break;
                case 3:
                    Gerente manager = ListaGerente.retornar(id);
                    System.out.println("Olá, Gerente " + manager.getNome() + ".");
                    System.out.println("\nO que você deseja fazer?");
                    System.out.println("1. Cadastrar documento \n2. Arquivar documento \n3. Desarquivar documento");
                    break;
                case 4:
                    executa = false;
            }

            //Definição do serviço



        }
    }
}
