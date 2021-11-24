public class CentralCriativa {

    private static CentralCriativa instancia = new CentralCriativa();

    private CentralCriativa() {}

    public static CentralCriativa getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String feedback) {
        return "A CentralCriativa vai procurar melhorar o destino para sua reclamação: " + feedback;
    }

    public String receberExigencia(String feedback) {
        return "A CentralCriativa ira analizar suas exigencas: " + feedback;
    }

    public String receberApoio(String feedback) {
        return "A CentralCriativa encaminhar seu apoio: " + feedback;
    }
    public String receberInspiracao(String feedback) {
        return "A CentralCriativa analizar sua ispiração: " + feedback;
    }

}