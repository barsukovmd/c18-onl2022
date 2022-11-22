public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jackie", "Richardson");
        user1.age = 25;
        user1.sex = "male";
        user1.name = "Joseph";
        user1.surname = "Maryland";
        System.out.println(user1.name + " " + user1.surname + " " + user1.age + " " + user1.sex);
        User user2 = new User("Ricardo", "Fibonacci", "male");
        user2.myNameSurname("Kyle ", "Morris");
        //user2.mySex;//deprecated
        user2.myAge(20);
        user2.myPersonInfo("Richard", "Voxel", 30, "male");
        User user3 = new User("male", "Maryland", "male");
        User user4 = new User("Richard", "Mathew", "male");
    }
}
