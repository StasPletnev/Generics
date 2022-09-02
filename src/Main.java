public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(3);

        magicBox.add(2);
        magicBox.add(5);
        magicBox.add(3);
        System.out.println(magicBox.pick());

        MagicBox<String> magicBoxString = new MagicBox<>(4);

        magicBoxString.add("США");
        magicBoxString.add("Россия");
        magicBoxString.add("Китай");
        magicBoxString.add("Индонезия");
        System.out.println(magicBoxString.pick());
    }
}
