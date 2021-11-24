import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    void deveExigirCentralCriativa() {
        Usuario Usuario = new Usuario();
        assertEquals("O Mediador agradece seu contato.\nA CentralCriativa respondeu.\n" +
                        ">>A CentralCriativa agradece",
                Usuario.exigenciaCentralCriativa("ExemploExigir"));
    }

    @Test
    void deveReclamarCentralCriativa() {
        Usuario Usuario = new Usuario();
        assertEquals("O Mediador agradece seu contato.\nA CentralCriativa respondeu.\n" +
                        ">>A CentralCriativa agradece",
                Usuario.reclamarCentralCriativa("ExemploReclamar"));
    }

    @Test
    void deveApoiarCentralCriativa() {
        Usuario Usuario = new Usuario();
        assertEquals("O Mediador agradece seu contato.\nA CentralCriativa respondeu.\n" +
                        ">>A CentralCriativa agradece",
                Usuario.apoioCentralCriativa("ExemploApoiar"));
    }

    @Test
    void deveInspirarCentralCriativa() {
        Usuario Usuario = new Usuario();
        assertEquals("O Mediador agradece seu contato.\nA CentralCriativa respondeu.\n" +
                        ">>A CentralCriativa agradece",
                Usuario.inspiracaoCentralCriativa("ExemploIspirar"));
    }

}