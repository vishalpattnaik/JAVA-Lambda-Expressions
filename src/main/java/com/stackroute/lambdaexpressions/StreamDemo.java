package com.stackroute.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Place> places=new ArrayList<>();
        places.add(new Place("Nepal","Kathmandu"));
        places.add(new Place("Nepal","Pokhara"));
        places.add(new Place("Sri Lanka","Colombo"));
        places.add(new Place("India","Mumbai"));
        places.add(new Place("Pakistan","Karachi"));
        places.stream()
                .filter(place -> place.getCountry().equals("Nepal"))
                .forEach(p->System.out.println(p.getCity()));
    }


}

class Place
{
    private String country;
    private String city;

    public Place(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Place{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}