/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darylmathison.webinarexamples.imap;

import static com.hazelcast.query.Predicates.equal;
import static com.hazelcast.query.Predicates.not;

import com.hazelcast.map.IMap;
import com.hazelcast.query.Predicate;
import java.util.Collection;
/**
 *
 * @author Daryl
 */
public class PredicateExample {
    public static Collection<Person> findPerson(IMap<Long, Person> map) {
        Predicate p = equal("name.last", "Smith");
        Predicate notP = not(p);
        return map.values(notP);
    }
}
