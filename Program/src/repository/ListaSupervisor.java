package repository;


import domain.Colaborador;
import domain.Supervisor;

import java.util.ArrayList;
import java.util.List;

public class ListaSupervisor {
    public static List<Supervisor> supervisores = new ArrayList<>();

    public static void adicionar(Supervisor supervisor){
        supervisores.add(supervisor);
    }

    public static Supervisor retornar(Integer id){
        return supervisores.get(id);
    }

//    public static void listar(Colaborador usuario){
//        supervisores.forEach(supervisor ->{
//            if(usuario.getCargo() == supervisor.getCargo()){
//                System.out.println(supervisor);
//            }
//        });
//    }
}
