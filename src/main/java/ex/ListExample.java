package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string1");
        strings.add("string2");
        strings.add("string3");
        strings.add("string1");
        strings.add("string3");

        var string3 = strings.indexOf("string3");
        System.out.println(string3);
        strings.removeIf(s -> s.equals("string1"));
        System.out.println(strings);
        System.out.println();

        Frog fr1 = new Frog("name1");
        Frog fr2 = new Frog("name2");
        Frog fr3 = new Frog("name3");
        Frog fr4 = new Frog("name2");

        List<Frog> frogs = new ArrayList<>();
        frogs.add(fr1);
        frogs.add(fr2);
        frogs.add(fr3);

        frogs.remove(fr4);
        System.out.println(frogs);
    }
}
class Frog {
    private String name;

    public Frog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frog frog = (Frog) o;
        return Objects.equals(name, frog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
