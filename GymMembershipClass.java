/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.a.c.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author oddette
 */
public class GymMembershipClass extends JFrame{
    
    private JPanel headingPn1;
    private JPanel clientPn1;
    private JPanel namePn1;
    private JPanel surnamePn1;
    private JPanel idNoPn1;
    private JPanel genderPn1;
    private JPanel contractsPn1;
    private JPanel personalTrainerOptionPn1;
    private JPanel membershipPn1;
    private JPanel commentsPn1;
    private JPanel btnsPn1;
    private JPanel headingClientCombinedPn1;
    private JPanel membershipCommentsCombinedPn1;
    private JPanel mainPn1;
    
    private JLabel headingLb1;
    private JLabel nameLb1;
    private JLabel surnameLb1;
    private JLabel idNoLb1;
    private JLabel genderLb1;
    private JLabel personalTrainerLb1;
    private JLabel contractTypeLb1;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idNoTxtFld;
    
    private JComboBox genderComboBox;
    
    private JRadioButton monthToMonthRadBtn;
    private  JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    
    private JCheckBox personalTrainerChBx;
    
    private ButtonGroup btnGrp;
    
    private JTextArea commentsArea;
    
    private JScrollPane scrollableTxtArea; 
    
    private JButton applyBtn;
   
       
    public GymMembershipClass(){
        setTitle(" Gym Membership ");
        setSize(500,550);
        
        
     headingPn1 = new JPanel(new FlowLayout(FlowLayout.CENTER)) ;
     
     clientPn1 = new JPanel(new GridLayout(4,1,1,1));
     clientPn1.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)," Client details"));
    
     namePn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
     surnamePn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
     idNoPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
     genderPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
     
     contractsPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
     personalTrainerOptionPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
     
     membershipPn1 = new JPanel(new GridLayout(2,1,1,1));
     membershipPn1.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract options"));
    
     
     commentsPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
     btnsPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
     headingClientCombinedPn1 = new JPanel(new BorderLayout());
     membershipCommentsCombinedPn1 = new JPanel(new BorderLayout()) ;
     mainPn1 = new JPanel(new BorderLayout());
             
       headingLb1 = new JLabel(" Membership Form")   ;
       headingLb1.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
       headingLb1.setForeground(Color.BLUE)   ;   
       headingLb1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
       
       nameLb1 = new JLabel(" Name:");
       surnameLb1 = new JLabel(" Surname: ");
       idNoLb1 = new JLabel(" id no: ");
       genderLb1 = new JLabel(" Gender: " );
       contractTypeLb1 = new JLabel(" Type of contract: ");
       personalTrainerLb1 = new JLabel(" Select if you need a personal trainer")   ;   
       
       nameTxtFld = new JTextField(10);
       surnameTxtFld = new JTextField(10);
       idNoTxtFld = new JTextField(10);
       
       genderComboBox = new JComboBox();
       genderComboBox.addItem(" Male ");
       genderComboBox.addItem(" Female ");

       monthToMonthRadBtn = new JRadioButton("Month-to-Month");
       sixMonthsRadBtn = new JRadioButton( " Six months ");
       annualRadBtn = new JRadioButton(" Annual ");
    
       personalTrainerChBx = new JCheckBox();
       
       btnGrp = new ButtonGroup();
       btnGrp.add(monthToMonthRadBtn);
       btnGrp.add(sixMonthsRadBtn);
       btnGrp.add(annualRadBtn);
       
       commentsArea = new JTextArea(20,40);
       commentsArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Comments"));
    
       scrollableTxtArea = new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
       applyBtn = new JButton("APPlY");
       
       headingPn1.add(headingLb1);
       
       namePn1.add(nameLb1);
       namePn1.add(nameTxtFld);
       
       surnamePn1.add(surnameLb1);
       surnamePn1.add(surnameTxtFld);

       idNoPn1.add(idNoLb1);
       idNoPn1.add(idNoTxtFld);
    
       genderPn1.add(genderLb1);
       genderPn1.add(genderComboBox);
    
       clientPn1.add(namePn1);
       clientPn1.add(surnamePn1);
       clientPn1.add(idNoPn1);
       clientPn1.add(genderPn1);
       
       headingClientCombinedPn1.add(headingPn1,BorderLayout.NORTH);
       headingClientCombinedPn1.add(clientPn1, BorderLayout.CENTER);
    
       contractsPn1.add(contractTypeLb1);
       contractsPn1.add(monthToMonthRadBtn);
       contractsPn1.add(sixMonthsRadBtn);
       contractsPn1.add(annualRadBtn);
       
       personalTrainerOptionPn1.add(personalTrainerLb1);
       personalTrainerOptionPn1.add(personalTrainerChBx);
       
       membershipPn1.add(contractsPn1);
       membershipCommentsCombinedPn1.add(personalTrainerOptionPn1);
       
       commentsPn1.add(scrollableTxtArea);
       
       membershipCommentsCombinedPn1.add(membershipPn1,BorderLayout.NORTH);
       membershipCommentsCombinedPn1.add(commentsPn1, BorderLayout.CENTER);
   
       btnsPn1.add(applyBtn);
       
       mainPn1.add(headingClientCombinedPn1,BorderLayout.NORTH);
       mainPn1.add(membershipCommentsCombinedPn1, BorderLayout.CENTER);
       mainPn1.add(btnsPn1,BorderLayout.SOUTH);
       
       add(mainPn1);
       
       pack();
        setVisible(true);
    }
}
