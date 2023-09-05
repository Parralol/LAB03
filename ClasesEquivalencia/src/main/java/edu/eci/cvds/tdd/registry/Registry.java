package edu.eci.cvds.tdd.registry;
import java.util.*;
public class Registry {
    private ArrayList<Integer> identidades= new ArrayList<Integer>();;
    
    public RegisterResult registerVoter(Person p){
        
        // TODO Validate person and return real result.
        // caso valido

        if(p.getName() == null){
            return RegisterResult.NULL_PERSON;
        }
        if(p.getAge()> 140 || p.getAge()< 0){
            return RegisterResult.INVALID_AGE;
        }
        if(p.getAge()> 0 && p.getAge()< 18){
            return RegisterResult.UNDERAGE;
        }
        if(p.isAlive() == false){
            return RegisterResult.DEAD;
        }
        if(!checkId(p.getId())){
            return RegisterResult.DUPLICATED;
        }
        if(p.getAge() >= 18 && checkId(p.getId()) && p.isAlive() == true){
            identidades.add(p.getId());
            return RegisterResult.VALID;
        }
        return RegisterResult.DUPLICATED;
    }
    private boolean checkId(int a){
        Integer b = Integer.valueOf(a);
        boolean res = true;
        for(Integer xd: identidades){
            if(xd.equals(b)){
                res = false;
            }
        }
        return res;
    }

}
