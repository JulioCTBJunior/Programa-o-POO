public class Investimento2{
public static void main(String args []) throws Exception{
float p,r,n;

System.out.println("Informe quanto voce vai investir :");
p = JUtil.readFloat();

while (p != 0)
{
System.out.println("Qual e a taxa de juros anual atual :");
r = JUtil.readFloat();

System.out.println("Informe por quantos anos vai deixar esse investimento: ");
n= JUtil.readFloat();
juros(p,r,n);
}
System.out.println("Informe quanto voce vai investir :");
p = JUtil.readFloat();
}//main



public static void juros(float p, float r, float n){
float mes;
double jm=(r/12)/100;
mes = n*12;

for(int i = 1; i<=mes;i++){
double a = p * Math.pow((1+jm),i);
System.out.println("No mes "+i+" valor final e :"+a);
}//for

}//juros

}//class