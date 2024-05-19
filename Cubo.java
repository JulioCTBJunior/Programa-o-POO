class Cubo extends Quadrado
{
	private float altura;
	public Cubo()
		{super();}

	public Cubo(float lado,float altura)
		{super(lado);
		 this.altura=altura;}

	public double area()
		{return(6 * super.area());}

	public double volume()
	{return(super.area()*altura);}

	public void mostrarDados()
	{System.out.println("O lado :"+super.getLado());
	 System.out.println("O area :"+this.area());
	 System.out.println("A volume :"+this.volume());};
}
