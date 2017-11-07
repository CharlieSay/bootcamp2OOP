package Entities;

import SuperPowers.SuperPower;

public class SuperVillian extends ComicBookCharacter {
    public SuperVillian(String alias, String aliasSecret, SuperPower superPower) {
        super(alias, aliasSecret, superPower);
    }

    public SuperVillian(String alias) {
        super(alias);
    }

    @Override
    public String encounter(SuperHero sh) {
        String outcome = (this.getAlias() + " battles " + sh.getAlias() + " using " + this.getSuperPower().getUserFriendlyName());
        return outcome;
    }

    @Override
    public String encounter(SuperVillian sv) {
        String outcome = (this.getAlias() + " plots with " + sv.getAlias());
        return outcome;
    }
}
