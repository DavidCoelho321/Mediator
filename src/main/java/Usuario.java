public class Usuario {

    public String reclamarCentralCriativa(String feedback) {
        return CentralCriativa.getInstancia().receberReclamacao(feedback);
    }

    public String exigenciaCentralCriativa(String feedback) {
        return CentralCriativa.getInstancia().receberExigencia(feedback);
    }

    public String apoioCentralCriativa(String feedback) {
        return CentralCriativa.getInstancia().receberApoio(feedback);
    }
    public String inspiracaoCentralCriativa(String feedback) {
        return CentralCriativa.getInstancia().receberInspiracao(feedback);
    }
}