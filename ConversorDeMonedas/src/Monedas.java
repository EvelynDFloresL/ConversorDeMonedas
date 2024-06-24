public class Monedas{
    private  String codigoMoneda;
    private String tasasDeCambio;

    public Monedas(MonedaOmdb monedaOmdb){
    this.codigoMoneda=monedaOmdb.base_code();
    this.tasasDeCambio= monedaOmdb.conversion_rates();

    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getTasasDeCambio() {
        return tasasDeCambio;
    }

    public void setTasasDeCambio(String tasasDeCambio) {
        this.tasasDeCambio = tasasDeCambio;
    }
}
