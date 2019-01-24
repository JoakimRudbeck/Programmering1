package kapitelX_Enhetstester;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TestKlassTest {

    @org.junit.jupiter.api.Test
    void metodSomSkaTestas() {
        // GIVEN
        // Givet en instans av klassen som ska testas
        TestKlass testKlass = new TestKlass();

        // WHEN
        // När metoden anropas
        int returVärde = testKlass.metodSomSkaTestas();

        // THEN
        // Då ska returvärdet vara 10.
        Assertions.assertEquals(10, returVärde);
    }
}