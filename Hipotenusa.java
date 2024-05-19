class Hipotenusa {
public static void main(String args []) throws Exception {
float a, b;
double c;
System.out.println("Informe o primeiro cateto:");
a = JUtil.readFloat();
System.out.println("Informe o segundo cateto: ");
b = JUtil.readFloat();
//c = Math.sqrt((a*a)+(b*b));
c = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
System.out.println("o triangulo com o cateto "+a+" e com o cateto "+b+" da a hipotenusa "+c );
}
}