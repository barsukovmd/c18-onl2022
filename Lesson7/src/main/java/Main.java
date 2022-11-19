public class Main {
    public static void main(String[] args) {
        User user1 = new User("Richard", "Morrison", "male", 30);
        user1.age = 25;
        user1.sex = "male";
        user1.name = "Joseph";
        user1.surname = "Maryland";
        System.out.println(user1.name + " " + user1.surname + " " + user1.age + " " + user1.sex);
        User user2 = new User("Amanda", "Starbucks", "female", 20);
        user2.myNameSurname("Kyle ", "Morris");
        //user2.mySex;//deprecated
        user2.myAge(20);
        user2.myPersonInfo("Richard", "Voxel", 30, "male");
        User user3 = new User("male", 30);
        User user4 = new User("John", "Bachelor", "male");
    }
}
