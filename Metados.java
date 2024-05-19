class Metados{
public static void main(String args []) throws Exception {
int x, y, a, d;

System.out.println("vamos somar dois numeros");
System.out.println("informe o primeiro numero");
x=JUtil.readInt();
System.out.println("informe o segundo numero");
y=JUtil.readInt();


Soma(x, y);
mult(x, y);
a = subtracao(x, y);
d = div(x, y);
System.out.println("a subtracao dos valor e: "+a);
System.out.println("a divisao dos valor e: "+d);

}


static void Soma(int x, int y){
int s = x + y;
System.out.println("A soma dos valores e: "+s);
}


static int subtracao(int x, int y){
int r = x - y;
return r;
}


static void mult( int x, int y){
int s = x * y;
System.out.println("A multiplicacao dos valores e: "+s);
}


static int div(int x, int y){
int s = x / y;
return s;
}
}
