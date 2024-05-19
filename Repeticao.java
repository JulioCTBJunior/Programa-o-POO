public class Repeticao {
    public static void main(String[] args)throws Exception {
        int anoNascimento, idadeAtual;
        
        System.out.println("Qual foi o ano que voce nasceu?");
        anoNascimento = JUtil.readInt();
        
        System.out.println("Qual e a sua idade?");
        idadeAtual = JUtil.readInt();
        
        int anoAtual = 2023;
        int anosPassados = anoAtual - anoNascimento;
        
        for (int i = 0; i <= anosPassados; i++) {
            System.out.println("No ano de " + (anoNascimento + i) + " voce tinha " + (idadeAtual - anosPassados + i) + " anos de idade");
        }
        
        
    }
}
