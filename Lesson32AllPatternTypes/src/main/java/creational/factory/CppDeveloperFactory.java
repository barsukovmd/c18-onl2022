package creational.factory;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createNewDeveloper() {
        return new CppDeveloper();
    }
}
