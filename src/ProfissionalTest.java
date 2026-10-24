import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test
    void exemploEstruturaAaa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(1.0);
        // Assert
        assertTrue(true);
        // assertEquals(0.0, aulas, 0.001,
        //         "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
    @Test
    void  testarAddAulaAvulsa() {
        Personal personal = new Personal("Joao", "123");

        assertEquals(20.0, personal.addAulaAvulsa(20));
        assertEquals(30.0, personal.addAulaAvulsa(15));
        assertEquals(30.0, personal.addAulaAvulsa(-5));
    }
    
}
