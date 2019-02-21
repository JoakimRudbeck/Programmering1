package kapitelX_Enhetstester;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TestKlassTest {
    static TestKlass testKlass = new TestKlass();

    @org.junit.jupiter.api.Test
    void metodSomSkaTestas() {
        // GIVEN
        // Givet en instans av klassen som ska testas


        // WHEN
        // När metoden anropas
        int returVärde = testKlass.metodSomSkaTestas();

        // THEN
        // Då ska returvärdet vara 10.
        Assertions.assertEquals(10, returVärde);
    }

    @org.junit.jupiter.api.Test
    void testaKvadrera(){

        int minusTreIKvadrat = testKlass.kvadrera(-3);


        Assertions.assertEquals(9, minusTreIKvadrat);

    }
}