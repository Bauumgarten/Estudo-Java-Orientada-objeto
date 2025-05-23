package Automovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pincipal {
    public static void main(String[] args) {
        Funcionarios joao = new Funcionarios("João", " Gerente");
        Funcionarios maria = new Funcionarios("Maria", " Vendedora");
        Funcionarios ana = new Funcionarios("Ana", " Assistente");
        Funcionarios carla = new Funcionarios("Carla", " Assistente");
        List<Funcionarios> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(joao);
        listaFuncionarios.add(maria);
        listaFuncionarios.add(ana);
        listaFuncionarios.add(carla);

        Departamento vendas = new Departamento("Vendas", listaFuncionarios);
        vendas.mostrarFuncionarios();

        Funcionarios pedro = new Funcionarios("Pedro ", "Marketing");
        List<Funcionarios> listaMarketing = new ArrayList<>();
        listaMarketing.add(pedro);

        Departamento marketing = new Departamento("Marketing", listaMarketing);
        marketing.mostrarFuncionarios();

        Departamento ti = new Departamento("TI ", Collections.emptyList());
        ti.mostrarFuncionarios();
    }


}
