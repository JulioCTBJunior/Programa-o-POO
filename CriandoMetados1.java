class CriandoMetados1{
public static void main(String args [])throws Exception {
int x;
System.out.println("informe um numero :");
x= JUtil.readInt();
while(x==0){
System.out.println("informe um numero :");
x= JUtil.readInt();
}
}
}