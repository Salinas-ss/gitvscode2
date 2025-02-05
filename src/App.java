import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double eval1, eval2, eval3, media;
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca nota de la primera evaluación: ");
        eval1=s.nextDouble();
        System.out.print("Introduzca nota de la segunda evaluación: ");
        eval2=s.nextDouble();
        System.out.print("Introduzca nota de la tercera evaluación: ");
        eval3=s.nextDouble();
        media=(eval1+eval2+eval3)/3;
        System.out.println("La media es "+media);//cambio
    }
}
