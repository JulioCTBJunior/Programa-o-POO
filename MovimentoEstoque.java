class MovimentoEstoque 
{ public static void main(String[] args) {
 ProdutoCustoAtual p1 = new ProdutoCustoAtual(1,"feijao",60,1.50f);
ProdutoCustoMedio p2= new ProdutoCustoMedio(2,"tomate",120,2.50f);
p1.mostrarDados ();
p2.mostrarDados ();
System.out.println ("Repor (100,1.60) e (100,2.60)");
p1.repor (100,1.60f);
p2.repor (100,2.60f);
p1.mostrarDados ();
p2.mostrarDados ();
System.out.println ("Baixar 30 e 50");
p1.baixar (30);
p2.baixar (50);
p1.mostrarDados ();
p2.mostrarDados ();
System.out.println ("Baixar 300");
p2.baixar (300);
}
}