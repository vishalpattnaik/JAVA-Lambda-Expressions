package com.stackroute.lambdaexpressions;

import java.util.ArrayList;

public class StreamDemo2 {

    private String names;

    @Override
    public String toString() {
        return "StreamNewDemo{" +
                "names='" + names + '\'' +
                '}';
    }

    public StreamDemo2(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public static void main(String[] args) {

        ArrayList<StreamDemo2> memberNames = new ArrayList<>();

        memberNames.add(new StreamDemo2("Amitabh"));
        memberNames.add(new StreamDemo2("Shekhar"));
        memberNames.add(new StreamDemo2("Aman"));
        memberNames.add(new StreamDemo2("ahana"));
        memberNames.add(new StreamDemo2("Shahrukh"));
        memberNames.add(new StreamDemo2("Salman"));
        memberNames.add(new StreamDemo2("Yana"));
        memberNames.add(new StreamDemo2("Lokesh"));

        memberNames.stream().filter(name -> name.getNames().startsWith("A")).forEach(name -> System.out.println(name + "\n"));

    }
}
