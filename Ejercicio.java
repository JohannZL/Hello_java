import java.util.Scanner;
class number{
public static void main(String[] args){

Scanner leer = new Scanner(System.in);
System.out.println("Ingrese un numero");
int num1 = leer.nextInt();
System.out.println("Ingrese el segundo numero");
int num2 = leer.nextInt();
System.out.println(num1+num2);
System.out.println(num1-num2);
System.out.println(num1*num2);
}
}