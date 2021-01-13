/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import java.util.ArrayList;

/**
 *
 * @author vladadanilova
 */
public class Card {

    public ArrayList getPass() {
        return pass;
    }

    public void setPass(ArrayList pass) {
        this.pass = pass;
    }

   
   
    public int getCashMoney() {
        return cashMoney;
    }

    public int getCardMoney() {
        return cardMoney;
    }

    public void setCashMoney(int cashMoney) {
        this.cashMoney = cashMoney;
    }

    public void setCardMoney(int cardMoney) {
        this.cardMoney = cardMoney;
    }
    
    private int cashMoney=100;
    private int cardMoney=100;
    private ArrayList pass= new ArrayList();
    
    //создание пароля
    public Card()
    {
        pass.add(1);
        pass.add(1);
        pass.add(1);
        pass.add(1);
        
    }
    
    //получения конкретного числа от пароля
    public Object ReCo(int i)
    {
        return pass.get(i);
    }
    
    //списание денег (наличные)
    public void MCash(int l)
    {
        cashMoney=cashMoney-l;
    }
    
    
}
