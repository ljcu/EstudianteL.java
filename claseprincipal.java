import java.util.Date;

public class claseprincipal {
    public static void main(String[] args) {
        Date fechaNacLaura = new Date(2005, 7, 1);
        Estudiante Laura = new Estudiante("Laura", fechaNacLaura);
        Laura.setNotaAsignatura1(4.5);
        Laura.setNotaAsignatura2(3.1);
        Laura.setNotaAsignatura3(3.9);
        System.out.println("Nota Asignatura 1: " + Laura.getNotaAsignatura1());
        System.out.println("Nota Asignatura 2: " + Laura.getNotaAsignatura2());
        System.out.println("Nota Asignatura 3: " + Laura.getNotaAsignatura3());

        int edadLaura = Laura.getEdad();
        System.out.println("Edad de Laura: " + edadLaura + " años");

        double promedioLaura = Laura.getPromedio();
        System.out.println("Promedio de Laura: " + promedioLaura);
    }
}
