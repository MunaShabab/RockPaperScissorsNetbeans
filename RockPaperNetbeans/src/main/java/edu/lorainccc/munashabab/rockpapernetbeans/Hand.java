/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lorainccc.munashabab.rockpapernetbeans;

/**
 *
 * @author munashabab
 */
public class Hand {
    String[] choice={"Rock","Paper","Scissors"};
    private String handChoice;
    
    public Hand(){
        this.GetRandomHand();
    }
    public Hand(String argChoice)throws Exception{
        this.setChoice(argChoice);
    }
    
    public void setChoice(String argChoice)throws Exception{
        if(argChoice.equals("Rock")||argChoice.equals("Paper")||argChoice.equals("Scissors")){
            handChoice=argChoice;
        }
        else{
            throw new Exception("invalid choice");
        }
         
    }
    public String getChoice(){
    return handChoice;
    }
    
    public void GetRandomHand(){
        handChoice=choice[(int) (Math.random() * 3)];
    }
    
}
