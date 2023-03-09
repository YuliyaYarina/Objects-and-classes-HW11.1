public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author pushkin2 = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book eugeneOnegin = new Book("Евгений Онегин", 1831, pushkin);
        Book eugeneOnegin2 = new Book("Евгений Онегин", 1831, pushkin);
        Book warAndPeace = new Book("Война и мир", 1854, tolstoy);

        System.out.println(eugeneOnegin.equals(eugeneOnegin2));
        System.out.println(warAndPeace);

    }

}