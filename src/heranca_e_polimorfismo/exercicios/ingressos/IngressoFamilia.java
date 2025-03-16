package heranca_e_polimorfismo.exercicios.ingressos;

public non-sealed class IngressoFamilia extends Ingresso{
    double valor = super.getValor();

    public double valorIngressoFamilia(int qtdPessoas){
        double total = valor * qtdPessoas;

        if(qtdPessoas > 3){
            total *= 0.95;
        }

        return total;
    }
}
