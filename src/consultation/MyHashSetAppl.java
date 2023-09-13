package consultation;

public class MyHashSetAppl {
    public static void main(String[] args) {
        MyHashSet<String> mySet = new MyHashSet<>();
        mySet.add("112");
        mySet.add("113");
        mySet.add("1124");
        mySet.add("112555");
        mySet.add("1126");

        System.out.println(mySet.contain("113"));
        System.out.println(mySet.contain("113445"));

        System.out.println(mySet);
    }
}
