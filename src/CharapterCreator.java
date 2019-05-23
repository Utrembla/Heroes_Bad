import Heroes.*;

class CharacterCreator {
    public static Hero Create(String name, String characterClass){
        switch (characterClass){
            case "Warrior": return new Warrior(name,
                                            new Might("Great sword",44));
            case "Rogue": return new Theaf(name,
                                         new Might("Dagger",150));
            case "Mage" : return new Mage(name,
                                         new Might("Staff of Manastorm",200));
            case "Druid" : return new Druid(name,
                                         new Might("Groot's left leg",160));
            case "Thief" : return new Theaf(name,
                                         new Might("Knife",220));
        }
        return new Warrior(name,
                new Might("Great sword",44));
    }
}
