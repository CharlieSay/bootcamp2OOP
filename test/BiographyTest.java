import Entities.Biography;
import Entities.SuperHero;
import SuperPowers.webSlinging;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BiographyTest {
    @Test
    public void testForBiography() {
        SuperHero SuperSuperHero = new SuperHero("Spiderman", "Peter Parker", new webSlinging());
        assertThat((Biography.biographyReturn(SuperSuperHero)),
                is("Spiderman is really Peter Parker. Spiderman's powers are Wall-crawling"));
    }


}