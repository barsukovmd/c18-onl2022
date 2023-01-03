package task2;

// *
// * 2) Обобщенный класс с тремя параметрами
// * Создать обобщенный класс с тремя параметрами (T, V, K).
// * Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
// * методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех
//   переменных класса.
// * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
// * V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
// *
public class Main {
    public static void main(String[] args) {
        General<String, Animal, Double>[] generalAnimal = new General[]{
                new General<>("compare", new Animal("Wolf", 5), 1.3),
                new General<>("compare", new Animal("Fox", 8), 2.1),
                new General<>("compare", new Animal("Bear", 7), 1.7),
        };
        for (General<String, Animal, Double> animal : generalAnimal) {
            System.out.println(animal.getClassK());
            System.out.println(animal.getClassV());
            System.out.println(animal.getClassT());
        }
    }
}
