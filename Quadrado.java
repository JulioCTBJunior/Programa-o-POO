abstract class Quadrado
{
	private float lado;

	public Quadrado()
		{
		this.lado = 0;
		}
	public Quadrado(float lado)
		{
		this.lado = lado;
		}

	public float getLado()
		{return(this.lado);}

	public void setLado(float lado)
		{this.lado=lado;}
	
	public double area()
		{return(Math.pow(this.lado,2));}

	public float perimetro()
		{return(this.lado * 4);}

	public void mostrarDados()
	{System.out.println("O lado :"+this.lado);
	 System.out.println("O area :"+this.area());
	 System.out.println("A perimetro :"+this.perimetro());};
};