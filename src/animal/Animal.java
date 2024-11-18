package animal;

public class Animal {
    private String name; // 名前
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}
