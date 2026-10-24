import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test 
    public void exemploEstruturaAaa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(1.0);
        // Assert
        assertEquals("este exemplo só ilustra AAA; substitua pelos seus 2 testes",0.0, aulas, 0.001);
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
    @Test
    public void testarAddAulaAvulsa() {
        Personal personal = new Personal("Joao", "123");

        assertEquals(20.0, personal.addAulaAvulsa(20),0.001);
        assertEquals(30.0, personal.addAulaAvulsa(15),0.001);
        assertEquals(30.0, personal.addAulaAvulsa(-5),0.001);
    }

    @Test
    
    public void testarRegistrarPagamento(){
        Personal personal = new Personal("Joao", "123");
        personal.addAulaAvulsa(10);

        assertEquals(4231.50, personal.registrarPagamento(),0.001);
        assertEquals(4231.50, personal.getUltimoPagamento(),0.001);
        assertEquals(3627.00, personal.registrarPagamento(),0.001);
    }
    
}
