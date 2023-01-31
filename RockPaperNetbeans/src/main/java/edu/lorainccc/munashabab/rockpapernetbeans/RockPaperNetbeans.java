/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.lorainccc.munashabab.rockpapernetbeans;

/**
 *
 * @author munashabab
 */
public class RockPaperNetbeans {

    public static void main(String[] args) {
        Hand hand1=new Hand();
        Hand hand2=new Hand();
        System.out.println(hand1.getChoice());
        System.out.println(hand2.getChoice());
        
        RockPaperScissorsGame game1= new RockPaperScissorsGame(hand1,hand2);
        String results=game1.playGame();
        System.out.println(results);
    }
}
