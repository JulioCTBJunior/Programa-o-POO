class Nota
{
	public static void main(String [] args)throws Exception
	{
		String nome;
		float nota1, nota2, notaf;

			System.out.println("informe seu nome :");
			nome = JUtil.readString();

			System.out.println("informe sua primeira nota :");
			nota1 = JUtil.readFloat();

			System.out.println("Informe a sua segunda nota :");
			nota2 = JUtil.readFloat();

			notaf = nota1*40/100+nota2*60/100;

			System.out.println("Ola "+nome+", sua primeira nota e "+nota1+" sua segunda nota e "+nota2+" sua nota final e "+notaf);
	}
}