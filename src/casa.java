public class casa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        //Atribuindo valores
        casa.metragem = 300;
        casa.numeroDeQuartos = 3;
        casa.numeroDeBanheiros = 2;
        casa.numeroDeGaragens = 1;
        casa.cor = "Cinza";
        casa.material = "Alvenaria";

        //Construindo a casa
        casa.construir();

        //Pintando a casa
        casa.pintar();
    }
}
