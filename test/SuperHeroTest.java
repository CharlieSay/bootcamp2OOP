import Entities.Biography;
import Entities.SuperHero;
import Entities.SuperVillian;
import SuperPowers.SuperPower;
import SuperPowers.fireBall;
import SuperPowers.webSlinging;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SuperHeroTest {

    @Test
    public void superHeroBattleTest(){
        SuperHero spiderMan = new SuperHero("Spiderman","Ya Nan",new webSlinging());
        SuperVillian evilMan = new SuperVillian("Kermit the frog","KMF",new fireBall());
        assertThat(spiderMan.encounter(evilMan), is("Spiderman battles Kermit the frog using Web Slinging"));
    }

    @Test
    public void testForEncounterSuperHeroEncountersSuperHero() {
        SuperHero spiderMan = new SuperHero("Spiderman");
        SuperHero captainAmerica = new SuperHero("Captain America");
        assertThat("Spiderman high-fives Captain America", is(spiderMan.encounter(captainAmerica)));
    }
    @Test
    public void  testForEncounterSuperHeroEncountersSuperVillain() {
        SuperVillian kermitTheFrog = new SuperVillian("Kermit the frog");
        SuperVillian codyCodes = new SuperVillian("codyCodes");
        assertThat("Kermit the frog plots with codyCodes", is(kermitTheFrog.encounter(codyCodes)));
    }

    @Test
    public void testForSecretNameObject() {
        SuperHero SuperSuperHero = new SuperHero("Spiderman", "Peter Parker", new webSlinging());
        assertThat("Peter Parker", is(SuperSuperHero.getAliasSecret()));
    }

    @Test
    public void testForSuperHeroNameObject() {
        SuperHero SuperSuperHero = new SuperHero("Spiderman");
        assertThat("Spiderman", is(SuperSuperHero.getAlias()));
    }

    @Test
    public void testForSuperPowers() {
        SuperHero SuperSuperHero = new SuperHero("Spiderman", "Peter Parker", new webSlinging());
        SuperVillian superVillian = new SuperVillian("Bicycle Repair Man");
        assertThat(SuperSuperHero.getSuperPower().useOn(superVillian), is("Squelch Bicycle Repair Man is immobilised"));
    }

    @Test
    public void testForNoSecretAlias() {
        SuperHero karlPilkington = new SuperHero("Karl Pilkington");
        assertThat("Karl Pilkington is dank and has no powers. or secret names",
                is(Biography.biographyReturn(karlPilkington)));
    }

}

