class Repeticao2
{
static public void main(String [] args) throws Exception 
{
int n, x = 1,linha = 0;

System.out.println("informe o numero: ");
n = JUtil.readInt();

while( x <= n && linha < 5){

System.out.print(+x);

if( x % 5 != 0 && x != n){
System.out.print(", ");
}else {
System.out.println();
}
x++;
linha++;
} 
}
}