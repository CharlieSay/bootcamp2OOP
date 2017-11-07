package SuperPowers;

import Entities.SuperHero;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class webSlingingTest {
    @Test
    public void shouldUsePowerOnHero(){
        SuperHero hero = new SuperHero("Dave");
        webSlinging webSlinging = new webSlinging();
        assertThat("Squelch Dave is immobilised", is(webSlinging.useOn(hero)));
    }


}