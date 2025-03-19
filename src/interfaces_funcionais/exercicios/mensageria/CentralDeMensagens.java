package interfaces_funcionais.exercicios.mensageria;

public class CentralDeMensagens implements Mensageria{

    @Override
    public String enviarMensagemSMS(String mensagem) {
        return "Enviando mensagem via SMS... \nMensagem enviada: " + mensagem;
    }

    @Override
    public String enviarMensagemEmail(String mensagem) {
        return "Enviando mensagem por Email... \nMensagem enviada: " + mensagem;
    }

    @Override
    public String enviarMensagemRedesSociais(String mensagem) {
        return "Enviando mensagem as redes sociais... \nMensagem enviada: " + mensagem;
    }

    @Override
    public String enviarMensagemWhatsApp(String mensagem) {
        return "Enviando mensagem via WhatsApp... \nMensagem enviada: " + mensagem;
    }
}
