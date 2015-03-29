/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darylmathison.webinarexamples.imap;

import com.hazelcast.map.AbstractEntryProcessor;
import java.util.Map;

/**
 *
 * @author Daryl
 */
public class EntryProcessorExample extends AbstractEntryProcessor<Long, Person> {

    @Override
    public Object process(Map.Entry<Long, Person> entry) {
        if(entry.getKey() > 200) {
            return entry.getValue();
        }
        return null;
    }
}
