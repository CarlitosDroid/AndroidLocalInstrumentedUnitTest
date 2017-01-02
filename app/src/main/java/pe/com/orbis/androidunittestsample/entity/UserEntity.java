package pe.com.orbis.androidunittestsample.entity;

/**
 * Created by carlosvargas on 2/01/17.
 *
 */

public class UserEntity {

    private String name;
    private int age;

    public UserEntity() {
    }

    public UserEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
