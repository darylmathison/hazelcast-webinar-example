/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darylmathison.webinarexamples.imap;

import java.io.Serializable;

/**
 *
 * @author Daryl
 */
public class Person implements Serializable {
    private Name name;
    
    public static class Name implements Serializable {
        private String last;
        private String first;

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }
    }
}
