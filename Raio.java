class Raio 
{
	public static void main(String[] args) throws Exception
	{
		float r;
		double d,c,a;
		System.out.println("Informe o valor do raio: ");
		r = JUtil.readInt();
		d=(2*r);
		c = (2*Math.PI*r);
		a = Math.PI*Math.pow(r,2);
		System.out.println("o valor o diametro do raio "+r+" e : "+d);
		System.out.println("o valor do circuferencia do raio "+r+" e : "+c);
		System.out.println("o valor da area do raio "+r+" e : "+a);
	}
}
