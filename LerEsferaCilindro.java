class LerEsferaCilindro{
	public static char lerTipo () throws Exception{
		{char tipo;
		do
			{System.out.print ("\nInforme 'E' para Esfera, 'C' para Cilindro ou 'F' para Fim-> ");
			tipo = JUtil.readChar ();}
		while ((tipo != 'E') && (tipo != 'C') && (tipo != 'F'));
			return (tipo); }
		

}
}