package interfaces_funcionais.exercicios.mensageria;

public interface Mensageria {
    String enviarMensagemSMS(String mensagem);
    String enviarMensagemEmail(String mensagem);
    String enviarMensagemRedesSociais(String mensagem);
    String enviarMensagemWhatsApp(String mensagem);
}
