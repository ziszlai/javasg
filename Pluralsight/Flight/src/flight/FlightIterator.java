/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight;

import java.util.Iterator;

/**
 *
 * @author zoltaniszlai
 */
public class FlightIterator implements Iterator<Person> {
    private CrewMember[] crew;
    private Passager[] roster;
    private int index = 0;
    
    public FlightIterator (CrewMember[] crew, Passager[] roster) {
        this.crew = crew;
        this.roster = roster;
    }

    public boolean hasNext() {
        return index < (crew.length + roster.length);
    }

    public Person next() {
        Person p = (index < crew.length)? crew[index]: roster[index - crew.length];
        index ++;
        return p;
    }
}
