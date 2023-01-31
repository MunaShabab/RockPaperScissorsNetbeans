/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lorainccc.munashabab.rockpapernetbeans;

/**
 *
 * @author munashabab
 */
public class UnitTest {
    public static void main(String[] args){
        Hand hand1=new Hand();
        Hand hand2=new Hand();
        Hand hand3=new Hand();
        System.out.println("hand1 choice: "+hand1.getChoice());
        System.out.println("hand2 choice: "+hand2.getChoice());
        System.out.println("hand3 choice: "+hand3.getChoice());
        try{
            hand3.setChoice("Rock");
            System.out.println("hand3 choice after setChoice to Rock : "+hand3.getChoice());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        RockPaperScissorsGame game1=new RockPaperScissorsGame(hand1,hand2);
        System.out.println(game1.playGame());
    }
    
}
