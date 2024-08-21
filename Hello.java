import java.util.Scanner;
class Hello{

public static void main(String[] args){

Scanner leer = new Scanner(System.in);
System.out.println ("Hello sufrimiento");
String name;
System.out.println("Type your name: ");
name = leer.next();
System.out.println(name+" type a number");
int number = leer.nextInt();
System.out.println(number*2);
}
}