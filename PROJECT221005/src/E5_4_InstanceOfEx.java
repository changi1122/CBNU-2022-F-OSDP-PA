// 예제 5-4

class E5_4_Person { }
class E5_4_Student extends E5_4_Person { }
class E5_4_Researcher extends E5_4_Person { }
class E5_4_Professor extends E5_4_Researcher { }

public class E5_4_InstanceOfEx {
    static void print(E5_4_Person p) {
        if (p instanceof E5_4_Person)
            System.out.print("Person ");
        if (p instanceof E5_4_Student)
            System.out.print("Student ");
        if (p instanceof E5_4_Researcher)
            System.out.print("Researcher ");
        if (p instanceof E5_4_Professor)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new E5_4_Student());
        System.out.print("new Researcher() ->\t"); print(new E5_4_Researcher());
        System.out.print("new Professor() ->\t"); print(new E5_4_Professor());
    }
}
