package heranca_e_polimorfismo.exercicios.ingressos;

public non-sealed class MeiaEntrada extends Ingresso{
    double valor = super.getValor();

    public double valorMeiaEntrada(){
        return valor / 2;
    }
}
