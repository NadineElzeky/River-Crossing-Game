package game;

public class Factory {

    public ICrosser getCrosser(String name) {
        if (name.equals("Fox")) {
            return new Fox();
        }
        else if (name.equals("Goat")) {
            return new Goat();
        }
        else if (name.equals("Plant")) {
            return new Plant();
        }else if (name.equals("sheep")) {
            return new Sheep();
        }else if (name.equals("Lion")) {
            return new Lion();
        }else if (name.equals("Farmer")) {
            return new Farmer();}
        else
        return null;

    }

}
