public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.showWords();

        Narwhal animal2 = new Narwhal(); //when you call a method that is overridden in the subclass from the subclass object then it's gonna call it from the subclass
        animal2.showWords();

    }
}
