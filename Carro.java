class Carro 
{

	String cor;
	int chassi;
	String marca;
	String modelo;
	float capTanque;
	float quatLiTanque;
	float consumo= 11;
	float x;

public float andar(float km){
 x= (quatLiTanque-(km/consumo));
return(x);
}

public void abastecer(float litro){
	float tanque = (x+litro);
if (tanque > capTanque)
{System.out.println("o tanque encheu de mais e derramou");
}else {
System.out.println("o tanque ficou com "+tanque);
}
}


}
