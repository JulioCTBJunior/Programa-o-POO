class Raiz4
{
	public static void main(String[] args) throws Exception
	{
int x;
	
		System.out.println("Vamos calcular a raiz quarta!");
		System.out.println("Informe um numero: ");
		x = JUtil.readInt();
		while(x != 0){
			double y = Raiz(x);
		System.out.println(+y);

		System.out.println("Informe um numero: ");
		x = JUtil.readInt();
		
		}
	}

	public static double Raiz(int x){
	double y = Math.pow(x,4);
	return y ;	}

}
