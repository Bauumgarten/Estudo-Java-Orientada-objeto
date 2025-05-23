package polimorfismoCompilacao;

public class Principal {
    public static void main(String[] args) {

        int sabaoEmPo = 3;
        int sabaoLiquido = 5;
        double chocolate = 2.50;
        double pao = 1.50;
        Integer arroz = 4;
        Integer feijao = 3;
        Integer macarrao = 2;

        int total = Calculadora.somar(sabaoEmPo, sabaoLiquido);
        double totalDouble = Calculadora.somar(chocolate, pao);
        Integer totalInteger = Calculadora.somar(arroz, feijao, macarrao );

        System.out.println("Total de produtos em unidades: R$" + total);
    }
}