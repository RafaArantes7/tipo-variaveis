public class Operadores4 {
    public static void main(String[] args) {

        String nomeUm = "Rafael";
        String nomeDois = "Rafael";

        System.out.println(nomeUm.equals(nomeDois));

        // função equals é a mais reconmendada para comparar 2 objetos

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");

        }

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);
    }

}
