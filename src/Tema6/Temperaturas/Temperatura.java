package Tema6.Temperaturas;

public class Temperatura {

    private static double tal = 32;

    public Temperatura() {
    }

    public static double celsiusToFarenheit(double temperaturaC) {
        return temperaturaC + tal;
    }

    public static double farenheitTocelsius(double temperaturaF) {
        return temperaturaF - tal;
    }
}
