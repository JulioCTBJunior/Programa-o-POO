class Pesa
{
	public static void main(String[] args)throws Exception 
	{
		String nome;
		float peso, altura;
		double h,m;

System.out.println("informe seu nome :");
nome = JUtil.readString();

System.out.println("informe seu peso :");
peso = JUtil.readFloat();

System.out.println("informe sua altura em cm, Ex 177cm");
altura = JUtil.readFloat();

h=(72.7*altura)-58.00;
m=(62.10*altura)-44.70;

System.out.println("Ola "+nome+" seu peso atual e :"+peso+" e sua altura atual e : "+altura+" seu peso ideal e "+h+" se voce for homem, e se for mulher e"+m);
	}
}
