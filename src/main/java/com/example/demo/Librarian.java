package com.example.demo;

import java.util.List;

public class Librarian extends Person{

    public Librarian(String name, String email, String phone) {
        super(name, email, phone);
        // TODO Auto-generated constructor stub
    }


    public void blockMember(Member member)
    {
        member.setAstatus(AccountStatus.BLACKLISTED);
        System.out.println(member.getName()+"'s access blocked");
    }

    public void unblockMember(Member member)
    {
        member.setAstatus(AccountStatus.ACTIVE);
        System.out.println(member.getName()+"'s account activated");
    }

    public void printListOfMembers(List<Member> members)
    {
        for(Member m : members)
            System.out.println(m);
    }


    public void printListOfBooks(List<Books> books)
    {
        for(Books book : books)
            System.out.println(book);
    }

    public List<String> listOfActiveMember(List<Member> members) {
        Librarian librarian=new Librarian("luther", "luther@hotmail.com", "9895467");

        Member m1=new Member("Anges", "angesjulie@rediffmail.com", "9948847777");
        Member m2=new Member("Julie", "julieroberts@gmail.com", "9897585867");
        Member m3=new Member("Pratham", "Pratham@gmail.com", "98975867");

        return listOfActiveMember();
    }

    private List<String> listOfActiveMember() {return null;
    }

    public AccountStatus listofactivemembers(List<Member> members) {

//        System.out.println (""+m1.getAstatus()+""+m2.getAstatus()+""+m3.getAstatus());
        return(getStatus());
    }
}