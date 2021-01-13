/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.AQUA;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author vladadanilova
 */
public class Blocks {

    public int getKk() {
        return kk;
    }

    public void setKk(int kk) {
        this.kk = kk;
    }

   
    
    private int Pay;
    private boolean HaveToPay;
    private ArrayList code = new ArrayList(); //для ввода пароля
    private int kk=0;
    int k=0;
    int l=0; //для проверки, были ли вернуты деньги
    Button button = new Button("Ок"); //кнопка окей
    Err error = new Err();//экземпляр ошибок
    
    public Blocks(int x, int y, Food F, Card C)
    {
        
        
        // создание фона и графики
        Image BodyImage = new Image(getClass().getResource("Images/body.jpeg").toString());
        ImageView BodyImageView = new ImageView(BodyImage);
        BodyImageView.setX(x);
        BodyImageView.setY(y);
        BodyImageView.setPreserveRatio(true);
        BodyImageView.setFitWidth(700);
        
        Text t = new Text();
        Rectangle rectT = new Rectangle(0, 0, 400, 200);
        Color colT = Color.rgb(125, 125, 125, 0.4);
        t.setFont(new Font(18));
        t.setWrappingWidth(200);
        t.setTextAlignment(TextAlignment.CENTER);
        t.setText("Выберите товар...");
        t.setX(470);
        t.setY(680);
        rectT.setFill(colT);
        rectT.setX(420);
        rectT.setY(647);
        
        Color coll = Color.rgb(0, 125, 125, 0.4);
        
        Rectangle rectSup = new Rectangle(440, 737, 235, 20);
        Text tSup = new Text("Позвонить в поддержку 9210001010");
        tSup.setX(440);
        tSup.setY(750);
        rectSup.setFill(coll);
        
        //клавиатура
        Color col = Color.rgb(0, 125, 125, 0.7);
        Rectangle rect9 = new Rectangle(400, 710, 20, 20);
        Text t9 = new Text("9");
        t9.setX(407);
        t9.setY(720);
        rect9.setFill(col);
        Rectangle rect8 = new Rectangle(380, 710, 20, 20);
        Text t8 = new Text("8");
        t8.setX(387);
        t8.setY(720);
        rect8.setFill(col);
        Rectangle rect7 = new Rectangle(360, 710, 20, 20);
        Text t7 = new Text("7");
        t7.setX(367);
        t7.setY(720);
        rect7.setFill(col);
        Rectangle rect6 = new Rectangle(400, 690, 20, 20);
        Text t6 = new Text("6");
        t6.setX(407);
        t6.setY(700);
        rect6.setFill(col);
        Rectangle rect5 = new Rectangle(380, 690, 20, 20);
        Text t5 = new Text("5");
        t5.setX(387);
        t5.setY(700);
        rect5.setFill(col);
        Rectangle rect4 = new Rectangle(360, 690, 20, 20);
        Text t4 = new Text("4");
        t4.setX(367);
        t4.setY(700);
        rect4.setFill(col);
        Rectangle rect1 = new Rectangle(360, 670, 20, 20);
        Text t1 = new Text("1");
        t1.setX(367);
        t1.setY(680);
        rect1.setFill(col);
        Rectangle rect2 = new Rectangle(380, 670, 20, 20);
        Text t2 = new Text("2");
        t2.setX(387);
        t2.setY(680);
        rect2.setFill(col);
        Rectangle rect3 = new Rectangle(400, 670, 20, 20);
        Text t3 = new Text("3");
        t3.setX(407);
        t3.setY(680);
        rect3.setFill(col);
        button.setLayoutX(380);
        button.setLayoutY(740);
        //Money
         Text tCash = new Text();
         Text tCard = new Text();
        
        Image CardImage = new Image(getClass().getResource("Images/card.png").toString());
        ImageView CardImageView = new ImageView(CardImage);
        CardImageView.setX(0);
        CardImageView.setY(675);
        CardImageView.setFitWidth(140);
        CardImageView.setFitHeight(80);
        tCard.setX(0);
        tCard.setY(765);
        tCard.setText("Balance: "+C.getCardMoney());
        
        Image CashImage = new Image(getClass().getResource("Images/cash.png").toString());
        ImageView CashImageView = new ImageView(CashImage);
        CashImageView.setX(100);
        CashImageView.setY(625);
        CashImageView.setFitWidth(240);
        CashImageView.setFitHeight(180);
        tCash.setX(150);
        tCash.setY(765);
        tCash.setText("Balance: "+C.getCashMoney());
        
        // cola
        Image ColaImage = new Image(getClass().getResource("Images/cola.png").toString());
        ImageView ColaImageView = new ImageView(ColaImage);
        ColaImageView.setX(140);
        ColaImageView.setY(460);
        ColaImageView.setFitWidth(40);
        ColaImageView.setFitHeight(75);
        Text colaT = new Text();
        colaT.setFont(new Font(18));
        colaT.setWrappingWidth(200);
        colaT.setTextAlignment(TextAlignment.JUSTIFY);
        colaT.setText(F.RePr(5)+"Р");
        colaT.setX(140);
        colaT.setY(550);
        colaT.setFill(AQUA);
        
        //apple
        Image AppleImage = new Image(getClass().getResource("Images/apple.png").toString());
        ImageView AppleImageView = new ImageView(AppleImage);
        AppleImageView.setX(240);
        AppleImageView.setY(380);
        AppleImageView.setFitWidth(35);
        AppleImageView.setFitHeight(50);
        Text AppleT = new Text();
        AppleT.setFont(new Font(18));
        AppleT.setWrappingWidth(200);
        AppleT.setTextAlignment(TextAlignment.JUSTIFY);
        AppleT.setText(F.RePr(0)+"Р");
        AppleT.setX(240);
        AppleT.setY(450);
        AppleT.setFill(AQUA);
        
        //candy
        Image CandyImage = new Image(getClass().getResource("Images/candy.png").toString());
        ImageView CandyImageView = new ImageView(CandyImage);
        CandyImageView.setX(320);
        CandyImageView.setY(380);
        CandyImageView.setFitWidth(35);
        CandyImageView.setFitHeight(50);
        Text CandyT = new Text();
        CandyT.setFont(new Font(18));
        CandyT.setWrappingWidth(200);
        CandyT.setTextAlignment(TextAlignment.JUSTIFY);
        CandyT.setText(F.RePr(2)+"Р");
        CandyT.setX(320);
        CandyT.setY(450);
        CandyT.setFill(AQUA);
        
        //banana
        Image BanImage = new Image(getClass().getResource("Images/ban.png").toString());
        ImageView BanImageView = new ImageView(BanImage);
        BanImageView.setX(240);
        BanImageView.setY(280);
        BanImageView.setFitWidth(55);
        BanImageView.setFitHeight(50);
        Text BanT = new Text();
        BanT.setFont(new Font(18));
        BanT.setWrappingWidth(200);
        BanT.setTextAlignment(TextAlignment.JUSTIFY);
        BanT.setText(F.RePr(1)+"Р");
        BanT.setX(240);
        BanT.setY(350);
        BanT.setFill(AQUA);
        
        //choc
        Image ChocImage = new Image(getClass().getResource("Images/choc.png").toString());
        ImageView ChocImageView = new ImageView(ChocImage);
        ChocImageView.setX(300);
        ChocImageView.setY(280);
        ChocImageView.setFitWidth(55);
        ChocImageView.setFitHeight(50);
        Text ChocT = new Text();
        ChocT.setFont(new Font(18));
        ChocT.setWrappingWidth(200);
        ChocT.setTextAlignment(TextAlignment.JUSTIFY);
        ChocT.setText(F.RePr(4)+"Р");
        ChocT.setX(310);
        ChocT.setY(350);
        ChocT.setFill(AQUA);
        
        interactions(ColaImageView,AppleImageView,BanImageView, F, t, C, CardImageView,rect1, rect2, rect3, rect4, rect5, rect6, rect7,
        rect8, rect9, CashImageView, tCash, tCard, code, error, CandyImageView, CandyT, rectSup,tSup,ChocImageView,ChocT);
        
        JavaFXApp.root.getChildren().addAll(BodyImageView,ColaImageView,colaT,AppleImageView,AppleT,BanImageView,BanT,
                CardImageView, CashImageView, tCash, tCard, t, rectT, button, t9, t8, t7, t6, t5, t4, t3, t2, t1, rect1, rect2, rect3, rect4, rect5, rect6, rect7,
        rect8, rect9, CandyImageView, CandyT,rectSup,tSup, ChocImageView,ChocT);
    }
    
    
    private void interactions(ImageView ColaImageView, ImageView AppleImageView,ImageView BanImageView, Food F, Text t,Card ca, ImageView CardImageView, 
            Rectangle rect1,Rectangle rect2,Rectangle rect3, 
            Rectangle rect4,Rectangle rect5,Rectangle rect6,Rectangle rect7,Rectangle rect8,Rectangle rect9, ImageView CashImageView,
            Text tCash,Text tCard, ArrayList code, Err error, ImageView CandyImageView, Text CandyT, Rectangle rectSup, Text tSup,ImageView ChocImageView,Text ChocT)
    {
        
        
         ChocImageView.setOnMousePressed((MouseEvent me4)-> {
          
            if (F.ReAm(4)>0) //если количество товара больше 0
            {
            t.setText("Шоколад "+F.RePr(4)+"P\nВыберите способ оплаты");
            Pay=F.RePr(4);
            HaveToPay=true;
                setKk(4);
            }
            else //иначе товара нет
            {
                t.setText("Товар закончился");
                Pay=0;
                HaveToPay=false;
                ColaImageView.setFitWidth(1);
                ColaImageView.setFitHeight(1);
            }
            
            } );
        
        ColaImageView.setOnMousePressed((MouseEvent me1)-> {
          
            if (F.ReAm(5)>0) //далее аналогично примеру выше
            {
            t.setText("Cola "+F.RePr(5)+"P\nВыберите способ оплаты");
            Pay=F.RePr(5);
            HaveToPay=true;
                setKk(5);
            }
            else
            {
                t.setText("Товар закончился");
                Pay=0;
                HaveToPay=false;
                ColaImageView.setFitWidth(1);
                ColaImageView.setFitHeight(1);
            }
            
            } );
        
         CandyImageView.setOnMousePressed((MouseEvent me8)-> {
          
            if (F.ReAm(2)>0)
            {
            t.setText("Конфета "+F.RePr(2)+"P\nВыберите способ оплаты");
            Pay=F.RePr(2);
            HaveToPay=true;
                setKk(2);
            }
            else
            {
                t.setText("Товар закончился");
                Pay=0;
                HaveToPay=false;
                CandyImageView.setFitWidth(1);
                CandyImageView.setFitHeight(1);
            }
            
            } );
        
        AppleImageView.setOnMousePressed((MouseEvent me2)-> {
          
            if (F.ReAm(0)>0)
            {
            t.setText("Яблоко "+F.RePr(0)+"P\nВыберите способ оплаты");
            Pay=F.RePr(0);
            HaveToPay=true;
                setKk(0);
            }
            else
            {
                t.setText("Товар закончился");
                Pay=0;
                HaveToPay=false;
                AppleImageView.setFitWidth(1);
                AppleImageView.setFitHeight(1);
            }
            
            } );
        
        BanImageView.setOnMousePressed((MouseEvent me3)-> {
          
            if (F.ReAm(1)>0)
            {
            t.setText("Банан "+F.RePr(1)+"P\nВыберите способ оплаты");
            Pay=F.RePr(1);
            HaveToPay=true;
                setKk(1);
            }
            else
            {
                t.setText("Товар закончился");
                Pay=0;
                HaveToPay=false;
                BanImageView.setFitWidth(1);
                BanImageView.setFitHeight(1);
            }
            
            } );
        
        CardImageView.setOnMousePressed((MouseEvent me211)-> { //если нажали на карту для платежа
            
            if (HaveToPay) //проверка, что был выбран товар
            {
               t.setText("Введите пин-код...");
               
               //ввод пароля
                            rect1.setOnMousePressed((MouseEvent me11)-> 
                            {
                                code.add(1);
                                System.out.println("1");
                                
                            } );
                            
                            rect2.setOnMousePressed((MouseEvent me12)-> 
                            {
                                code.add(2);
                                System.out.println("2");
                        
                            } );
                            rect3.setOnMousePressed((MouseEvent me13)-> 
                            {
                                code.add(3);
                                System.out.println("3");
                        
                            } );
                            rect4.setOnMousePressed((MouseEvent me14)-> 
                            {
                                code.add(4);
                                System.out.println("4");
                        
                            } );
                            rect5.setOnMousePressed((MouseEvent me15)-> 
                            {
                                code.add(5);
                                System.out.println("5");
                        
                            } );
                            rect6.setOnMousePressed((MouseEvent me16)-> 
                            {
                                code.add(6);
                                System.out.println("6");
                        
                            } );
                            rect7.setOnMousePressed((MouseEvent me17)-> 
                            {
                                code.add(7);
                                System.out.println("7");
                        
                            } );
                            rect8.setOnMousePressed((MouseEvent me18)-> 
                            {
                                code.add(8);
                                System.out.println("8");
                        
                            } );
                            rect9.setOnMousePressed((MouseEvent me19)-> 
                            {
                                code.add(9);
                                System.out.println("9");
                        
                            } );
                            
                            button.setOnMousePressed((MouseEvent me10)->  //нажата кнопка ОК, что значит, что пароль введен
                            {
                                // проверка соответсвтвия пароля
                                for (int ii=0;ii<code.size();ii++ )
                                    {
                                        try //обработка исключения IndexOutOfBoundsException
                                        {
                                        if (ca.getPass().get(ii)==code.get(ii))
                                            {
                                          k++;
                                            }
                                        else
                                        k--; 
                                        }
                                        catch (IndexOutOfBoundsException e)
                                        {
                                            for (int i=0; i<code.size();i++)
                                                    {
                                                  code.remove(i);
                                                  k=0;
                                                    }
                                        }
                                    }
                                
                                        if (k==4)
                                      {
                                          if (ca.getCardMoney()>=Pay)
                                          {
                                              if (error.Error_Pay())
                                              {
                                                  t.setText("Ошибка с оплатой.\nПопробуйте позже.");
                                                  for (int i=0; i<code.size();i++)
                                                    {
                                                  code.remove(i);
                                                  k=0;
                                                    }
                                              }
                                              else
                                              {
                                              ca.setCardMoney(ca.getCardMoney()-Pay); //снятие денег с карты
                                              tCard.setText("Balance: "+ca.getCardMoney());
                                              t.setText("Покупка прошла успешно");
                                              for (int i=0; i<code.size();i++)
                                              {
                                                  code.remove(i);
                                                  k=0;
                                              }
                                              }

                                          }
                                          else 
                                          {
                                              t.setText("Недостаточно средств");
                                              for (int i=0; i<code.size();i++)
                                              {
                                                  code.remove(i);
                                                  k=0;
                                              }

                                          }
                                      }
                                      else
                                      {
                                          t.setText("Неверный пароль");
                                          for (int i=0; i<code.size();i++)
                                              {
                                                  code.remove(i);
                                                  k=0;
                                              }
                                      }

                            } );
                    
            }
            
            } );
        
        CashImageView.setOnMousePressed((MouseEvent me333)-> {
          
            if(HaveToPay)
            {
            if (ca.getCashMoney()>=Pay)
                      {
                          if (error.Error_Food())
                          {
                        t.setText("Товар застрял :(");
                        ca.MCash(Pay); //снятие денег (наличка)
                        l=0;
                        tSup.setOnMouseClicked ((MouseEvent me99)-> 
                            {
                                if (error.Error_Food()&l==0)
                                {
                                    t.setText("Вам вернули деньги");
                                    ca.MCash(-Pay);
                                    tCash.setText("Balance: "+ca.getCashMoney());
                                    l++;
                                    
                                }
                                else if (l==0)
                                    t.setText("Телефон недоступен");
                                else
                                    t.setText("Вы уже вернули деньги за данный товар.");
                        
                            } );
                        
                        {
                              
                        }
                        tCash.setText("Balance: "+ca.getCashMoney());
                          }
                          else
                          {
                              t.setText("Покупка прошла успешно.");
                            ca.MCash(Pay);
                            F.AmCh(getKk());
                            tCash.setText("Balance: "+ca.getCashMoney());
                          }
                        }
                        else 
                         {
                         t.setText("Недостаточно средств");
                         }
                       HaveToPay=false; 
            }
            
            } );
        
        
    }
    
}
