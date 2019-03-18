package kapitelX_Enhetstester;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlassSomSkaTestasTest {

    @Test
    void kvadreraBörKvadrera(){
        // Given
        // Givet en instans av klassen som ska testas
        KlassSomSkaTestas testKlass = new KlassSomSkaTestas();
        // When
        // När vi anropar metoden kvadrera med talet 5
        int x = 5;
        int kvadraten = testKlass.kvadrera(x);

        // Then
        // Då ska värdet vi får tillbaka vara 25
        Assertions.assertEquals(25,kvadraten);
    }

    @Test
    void negativTalSkaReturneraPositivtTal(){
        KlassSomSkaTestas testKlass = new KlassSomSkaTestas();
        int x = -3;
        double kvadraten = testKlass.kvadrera(x);
        Assertions.assertEquals(9, kvadraten);
    }
}