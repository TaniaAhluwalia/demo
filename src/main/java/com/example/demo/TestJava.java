package com.example.demo;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class TestJava {


    @Test
    public void activeMembers() {

        Librarian lib=new Librarian("luther", "luther@hotmail.com", "9895467");

        Member m1=new Member("Anges", "angesjulie@rediffmail.com", "9948847777");
        Member m2=new Member("Julie", "julieroberts@gmail.com", "9897585867");
        Member m3=new Member("Pratham", "Pratham@gmail.com", "98975867");


        List<Member> members= Arrays.asList(m1,m2,m3);

        AccountStatus active=lib.listofactivemembers(members);
        System.out.println(active);



    }


}
