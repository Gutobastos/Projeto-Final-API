import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int entrada = 1;
        int opcao;
        int moedaUsuario;
        double valorUsuario;
        BuscaDados buscarCotacao = new BuscaDados();
        MenuDeOpcoes menu = new MenuDeOpcoes();
        List<String> listasMoedas = new ArrayList<>();
        listasMoedas.add("BRL");
        listasMoedas.add("USD");
        listasMoedas.add("ARS");
        listasMoedas.add("EUR");
        listasMoedas.add("BOB");
        listasMoedas.add("CLP");
        listasMoedas.add("COP");
        while (entrada != 0) {
            System.out.println(menu.getMenuPrincipal());
            System.out.println("**********************************************");
            System.out.println("Digite a opção: ");
            entrada = leitura.nextInt();
            if (entrada == 0) {
                break;
            } else if (entrada == 7) {
                System.out.println(menu.getMenuCambial());
                System.out.println("Informe a opção da moeda que deseja comprar: ");
                moedaUsuario = leitura.nextInt();
                try {
                    System.out.println("Informe o valor que deseja comprar: ");
                    valorUsuario = leitura.nextDouble();
                    CambioDeMoeda cambio = new CambioDeMoeda(valorUsuario, listasMoedas.get(moedaUsuario));
                    cambio.CalculoCambio(cambio.getMoeda());
                    System.out.printf("Valor de %.2f %s: R$ %.2f\n", valorUsuario,
                            cambio.getMoeda().toUpperCase(), cambio.getTotalValor());

                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    System.out.println("*************************************************");
                }
            }
            opcao = entrada;
            switch (opcao) {
                case 1:
                    try {
                        System.out.println("COTAÇÃO : " + listasMoedas.get(1) + " -> " + listasMoedas.get(0));
                        Moeda minhaMoeda = buscarCotacao.buscaMoeda(listasMoedas.get(1), listasMoedas.get(0));
                        System.out.println(minhaMoeda);

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("**********************************************");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("COTAÇÃO : " + listasMoedas.get(2) + " -> " + listasMoedas.get(0));
                        Moeda minhaMoeda = buscarCotacao.buscaMoeda(listasMoedas.get(2), listasMoedas.get(0));
                        System.out.println(minhaMoeda);

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("**********************************************");

                    }
                    break;
                case 3:
                    try {
                        System.out.println("COTAÇÃO : " + listasMoedas.get(3) + " -> " + listasMoedas.get(0));
                        Moeda minhaMoeda = buscarCotacao.buscaMoeda(listasMoedas.get(3), listasMoedas.get(0));
                        System.out.println(minhaMoeda);

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("**********************************************");

                    }
                    break;
                case 4:
                    try {
                        System.out.println("COTAÇÃO : " + listasMoedas.get(4) + " -> " + listasMoedas.get(0));
                        Moeda minhaMoeda = buscarCotacao.buscaMoeda(listasMoedas.get(4), listasMoedas.get(0));
                        System.out.println(minhaMoeda);

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("**********************************************");

                    }
                    break;
                case 5:
                    try {
                        System.out.println("COTAÇÃO : " + listasMoedas.get(5) + " -> " + listasMoedas.get(0));
                        Moeda minhaMoeda = buscarCotacao.buscaMoeda(listasMoedas.get(5), listasMoedas.get(0));
                        System.out.println(minhaMoeda);

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("**********************************************");

                    }
                    break;
                case 6:
                    try {
                        System.out.println("COTAÇÃO : " + listasMoedas.get(6) + " -> " + listasMoedas.get(0));
                        Moeda minhaMoeda = buscarCotacao.buscaMoeda(listasMoedas.get(6), listasMoedas.get(0));
                        System.out.println(minhaMoeda);

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("**********************************************");

                    }
                    break;
                case 7:

                    break;
            }
        }
        System.out.println("*************************************************");
        System.out.println("*    Programa finalizado com sucesso !          *");
        System.out.println("*************************************************");
    }
}