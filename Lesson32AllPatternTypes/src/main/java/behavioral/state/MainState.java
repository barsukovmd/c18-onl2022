package behavioral.state;

public class MainState {
    public static void main(String[] args) {
        Activity activity = new Training();
        DeveloperCasualDay developerDay = new DeveloperCasualDay();
        developerDay.setActivity(activity);
        for (int i = 0; i < 10; i++) {
            developerDay.justDoIt();
            developerDay.changeActivity();
        }
    }
}
