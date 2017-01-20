import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Введите a, b, c (через пробел):");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        System.out.println("Дано квадратное уравнение с коэффициентами a="+a+", b="+b+", c="+c+".");
            double d = b*b-4*a*c; //дискриминант b * b - 4 * a * c
        System.out.println("Дискриминант ="+d);
            if (d>0){
                double x1=(-b+Math.sqrt(d))/(2*a); //(-b - Math.sqrt(d)) / (2 * a)
                double x2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("Уравнение имеет два корня: x1="+x1+", x2="+x2);
            } else if(d<0){
                System.out.println("Корней на множестве действительных чисел нет");
            } else {
                double x3=(-b/(2*a));
                System.out.println("Уравнение имеет один корень x="+x3);
            }
        }



    }

