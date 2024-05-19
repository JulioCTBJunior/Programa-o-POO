class Quest2{
public static void main(String args []) throws Exception
{
	String x;
	int a,b,c;
	c = 11;
System.out.println("Qual e o seu nome?");
x = JUtil.readString();
System.out.println("Qual e o seu salario base ?");
a = JUtil.readInt();
b = a-(a * c)/100;
System.out.println("O nome do funcionario e " +x);
System.out.println("seu salario base e: " +a+ " reais" );
System.out.println("seu salario com desconto do INSS de 11% e: "+b+ " reais");
}
}