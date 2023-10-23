package org.human;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class. More accurately, a class definition written in such a way that instances of it,
 * once created, cannot have their properties change. There are simply no public methods to do so.
 * EX: Getters but no setters, as there is nothing for the client to set.
 */
class Person {
    private final String name;
    private final LocalDate birthDate;
    // when you have no setters to delegate to, assign the values directly.
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthDate = birthdate;
    }
    /*
     * Returns person's age in whole years.
     * This is a derived property, i.e. it is calculated and returned, not stored in a field.
     */
    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person name: %s, birthDate: %s",
                getName(), getBirthDate());
    }
}