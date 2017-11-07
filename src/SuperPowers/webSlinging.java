package SuperPowers;

import Entities.ComicBookCharacter;

public class webSlinging implements SuperPower{

    public String getUserFriendlyName(){
        return "Web Slinging";
    }

    public String useOn(ComicBookCharacter c) {
        return "Squelch " + c.getAlias() + " is immobilised";
    }
}
