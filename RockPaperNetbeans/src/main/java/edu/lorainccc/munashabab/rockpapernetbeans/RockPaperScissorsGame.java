/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lorainccc.munashabab.rockpapernetbeans;

/**
 *
 * @author munashabab
 */
public class RockPaperScissorsGame {
    private Hand hand1;
    private Hand hand2;
    public RockPaperScissorsGame(Hand argHand1,Hand argHand2){
        this.setHand1(argHand1);
        this.setHand2(argHand2);
    }
    public void setHand1(Hand argHand1){
        hand1=argHand1;
    }
    public void setHand2(Hand argHand2){
        hand2=argHand2;
    }
    public Hand getHand1(){
        return hand1;
    }
    public Hand getHand2(){
        return hand2;
    }
    public String playGame(){
        String status="It's a tie!";
        if(this.getHand1().getChoice().equals("Rock")){
            if(this.getHand2().getChoice().equals("Paper")){
                status="You won!";
            }
            else if(this.getHand2().getChoice().equals("Scissors")){
                status="You lost!";
            } 
        }
        else if(this.getHand1().getChoice().equals("Paper")){
            if(this.getHand2().getChoice().equals("Scissors")){
                status="You won!";
            }
            else if(this.getHand2().getChoice().equals("Rock")){
                status="You lost!";
            }
        }
        else{
            if(this.getHand2().getChoice().equals("Rock")){
                status="You won!";
            }
            else if(this.getHand2().getChoice().equals("Paper")){
                status="You lost!";
            }
        }
              
        return status;
    }
    
}
