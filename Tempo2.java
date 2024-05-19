class Tempo2{
public static void main(String args[]) throws Exception{
int x;
String estacao;
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
if(x==1 || x==2 || x==12){
x=1;
estacao = "verao";
}
if(x==3 || x==4 || x==5){
x=3;
estacao = "outuno";
}
if(x==6 || x==7 || x==8){
x=6;
estacao = "inverno";
}
if(x==9 || x==10 || x==11){
x=9;
estacao = "primavera";
}
switch (x)
{
case 1:
	System.out.println(+estacao);
 break ;
case 3:
	System.out.println(+estacao);
 break ;
case 6 :
	System.out.println(+estacao);
 break ;
case 9:
	System.out.println(+estacao);
 break ;

}
}
}