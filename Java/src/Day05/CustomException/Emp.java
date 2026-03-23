package Day05.CustomException;

public class Emp {
    String name;
    int age;
    String email;

    public Emp(String name, int age, String email) throws  AgeException{
        validateAge(age);
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public void validateAge(int age) throws AgeException {
        if (age<25)
            throw new AgeException("Age cant be less than 25.");
    }
}
