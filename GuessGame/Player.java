public class Player {
    String name;
    int guess;

    Player(String name){
        this.name = name;
    }

    void makeGuess(){
        System.out.println(name + " is guessing");
    }
}
