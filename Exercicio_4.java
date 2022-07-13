public class Aula5 {
public static void main(String[] args) {
int n1;
int soma = 0;
long par =1;   
for(n1=0;n1<=30;n1++){
    if (n1 % 2 ==1){
soma+=n1;
}else{
if(n1>0)
par*=n1;
}} 
System.out.println("soma dos ímpares:" + soma );
System.out.println("multiplicação dos pares:" + par);   
}
}
