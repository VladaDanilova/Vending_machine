/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import java.util.Random;

/**
 *
 * @author vladadanilova
 */
public class Err {
    
    
    Random r = new Random();
    
    public Err()
    {
        
    }
    
    //ошибка оплаты
    public boolean Error_Pay()
    {
        return r.nextBoolean();
    }
    //ошибка выдачи
    public boolean Error_Food()
    {
        return r.nextBoolean();
    }
    
    
}
