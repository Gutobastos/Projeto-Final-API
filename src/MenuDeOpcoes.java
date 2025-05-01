public class MenuDeOpcoes {
    String menuPrincipal = """
                **********************************************
                *            CONTAÇÃO DE MOEDAS              *
                **********************************************
                *          Escolha as opções abaixo:         *
                *                                            *
                *           *** MENU PRINCIPAL ***           *
                *                                            *
                *          1 - COTAÇÃO: USD -> BRL           *
                *          2 - COTAÇÃO: ARS -> BRL           *
                *          3 - COTAÇÃO: EUR -> BRL           *
                *          4 - COTAÇÃO: BOB -> BRL           *
                *          5 - COTAÇÃO: CLP -> BRL           *
                *          6 - COTAÇÃO: COP -> BRL           *
                *                                            *
                *          7 - CAMBIO: ? -> BRL              *
                *                                            *
                *          0 - PARA SAIR DO PROGRAMA         *""";
    String menuCambial = """
                **********************************************
                *         Escolha as opções abaixo:          *
                *                                            *
                *           *** MENU CAMBIAL ***             *
                *                                            *
                *             1 -  USD -> BRL                *
                *             2 -  ARS -> BRL                *
                *             3 -  EUR -> BRL                *
                *             4 -  BOB -> BRL                *
                *             5 -  CLP -> BRL                *
                *             6 -  COP -> BRL                *
                *                                            *
                *             CAMBIO: ? -> BRL               *
                *                                            *
                *          0 - PARA SAIR DO PROGRAMA         *
                **********************************************""";

    public String getMenuPrincipal() {
        return this.menuPrincipal;
    }

    public String getMenuCambial() {
        return menuCambial;
    }
}
