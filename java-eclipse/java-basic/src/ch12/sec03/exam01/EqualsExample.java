package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member m = new Member();
        m.setId("abc");
        System.out.println(m.getId());
        System.out.println(m);
    }
}