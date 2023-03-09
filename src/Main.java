public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book eugeneOnegin = new Book("Евгений Онегин", 1831, pushkin);
        Book warAndPeace = new Book("Война и мир", 1854, tolstoy);

        eugeneOnegin.printInfo();
        warAndPeace.printInfo();

        eugeneOnegin.setPublishingYear(1823);
        eugeneOnegin.printInfo();
    }

}