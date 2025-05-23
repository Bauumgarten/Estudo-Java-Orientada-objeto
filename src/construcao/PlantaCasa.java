public class PlantaCasa implements Construcao {

    int metragem = 300;
    int numeroDeQuartos = 3;
    int numeroDeBanheiros = 2;
    int numeroDeGaragens = 1;
    String cor = "Cinza";
    String material = "Alvenaria";

    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa de " + cor);
    }

    @Override
    public int calcularCustoConstrucao(int metroQuadrado) {
        return metragem + metroQuadrado;
    }

    public void construir() {
        System.out.println("A casa foi construída com sucesso!");
        System.out.println("Metragem: " + metragem + " m²");
        System.out.println("Número de quartos: " + numeroDeQuartos);
        System.out.println("Número de banheiros: " + numeroDeBanheiros + ", podendo ter um banheiro social");
        System.out.println("Número de garagens: " + numeroDeGaragens);
        System.out.println("Material construindo da casa: " + material);
    }


    public void pintar() {
        System.out.println("Pintando a casa de " + cor);
    }
}
