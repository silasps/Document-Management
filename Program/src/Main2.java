import domain.Funcionario;
import domain.Gerente;
import domain.Supervisor;
import repository.*;
import service.Servico;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
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

        boolean programa = true;
        while (programa){
            Scanner firstIn = new Scanner(System.in);
            System.out.println("Digite a opção desejada \n\n1. Entrar no Sistema \n2. Listar Pessoas \n3. Listar Documentos");
            Integer In = firstIn.nextInt();

            switch (In){
                case 1:
                    boolean oi = true;
                    while(oi) {
                        Scanner idade = new Scanner(System.in);
                        System.out.println("Quantos anos vc tem?");
                        Integer age = idade.nextInt();
                        oi = false;

                    }
                    break;
                case 2:
                    System.out.println("Listando Pessoas");
                    break;
                case 3:
                    System.out.println("Listando Documentos");
                    programa = false;
                    break;
                default:
                    System.out.println("Saindo");
                    break;
            }
        }
    }
}