package kapitelX_Enhetstester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// alt + enter --> junit 5.2

class GeometriTest {

    // om vi skickar in sidan 0 ska manteln vara 0
    @Test
    void skickaIn0SkaGe0(){
        // Given = Givet
        // Givet att vi har en instans av vår klass
        Geometri minKlassSomSkaTestas = new Geometri();

        // When = När
        // När vi anropar vår mantelarea-metod med sidan 0
        double mantelArea = minKlassSomSkaTestas.mantelareaKub(0);

        // Then = Då
        // Då ska manteln vara 0
        Assertions.assertEquals(0, mantelArea);
    }

    @Test
    void skickaIn1SkaGe6(){
        Geometri minKlassSomSkaTestas = new Geometri();
        double mantelArea = minKlassSomSkaTestas.mantelareaKub(1);
        Assertions.assertEquals(6, mantelArea);
    }

    @Test
    void skickaIn2SkaGe24(){
        Geometri minKlassSomSkaTestas = new Geometri();
        double mantelArea = minKlassSomSkaTestas.mantelareaKub(2);
        Assertions.assertEquals(24, mantelArea);
    }

}