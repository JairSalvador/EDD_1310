package ico.fes;

import java.util.ArrayList;
import java.util.Objects;
 

public class ADTHash<K, V> {
    K key;
    V value;
      final int hashCode;
 

    ADTHash<K, V> next;
 

    public ADTHash(K key, V value, int hashCode)
    {
        this.key = key;
        this.value = value;
          this.hashCode = hashCode;
    }
}
 

class Hash<K, V> {
    
    private ArrayList<ADTHash<K, V> > array;
    private int num;
    private int size;
 
    public Hash(){
        array = new ArrayList<>();
        num = 10;
        size = 0;
        for (int i = 0; i < num; i++)
            array.add(null);
    }
    
      private final int hashCode (K key) {
        return Objects.hashCode(key);
    }
   
    
    private int getIndex(K key)
    {
        int hashCode = hashCode(key);
        int index = hashCode % num;
        
        index = index < 0 ? index * -1 : index;
        return index;
    }
    
    public V remove(K key)
    {
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);
        
        ADTHash<K, V> head = array.get(bucketIndex);
 
        
        ADTHash<K, V> prev = null;
        while (head != null) {
           
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;
 
            
            prev = head;
            head = head.next;
        }
 
        
        if (head == null)
            return null;
        size--;
 
 
        if (prev != null)
            prev.next = head.next;
        else
            array.set(bucketIndex, head.next);
 
        return head.value;
    }
 
    
    public V valueOf(K key)
    {
        
        int bucketIndex = getIndex(key);
          int hashCode = hashCode(key);
       
        ADTHash<K, V> head = array.get(bucketIndex);
 
        
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode)
                return head.value;
            head = head.next;
        }
 
        
        return null;
    }
 
    
    public void add(K key, V value)
    {
        
        int bucketIndex = getIndex(key);
          int hashCode = hashCode(key);
        ADTHash<K, V> head = array.get(bucketIndex);
 
        
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }
 
        
        size++;
        head = array.get(bucketIndex);
        ADTHash<K, V> newNode = new ADTHash<K, V>(key, value, hashCode);
        newNode.next = head;
        array.set(bucketIndex, newNode);
 
        
        if ((1.0 * size) / num >= 0.7) {
            ArrayList<ADTHash<K, V> > temp = array;
            array = new ArrayList<>();
            num = 2 * num;
            size = 0;
            for (int i = 0; i < num; i++)
                array.add(null);
 
            for (ADTHash<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
    
}



