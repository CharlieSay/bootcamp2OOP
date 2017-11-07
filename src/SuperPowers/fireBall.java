package SuperPowers;

import Entities.ComicBookCharacter;

public class fireBall implements SuperPower{

    @Override
    public String getUserFriendlyName() {
        return "Fire Ball";
    }

    public String useOn(ComicBookCharacter c) {
        return "Fire ball at " + c.getAlias() + " is immobilised";
    }
}
