import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);


        while (opcao != 7) {
            System.out.println("""
                    *****************************************************************
                    ---------------BEM-VINDO---AO---CONVESOR---DE---MOEDAS-----------
                                    
                    Digite a opção desejada:
                                    
                    1) Dolar ==>  Peso argentino
                    2) Peso argentino ==>  Dolar
                    3) Dolar ==> Real brasileiro
                    4) Real brasieliro ==> Dolar
                    5) Dolar ==> Peso colombiano
                    6) Peso colombiano ==> Dolar
                    7) Sair
                    ******************************************************************
                    """);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    double cambio = Conversor.obterTaxasDeConversao("USD", "ARS");
                    System.out.println("Digite o valor que deseja converter:");
                    double valor = leitura.nextDouble();
                    double cambioFeito = valor * cambio;
                    System.out.println("O valor de "+valor+" [USD] corresponde ao valor final de "+cambioFeito+" em [ARS]");
                    System.out.println("**********************************************************************************");

                    break;
                case 2:
                    double cambio2 = Conversor.obterTaxasDeConversao("ARS", "USD");
                    System.out.println("Digite o valor que deseja converter:");
                    double valor2 = leitura.nextDouble();
                    double cambioFeito2 = valor2 * cambio2;
                    System.out.println("O valor de "+valor2+" [ARS] corresponde ao valor final de "+cambioFeito2+" em [USD]");
                    System.out.println("**********************************************************************************");

                    break;
                case 3:
                    double cambio3 = Conversor.obterTaxasDeConversao("USD", "BRL");
                    System.out.println("Digite o valor que deseja converter:");
                    double valor3 = leitura.nextDouble();
                    double cambioFeito3 = valor3 * cambio3;
                    System.out.println("O valor de "+valor3+" [USD] corresponde ao valor final de "+cambioFeito3+" em [BRL]");
                    System.out.println("**********************************************************************************");

                    break;
                case 4:
                    double cambio4 = Conversor.obterTaxasDeConversao("BRL", "USD");
                    System.out.println("Digite o valor que deseja converter:");
                    double valor4 = leitura.nextDouble();
                    double cambioFeito4 = valor4 * cambio4;
                    System.out.println("O valor de "+valor4+" [BRL] corresponde ao valor final de "+cambioFeito4+" em [USD]");
                    System.out.println("**********************************************************************************");

                    break;
                case 5:
                    double cambio5 = Conversor.obterTaxasDeConversao("USD", "COP");
                    System.out.println("Digite o valor que deseja converter:");
                    double valor5 = leitura.nextDouble();
                    double cambioFeito5 = valor5 * cambio5;
                    System.out.println("O valor de "+valor5+" [USD] corresponde ao valor final de "+cambioFeito5+" em [COP]");
                    System.out.println("**********************************************************************************");

                    break;
                case 6:
                    double cambio6 = Conversor.obterTaxasDeConversao("COP", "USD");
                    System.out.println("Digite o valor que deseja converter:");
                    double valor6 = leitura.nextDouble();
                    double cambioFeito6 = valor6 * cambio6;
                    System.out.println("O valor de "+valor6+" [COP] corresponde ao valor final de "+cambioFeito6+" em [USD]");
                    System.out.println("**********************************************************************************");

                    break;
            }

        }


    }
}

