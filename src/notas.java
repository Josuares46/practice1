public class notas {
    public static void main(String[] args){
        double[] notas = {4,2,7,8.6,9};
        double soma = 0;
        for(int i = 0; i < notas.length; i++){
           soma += notas[i];
        }
       double media = soma / notas.length;
        System.out.println("sua média é: " +media);
    }
}
