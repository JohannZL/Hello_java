import java.util.Scanner;

class decimal{
public static void main(String[] args){
double num1,num2;
Scanner leer = new Scanner(System.in);
System.out.println("ingrese un numero");
 num1 = leer.nextDouble();
System.out.println("ingrese otro numero");
num2 = leer.nextDouble();
System.out.println(num1+num2);
System.out.println(num1-num2);
System.out.println(num1*num2);
}

}