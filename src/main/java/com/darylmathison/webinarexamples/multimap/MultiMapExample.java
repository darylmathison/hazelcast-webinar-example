package com.darylmathison.webinarexamples.multimap;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IdGenerator;
import com.hazelcast.core.MultiMap;
import java.util.Collection;

/**
 *
 * @author Daryl
 */
public class MultiMapExample {

    private static final int START = 100;
    private static final int MAX = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
        
        MultiMap<Long, Long> mMap = instance.getMultiMap("multi");
        IdGenerator idGen = instance.getIdGenerator("gen");
        IdGenerator valueGen = instance.getIdGenerator("value");
        valueGen.init(START);
        
        long id = 0;
        
        //Load her up
        for(int i = 0; i < MAX; i++) {
            id = idGen.newId();
            for(int j = 0; j < MAX; j++) {
                mMap.put(id, valueGen.newId());
            }
        }
        
        for(Long key: mMap.keySet()) {
            System.out.format("Key: %d\nValues: ", key);
            for(Long value: mMap.get(key)) {
                System.out.format("%d; ", value);
            }
            System.out.println();
        }
        mMap.destroy();
        valueGen.destroy();
        idGen.destroy();
        instance.shutdown();
    }
    
}
