import Entities.SuperHero;
import Entities.SuperVillian;
import SuperPowers.fireBall;
import SuperPowers.webSlinging;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SuperVillianTest {

    @Test
    public void souldCreateNewVillain() {
        SuperVillian superVillian = new SuperVillian("Bicycle Repair Man");
        assertThat(superVillian.getAlias(), is("Bicycle Repair Man"));
    }

    @Test
    public void testForEncounterSuperVillainEncountersSuperHero() {
        SuperHero spiderMan = new SuperHero("Spiderman","Ya Nan",new webSlinging());
        SuperVillian evilMan = new SuperVillian("Kermit the frog","KMF",new fireBall());
        assertThat(evilMan.encounter(spiderMan), is("Kermit the frog battles Spiderman using Fire Ball"));
    }
    @Test
    public void testForEncounterSuperVillainEncountersSuperVillain() {
        SuperVillian kermitTheFrog = new SuperVillian("Kermit the frog");
        SuperVillian codyCodes = new SuperVillian("codyCodes");
        assertThat("Kermit the frog plots with codyCodes", is(kermitTheFrog.encounter(codyCodes)));
    }
}
