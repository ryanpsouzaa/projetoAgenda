import agenda.Contato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContatoTest {

    @Test
    void ContatoTest(){
        Contato contatoBob = new Contato("Bob", 12, 7);
        assertTrue(contatoBob.getDiaAniversario() == 12);
        System.out.println(contatoBob);

        Contato contatoVazio = new Contato();
        assertTrue(contatoVazio.getNome() == "");

        assertFalse(contatoBob.getNome().equals(contatoVazio.getNome()));
    }
}
