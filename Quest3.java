class Quest3{
public static void main(String args [])throws Exception
{
float km1, km2,kmf, valor, cons, litros, cap, aut, custo;
System.out.println("Qual e o kilometragem inicial ?");
km1=JUtil.readFloat();
System.out.println("Qual e a kilometragem final da viagem ?");
km2=JUtil.readFloat();
System.out.println("Qual foi o consumo de gasolina em litros :");
litros=JUtil.readFloat();
System.out.println("Qual e a capacidade de gasolina no seu carro ?");
cap=JUtil.readFloat();
System.out.println("Qual e o valor do combustivel na sua regiao ?");
valor=JUtil.readFloat();

kmf=(km2-km1);
cons=(kmf/litros);
aut=(cons*cap);
custo=(litros*valor);

System.out.println("A viagem comecou na km :" +km1+ " e terminou na km :" +km2+ " rodando no final :" +kmf+ "km");
System.out.println("O consumo do carro foi :"+cons+" KM/L");
System.out.println("A autonomia do carro e de : "+aut+" KM");
System.out.println("O custo em reais foi : "+custo);

}
}