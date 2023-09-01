package edu.eci.cvds.tdd.registry;
import java.util.*;
public class Registry {
    private ArrayList<Integer> identidades;
    
    public RegisterResult registerVoter(Person p) {
        identidades = new ArrayList<Integer>();
        // TODO Validate person and return real result.
        // caso valido

        if ( p.getAge() >= 18 && checkId(p.getId()) && p.isAlive() == true){
            identidades.add(p.getId());
            return RegisterResult.VALID;
        }
        if(p.getAge()> 140 || p.getAge()< 0){
            return RegisterResult.INVALID_AGE;
        }
        if(p.getAge()> 0 && p.getAge()< 18){
            return RegisterResult.UNDERAGE;
        }
        if(checkId(p.getId())){
            return RegisterResult.DUPLICATED;
        }
        if(p.isAlive() == false){
            return RegisterResult.DEAD;
        }
        return RegisterResult.DUPLICATED;
    }
    private boolean checkId(int a){
        boolean res = true;
        for(int xd: identidades){
            if(xd == a){
                res = false;
            }
        }
        return res;
    }

}
