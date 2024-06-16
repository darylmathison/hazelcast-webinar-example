/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darylmathison.webinarexamples.imap;

import com.hazelcast.map.EntryProcessor;
import java.util.Map.Entry;

/**
 *
 * @author Daryl
 */
public class EntryProcessorExample implements EntryProcessor<Long, Person, Person> {

    @Override
    public Person process(Entry<Long, Person> entry) {
        if(entry.getKey() > 200) {
            return entry.getValue();
        }
        return null;
    }
}
