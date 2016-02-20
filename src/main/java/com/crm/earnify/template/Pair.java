 /*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */  
package com.crm.earnify.template;

 /**
 *  @version     1.0, 8/2/16
 *  @author sandeepandey
 */


 public class Pair<U, V> implements Comparable<Pair<U, V>> {
     public final U first;
     public final V second;

     public static <U, V> Pair<U, V> makePair(U first, V second) {
         return new Pair(first, second);
     }

     public Pair(U first, V second) {
         this.first = first;
         this.second = second;
     }

     public boolean equals(Object o) {
         if (this == o) {
             return true;
         } else if (o != null && this.getClass() == o.getClass()) {
             boolean var10000;
             label45:
             {
                 Pair pair = (Pair) o;
                 if (this.first != null) {
                     if (!this.first.equals(pair.first)) {
                         break label45;
                     }
                 } else if (pair.first != null) {
                     break label45;
                 }

                 if (this.second != null) {
                     if (!this.second.equals(pair.second)) {
                         break label45;
                     }
                 } else if (pair.second != null) {
                     break label45;
                 }

                 var10000 = true;
                 return var10000;
             }

             var10000 = false;
             return var10000;
         } else {
             return false;
         }
     }

     public int hashCode() {
         int result = this.first != null ? this.first.hashCode() : 0;
         result = 31 * result + (this.second != null ? this.second.hashCode() : 0);
         return result;
     }

     public Pair<V, U> swap() {
         return makePair(this.second, this.first);
     }

     public String toString() {
         return "(" + this.first + "," + this.second + ")";
     }

     public int compareTo(Pair<U, V> o) {
         int value = ((Comparable) this.first).compareTo(o.first);
         return value != 0 ? value : ((Comparable) this.second).compareTo(o.second);
     }

     public U getFirst() {
         return this.first;
     }

     public V getSecond() {
         return this.second;
     }
 }

