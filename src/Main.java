public class Main {
    public static void main(String[] args) {

        Popugai popugai = new Popugai();
        popugai.setName("popugai");
        popugai.setWeight(1.5);
        System.out.println(popugai);

        Fish fish = new Fish();
        fish.setName("lasos");
        fish.setWeight(3.2);
        System.out.println(fish);

        Cat cat = new Cat();
        cat.setName("Murka");
        cat.setWeight(1.2);
        System.out.println(cat);

        Dog dog = new Dog();
        dog.setName("layka");
        dog.setWeight(5.4);
        System.out.println(dog);

    }
}