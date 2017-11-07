package Entities;

public class Biography {

    public static String biographyReturn(SuperHero s) {
        String biography;
        if ((s.getAliasSecret() == null)||(s.getSuperPower() == null)){
            biography = (s.getAlias() + " is dank and has no powers. or secret names");
        }else{
            biography = (s.getAlias() + " is really " + s.getAliasSecret() + ". " + s.getAlias() + "'s powers are " + s.getSuperPower());
        }
        return biography;
    }
}
