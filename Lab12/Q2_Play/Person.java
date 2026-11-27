public class Person {

    public Playable getPlay(String toyName){
        switch (toyName) {
            case "Piano":       return new Piano();
            case "Football":    return new Football();
            case "Chess":       return new Chess();
            default:            return null;
        }
    }
}