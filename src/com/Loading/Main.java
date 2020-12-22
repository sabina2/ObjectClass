package com.Loading;



import java.util.Objects;

public class Main implements Cloneable{

    int age;
    String name;
    int Salary;

    public Main(int i, String s,int S) {
        age=i;
        name=s;
        Salary=S;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return age == main.age &&
                Salary == main.Salary &&
                Objects.equals(name, main.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(age, name, Salary);
    }

    @Override
    public String toString() {
        return
                "age=" + age +
                ", name='" + name + '\'' +
                ", S=" + Salary ;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Main  m1=new Main(25,"Monica",200000);
        Main m2=new Main(23,"Ross",20000);
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        System.out.println(m1.equals(m2));
        if(m1.equals(m2))
            System.out.println("They are equal");

         int x=  m1.hashCode();
         System.out.println(x);
         System.out.println(m1.age+" "+m1.name);

        Main m3=(Main)m2.clone();
        System.out.println("Cloning "+ m3);
        System.out.println(m3.Salary);
    }
}
