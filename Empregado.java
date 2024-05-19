abstract class Empregado{

private int matricula;
private String nome;
private float salarioBase;

public Empregado(int matricula, String nome, float salarioBase){
this.matricula = matricula;
this.nome = nome;
this.salarioBase = salarioBase;}


public void setMatricula(int matricula){
this.matricula = matricula;}

public int getMatricula(){
return(this.matricula);}

public void setNome(String nome){
this.nome = nome;}

public String getNome(){
return(this.nome);}

public void setSalarioBase(float salarioBase){
this.salarioBase = salarioBase;}

public float getSalarioBase(){
return(this.salarioBase);}


public double salarioLiquido(){
	double inss = 11.0/100.0;
return(this.salarioBase * (1-inss));}

public void mostrarDados(){
System.out.println("A matricula e :"+this.matricula);
System.out.println("O nome e :"+this.nome);
System.out.println("o salario base e :"+this.salarioBase);
System.out.println("");
}

}