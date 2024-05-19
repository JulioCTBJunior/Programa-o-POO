class LerCarro 
{
	public static void main(String[] args) throws Exception
	{
		Carro p = new Carro();

		System.out.println("Vamos fazer um carro :");
		System.out.println("Qual e a marca do seu carro ?");
		p.marca = JUtil.readString();
		
		System.out.println("Qual e o modelo do seu carro ?");
		p.modelo = JUtil.readString();

		System.out.println("Qual e o numero do chassi do carro ?");
		p.chassi = JUtil.readInt();

		System.out.println("Qual e a cor do carro ?");
		p.cor = JUtil.readString();

		System.out.println("Qual e a capacidade do tanque do seu carro ?");
		p.capTanque = JUtil.readFloat();

		System.out.println("Qual e a quatidade atual de litros no tanque do seu carro ?");
		p.quatLiTanque = JUtil.readFloat();
		
		System.out.println("quantos km voce andou hoje ?");
		float kmA = JUtil.readFloat();

		System.out.println("Seu carro de marca "+p.marca+" \n E de modelo :"+p.modelo+"\n com chassi de numero : "+p.chassi+"\n e de cor : "+p.cor+"\n a capacidade do seu tanque e de "+p.capTanque+"\n e a capacidade atual do tanque e de "+p.quatLiTanque+"\n quantos litros ficou no seu tanque "+p.andar(kmA));
	
		System.out.println("voce abasteceu quantos litros ? ");
		float litro = JUtil.readFloat();
		p.abastecer(litro);
	}


}
