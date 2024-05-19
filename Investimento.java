public class Investimento{
public static void main(String args []) throws Exception{
float p,r,n,mes;

System.out.println("Informe quanto voce vai investir :");
p = JUtil.readFloat();

System.out.println("Qual e a taxa de juros anual atual :");
r = JUtil.readFloat();
double jm=(r/12)/100;
System.out.println("Informe por quantos anos vai deixar esse investimento: ");
n= JUtil.readFloat();

mes = n*12;
for(int i = 1; i<=mes;i++){
double a = p * Math.pow((1+jm),i);
System.out.println("No mes "+i+" valor final e :"+a);
}
}
}