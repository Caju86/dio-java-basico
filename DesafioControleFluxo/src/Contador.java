import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner Terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = Terminal.??;
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = Terminal.??;

        try {

            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException ){

        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {


            int contagem = parametroDois - parametroUm;

    }
}