class QuestS1{
public static void main(String args []) throws Exception {

int x;
float cobrado ,saldo_inicial, pagamentos, limite, y;
String nome;

System.out.println("Qual e o numero da sua conta?");
x = JUtil.readInt();

System.out.println("Qual e o seu nome ?");
nome =JUtil.readString();

System.out.println("O saldo inicial em R$?");
saldo_inicial = JUtil.readFloat();

System.out.println("total cobrado em R$?");
cobrado = JUtil.readFloat();

System.out.println("total de pagamento em R$ ?");
pagamentos = JUtil.readFloat();

System.out.println("limite autorizados de credito ?");
limite = JUtil.readFloat();


y = saldo_inicial + cobrado - pagamentos;

if (y>limite)
{
	System.out.println("Limite de credito excedido em R$"+y+" reais");
}
else
{
System.out.println("Ainda pode comprar R$"+y+" reais");
}

}
}
