class Cilindro extends Circulo{
private float altura;

public Cilindro(){
	super();
	this.altura=0;}

public Cilindro(float raio,float altura){
	super(raio);
	this.altura=altura;}

public float getAltura(){
	return(this.altura);}

public void setAltura(){
	this.altura=altura;}

public double areaLateral(){
	return(super.perimetro() * this.altura);}

public double area(){
	return(2 * super.area() * this.areaLateral() );}

public double volume(){
	return(super.area() * this.altura);}

public void mostrarDados(){
System.out.println("O raio :"+super.getRaio());
System.out.println("A altura :"+this.altura);
System.out.println("A area da base :"+super.area());
System.out.println("O perimetro da base :"+super.perimetro());
System.out.println("O diametro da base :"+super.diametro());
System.out.println("A area da Lateral :"+this.areaLateral());
System.out.println("A area :"+this.area());
System.out.println("E o volume :"+this.volume());
}
}