class Esfera extends Circulo{

public Esfera(){
super();}

public Esfera(float raio){
super(raio);}

public double area(){
return(4*super.area());}

public double volume(){
return((4.0/3.0)* Math.PI * Math.pow(super.getRaio(),3));}

public void mostrarDados(){
System.out.println("O raio e :"+super.getRaio());
System.out.println("O raio e :"+this.area());
System.out.println("O volume e :"+this.volume());
}

}