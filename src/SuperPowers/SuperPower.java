package SuperPowers;

import Entities.ComicBookCharacter;

public interface SuperPower {
    String getUserFriendlyName();
    String useOn(ComicBookCharacter c);
}
