package backend.malam;

import org.json.JSONException;
import org.json.JSONObject;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(JSONObject object) throws JSONException {

        name = object.getString("name");
        age = object.getInt("age");


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
