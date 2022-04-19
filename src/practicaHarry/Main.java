package practicaHarry;

public class Main {
    public static void main(String[] args) {
        Mago harryPotter= new Mago(
                1,
                "Harry Potter",
                "Masculino",
                "Gryffindor",
                "Ciervo",
                "Dementor");
        Mago ronaldWeasley=new Mago(
                2,
                "Ronald Weasley",
                "Masculino",
                "Gryffindor",
                "Terrier",
                "Acromantula"
        );
        Mago hermioneGranger=new Mago(
                3,
                "Hermione Granger",
                "Femenino",
                "Gryffindor",
                "Nutria",
                "Fallar"
        );
        Mago severusSnape=new Mago(
                4,
                "Severus Snape",
                "Masculino",
                "Slithering",
                "Cierva",
                "Lord Voldemort"
        );
        Mago albusDumbledore=new Mago(
                5,
                "Albus Dumbledore",
                "Masculino",
                "Gryffindor",
                "Fenix",
                "El cuerpo de su hermana Ariana"
        );

        System.out.println(harryPotter.showComments());
        System.out.println(ronaldWeasley.showComments());
        System.out.println(hermioneGranger.showComments());
        System.out.println(severusSnape.showComments());
        System.out.println(albusDumbledore.showComments());

    }

}
