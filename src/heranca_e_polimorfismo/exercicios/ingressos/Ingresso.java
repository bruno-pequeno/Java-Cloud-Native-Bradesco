package heranca_e_polimorfismo.exercicios.ingressos;

public sealed class Ingresso permits MeiaEntrada, IngressoFamilia{
    private double valor;
    private String nomeFilme;
    private DubladoOuLegendado dubladoOuLegendado;

    public Ingresso(){
        setValor();
    }

    public double getValor() {
        return valor;
    }

    public void setValor() {
        this.valor = 30;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public DubladoOuLegendado getDubladoOuLegendado() {
        return dubladoOuLegendado;
    }

    public void setDubladoOuLegendado(DubladoOuLegendado dubladoOuLegendado) {
        this.dubladoOuLegendado = dubladoOuLegendado;
    }
}
