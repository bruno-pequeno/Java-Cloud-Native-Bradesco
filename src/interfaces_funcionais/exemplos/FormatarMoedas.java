package interfaces_funcionais.exemplos;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class FormatarMoedas {
    public static void main(String[] args) {
        List<Double> valores = List.of(600.0, 1500.75, 2599.99, 100.5, 80.0);

        System.out.println("========= Real ========");
        formatarParaReal(valores);

        System.out.println("\n========= Dólar ========");
        formatarParaDolar(valores);
    }

    private static void formatarParaReal(List<Double> valores){
        Function<Double, String> formatarParaReal = valor -> {
            NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            return formato.format(valor);

        };

        valores.forEach(valor -> System.out.println(formatarParaReal.apply(valor)));
    }

    private static void formatarParaDolar(List<Double> valores){
        Function<Double, String> formatarParaDolar = valor -> {
            NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
            return formato.format(valor);

        };

        valores.forEach(valor -> System.out.println(formatarParaDolar.apply(valor)));
    }
}
