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
public class Food {

    public int[] getAmount_of_food() {
        return amount_of_food;
    }

    public int[] getPr_of_food() {
        return pr_of_food;
    }

    public void setAmount_of_food(int[] amount_of_food) {
        this.amount_of_food = amount_of_food;
    }

    public void setPr_of_food(int[] pr_of_food) {
        this.pr_of_food = pr_of_food;
    }

    
   private int[] amount_of_food = new int[9]; // 0 - apple, 1 - banana, 2 - candy, 3 - candy2, 4 - chocolate, 5 - cola, 6 - lop, 7 - sand, 8 - soda
   private int[] pr_of_food = new int[9]; 
   public Food()
    {
        amount_of_food[0]=5; //apple
        pr_of_food[0]=30;
        amount_of_food[1]=2; //banana
        pr_of_food[1]=20;
        amount_of_food[2]=3; //candy
        pr_of_food[2]=15;
        amount_of_food[3]=2; //candy2
        pr_of_food[3]=10;
        amount_of_food[4]=3; //chocolate
        pr_of_food[4]=40;
        amount_of_food[5]=0; //cola
        pr_of_food[5]=50;
        amount_of_food[6]=2; //lop
        pr_of_food[6]=30;
        amount_of_food[7]=2; //sand
        pr_of_food[7]=50;
        amount_of_food[8]=4; //soda
        pr_of_food[8]=55;
    }
   
   //количество какого-то товара
   public int ReAm(int i)
   {
       return amount_of_food[i];
   }
   
   //цена какого-то товара
   public int RePr(int i)
   {
       return pr_of_food[i];
   }
    
   //изменение количества товара
    public void AmCh(int i)
   {
      amount_of_food[i]=amount_of_food[i]-1;
   }
}
