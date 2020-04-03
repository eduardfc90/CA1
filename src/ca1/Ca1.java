/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1;

import Patterndao.DAOcountryInterface;
import Patterndao.countryDAOimplementation;

/**
 *
 * @author eduar
 */
public class Ca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        DAOcountryInterface ci= new countryDAOimplementation();
        
        ci.getCountry();
        
        System.out.println(ci.getCountry());
        System.out.println(ci.findCountry("vj8"));
        
     cla
    }
    
}
