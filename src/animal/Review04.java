package animal;

public class Review04 {

    public static void main(String[] args) {
        Human tanaka = new Human("田中　太郎", 25, "電車");
        Human suzuki = new Human("鈴木　次郎", 30, "野球");
        Human sato   = new Human("佐藤　花子", 20, "映画");

        sayAndThink(tanaka);
        sayAndThink(suzuki);
        sayAndThink(sato);
    }

    public static void sayAndThink(Human human) {
        human.say();
        human.think();
    }
}
