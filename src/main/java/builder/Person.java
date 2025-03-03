package builder;

import java.net.http.HttpClient;

public class Person {
    private String name;
    private String place;
    private String email;

    public Person(String name, String place, String email) {
        this.name = name;
        this.place = place;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + name);
        System.out.println("Place: " + place);
        System.out.println("Email: " + email);
        return "";
    }
    public static PersonBuilder getBuilder(){
        return new PersonBuilder();
    }
    public static class PersonBuilder{
        private String name;
        private String place;
        private String email;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setPlace(String place) {
            this.place = place;
            return this;
        }

        public PersonBuilder setEmail(String mail) {
            this.email = mail;
            return this;
        }

        public Person build() {
            return new Person(name, place, email);
        }
    }
}
