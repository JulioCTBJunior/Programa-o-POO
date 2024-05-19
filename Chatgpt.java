class Chatgpt {
	public static void main (String args []) throws Exception {
		int x, y;
		System.out.println("Calcula a Hipotenusa");
		System.out.print ("Digite um cateto -> ");
		x = JUtil.readInt ();
		System.out.println ("Digite o outro cateto");
		y = JUtil.readInt ();
		System.out.println ("A hipotenusa de um triangulo com catetos igual a "+ x + " e " + y + " e " + Math.sqrt((x * x) + (y * y)) );
		JUtil.pause (); }
}