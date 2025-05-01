public class CambioDeMoeda extends Principal {

    private double valorUsuario;
    private String moeda;
    private double valorDaMoeda;
    private double totalValor;
    BuscaDados buscaValorDaMoeda = new BuscaDados();

    public String getMoeda() {
        return this.moeda;
    }

    public double getTotalValor() {
        return totalValor;
    }

    public CambioDeMoeda(double valorUsuario, String moeda) {
        this.valorUsuario = valorUsuario;
        this.moeda = moeda;
    }

    public void CalculoCambio(String moeda) {
        Moeda novaMoeda = buscaValorDaMoeda.buscaCotacao(moeda, "BRL");
        valorDaMoeda = Double.parseDouble(novaMoeda.conversion_rate());
        this.totalValor = this.valorUsuario * this.valorDaMoeda;
    }

    @Override
    public String toString() {
        return String.valueOf(this.totalValor);
    }
}
