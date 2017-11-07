import Entities.ComicBookCharacter;
import Entities.SuperHero;
import Entities.SuperVillian;
import SuperPowers.SuperPower;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ComicBookCharacterTest {

    public class ComicBookCharacterImpl extends ComicBookCharacter {

        public ComicBookCharacterImpl(String alias, String aliasSecret, SuperPower superPower) {
            super(alias, aliasSecret, superPower);
        }

        public ComicBookCharacterImpl(String alias) {
            super(alias);
        }

        public String encounter(SuperHero sh) {
            return null;
        }

        public String encounter(SuperVillian sv) {
            return null;
        }
    }

    @Test
    public void shouldCreateComicBookCahracter() {
        ComicBookCharacter comicBookCharacter = new ComicBookCharacterImpl("Dave");
        assertThat(comicBookCharacter.getAlias(), is("Dave"));
    }
}