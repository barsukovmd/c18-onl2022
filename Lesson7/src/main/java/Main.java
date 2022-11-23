public class Main {
    public static void main(String[] args) {
        User user2 = new User("Ricardo", "Fibonacci", "male");
        user2.myNameSurname("Kyle ", "Morris");
        //user2.mySex;//deprecated
        user2.myAge(20);
        user2.myPersonInfo("Richard", "Voxel", 30, "male");
        User user3 = new User("male", "Maryland", "male");
        User user4 = new User("Richard", "Mathew", "male");
    }
}
