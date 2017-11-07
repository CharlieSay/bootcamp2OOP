package SuperPowers;

import Entities.SuperHero;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class fireBallTest {

    @Test
    public void shouldUsePowerOnHero(){
        SuperHero hero = new SuperHero("Dave");
        fireBall fireBall = new fireBall();
        assertThat("Fire ball at Dave is immobilised", is(fireBall.useOn(hero)));
    }

}