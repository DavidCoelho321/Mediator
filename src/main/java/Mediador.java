public class Mediador {

    private static Mediador instancia = new Mediador();

    private Mediador() {}

    public static Mediador getInstancia() {
        return instancia;
    }

    public String receberReclamacaoCentralCriativa(String feedback) {
        return "O Mediador agradece seu contato.\n"+
                "A CentralCriativa acatou a reeclamação disposta, de acordo.\n" +
                ">>" + CentralCriativa.getInstancia().receberReclamacao(feedback);
    }

    public String receberExigenciaCentralCriativa(String feedback) {
        return "O Mediador agradece seu contato.\n"+
                "A CentralCriativa acatou a reeclamação disposta, de acordo.\n" +
                ">>" + CentralCriativa.getInstancia().receberExigencia(feedback);
    }

    public String receberApoioCentralCriativa(String feedback) {
        return "O Mediador agradece seu contato.\n"+
                "A CentralCriativa acatou a reeclamação disposta, de acordo.\n" +
                ">>" + CentralCriativa.getInstancia().receberApoio(feedback);
    }

    public String receberInspiracaoCentralCriativa(String feedback) {
        return "O Mediador agradece seu contato.\n"+
                "A CentralCriativa acatou a reeclamação disposta, de acordo.\n" +
                ">>" + CentralCriativa.getInstancia().receberInspiracao(feedback);
    }
}
