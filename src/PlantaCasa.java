public class PlantaCasa {
    int metragem = 300;
    int numeroDeQuartos = 3;
    int numeroDeBanheiros = 2;
    int numeroDeGaragens = 1;
    String cor = "Cinza";
    String material = "Alvenaria";

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
