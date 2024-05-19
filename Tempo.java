class Tempo{
public static void main(String args[]) throws Exception{
int x;

System.out.println("Informe qual e o mes do ano para que seja informado a estacao do ano:");
System.out.println(" 1 = janeiro ");
System.out.println(" 2 = fevereiro ");
System.out.println(" 3 = marco ");
System.out.println(" 4 = abril ");
System.out.println(" 5 = maio ");
System.out.println(" 6 = junho ");
System.out.println(" 7 = julho ");
System.out.println(" 8 = agosto ");
System.out.println(" 9 = setembro ");
System.out.println(" 10 = outubro ");
System.out.println(" 11 = novembro ");
System.out.println(" 12 = dezembro ");
System.out.println("Informe o mes em base nos numeros informados :");
x = JUtil.readInt();

if (x==1 || x==2 || x==12)
{
	System.out.println("Verao");
}
if (x==3 || x==4 || x==5)
{
	System.out.println("Outuno");
}
if (x==6 || x==7 || x==8)
{
	System.out.println("Inverno");
}
if (x==9 || x==10 || x==11)
{
	System.out.println("Primavera");
}
}
}