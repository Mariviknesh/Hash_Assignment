package org.example;
import java.util.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int size;
        String name;
        Scanner sc=new Scanner(System.in);
        Logger log= Logger.getLogger("com.api.jar");
        log.info("Enter the size");
        size=sc.nextInt();
        HashSet<String> hs=new HashSet<String >();
        TreeSet<String> ts=new TreeSet<String>();
        HashMap<Integer,String>hm=new HashMap<>();
        TreeMap<Integer,String>tm=new TreeMap<>();
        log.info("Enter the Elements");
        for(int j=0;j<size;j++)
        {
            name= sc.next();
            hs.add(name);
            ts.add(name);
            hm.put(j+1,name);
            tm.put(j+1,name);
        }


        Iterator<String> i=hs.iterator();
        Iterator<String> j= ts.iterator();

        log.info("Elements in Hash set is");
        while(i.hasNext())
        {
            log.info(i.next());
        }
        log.info("Elements in Tree set is");

        while(j.hasNext())
        {
            log.info( j.next());
        }
        log.info("Elements in Hashmap");
        for(Map.Entry m : hm.entrySet()){
            log.info(m.getKey()+" "+m.getValue());
        }
        log.info("Elements in Treemap");
        for(Map.Entry m : tm.entrySet()){
            log.info(m.getKey()+" "+m.getValue());
        }
        log.info("Enter the element to get removed");
        String rem=sc.next();
        hs.remove(rem);
        ts.remove(rem);
        i=hs.iterator();
        j= ts.iterator();
        log.info("Elements in Hash set is");
        while(i.hasNext())
        {
            log.info(i.next());
        }
        log.info("Elements in Tree set is");

        while(j.hasNext())
        {
            log.info(j.next());
        }

    }
}