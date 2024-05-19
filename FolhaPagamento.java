class FolhaPagamento{
	 public static void main(String[] args) {
EmpregadoLei p1 = new EmpregadoLei(1, "joao", 600);
EmpregadoComissao p2 = new EmpregadoComissao(2, "maria", 1000, 10);

p1.mostrarDados();
p2.mostrarDados();

p1.setSalarioBase(500);

System.out.println("Salario Liquido de Joao: " + p1.salarioLiquido());
System.out.println("Salario Liquido de maria: " + p2.salarioLiquido(100)+"\n");

p1.setSalarioBase(700);
p2.setSalarioBase(1200);

p1.mostrarDados();
p2.mostrarDados();

System.out.println("Salario Liquido de Joao: " + p1.salarioLiquido());
System.out.println("Salario Liquido de maria: " + p2.salarioLiquido(200)+"\n");

	 }
}