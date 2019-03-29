package designpattern.builder;

public class Client {
 public static void main(String[] args) {
 Student st =	new StudentBuilder().setFirstName("bhi").setLsateName("chat").setMiddleName("m").setAge("12").build();
 System.out.println(st.firstName);
 System.out.println(st.lsateName);
 System.out.println(st.middleName);
 System.out.println(st.age);
}
}
