/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lorainccc.munashabab.rockpapernetbeans;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author munashabab
 */

public class RockPaperScissorsGUI extends JFrame implements ActionListener {
    public JLabel infoLbl= new JLabel("select a choice to start the game:");
    
    String[] optionArray={"Select one ","Rock","Paper","Scissors"};
    JComboBox<String> optionList= new JComboBox<>(optionArray);
    public JButton playBtn= new JButton("Play");
    public JLabel hand1Lbl= new JLabel("");
    public JLabel hand2Lbl=new JLabel("");
    private RockPaperScissorsGame game;
    public JLabel resultsLbl= new JLabel("");
    
    public static void main(String[] args){
        new RockPaperScissorsGUI();
    }
    RockPaperScissorsGUI(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create the mainPanel
	JPanel mainPanel = new JPanel();
        //create a panel for the choices
        JPanel choicePanel= new JPanel();
        playBtn.addActionListener(this);
        choicePanel.add(infoLbl);
        choicePanel.add(optionList);
        choicePanel.add(playBtn);
        mainPanel.add(choicePanel);
        mainPanel.add(resultsLbl);
        //create a Panel for displaying the hands
        JPanel handPanel= new JPanel();
        handPanel.add(hand1Lbl);
        handPanel.add(hand2Lbl);
        mainPanel.add(handPanel);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        this.getContentPane().add(mainPanel);
        this.setSize(400,300);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //declare two String variables to old the image name
        String compHandImg;
        String userHandImg;
        //crerate Hand objects
        //use the randone constructor for the computer
        Hand compHand=new Hand();
        
        //use the user choice for the other Hand
        try{
            
            Hand userHand=new Hand(optionList.getSelectedItem().toString());
            game= new RockPaperScissorsGame(compHand,userHand);
            //set the image names to the appropriate image
            compHandImg=compHand.getChoice()+".jpeg";
            userHandImg=userHand.getChoice()+".jpeg";
            //create two ImageIcons and set the lables 
            ImageIcon compHandIcon=new ImageIcon(getClass().getClassLoader().getResource(compHandImg));
            hand1Lbl.setIcon(compHandIcon);
            ImageIcon userHandIcon=new ImageIcon(getClass().getClassLoader().getResource(userHandImg));
            hand2Lbl.setIcon(userHandIcon);
            resultsLbl.setText(game.playGame());
            
        }
        catch(Exception noChoice){
            resultsLbl.setText(noChoice.toString());
            hand1Lbl.setText("");
            hand2Lbl.setText("");
        }
        
        
        
        
    }

   
    
}

