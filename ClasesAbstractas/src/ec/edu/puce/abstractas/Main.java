package ec.edu.puce.abstractas;

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo("1er Rectangulo");
        rectangulo1.setBase(5);
        rectangulo1.setAltura(20);
        System.out.println(rectangulo1);

        Rectangulo rectangulo2 = new Rectangulo("2do Rectangulo");
        rectangulo2.setBase(30);
        rectangulo2.setAltura(15);
        System.out.println(rectangulo2);


        if (rectangulo1.mayorQue(rectangulo2))
            System.out.println("El rectangulo mayor es el " + rectangulo1);
        else
            System.out.println("El rectangulo mayor es el " + rectangulo2);


        Triangulo triangulo1 = new Triangulo("1er Triángulo");
        triangulo1.setBase(6);
        triangulo1.setAltura(9);
        System.out.println(triangulo1);

        Triangulo triangulo2 = new Triangulo("2do Triángulo");
        triangulo2.setBase(25);
        triangulo2.setAltura(8);
        System.out.println(triangulo2);

        
        if (triangulo1.mayorQue(triangulo2))
            System.out.println("El triangulo mayor es el " + triangulo1);
        else
            System.out.println("El triangulo mayor es el " + triangulo2);


        Circulo circulo1 = new Circulo("Círculo 1");
        circulo1.setRadio(7);
        System.out.println(circulo1);

        Circulo circulo2 = new Circulo("Círculo 2");
        circulo2.setRadio(10);
        System.out.println(circulo2);


        if (circulo1.mayorQue(circulo2))
            System.out.println("El circulo mayor es el " + circulo1);
        else
            System.out.println("El circulo mayor es el " + circulo2);
    }
}
