 package tictac;

import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 /** @author NRK Karthick 
 * Bsc Computer 
 */
public class JfTiic extends javax.swing.JFrame {
 
    public JfTiic() {
         
        initComponents();
        this.setSize(1200,600);
        setLocationRelativeTo(null);
       /** try {
            this.setIconImage(ImageIO.read(new File(".//NRKLogo.png")));
        } catch (IOException ex) {
            Logger.getLogger(JfTiic.class.getName()).log(Level.SEVERE, null, ex);
        }*/ 
    }
    String label="O";
    int Player_X_Score = 0;
    int Player_O_Score = 0;
    boolean entry=false;
     boolean entry1=false;   
    int i=0 ;
    // The Reset method used to Restart the Game whennever the button is clicked Or game over
    public void Reset(){
        i=0;
        coin1.setText("");
        coin2.setText("");
        coin3.setText("");
        coin4.setText("");
        coin5.setText("");
        coin6.setText("");
        coin7.setText("");
        coin8.setText("");
        coin9.setText("");
        setStart();
        
    }
    //This SetStart method used for Start the game
    public void setStart(){
        coin1.setEnabled(true);
        coin2.setEnabled(true);
        coin3.setEnabled(true);
        coin4.setEnabled(true);
        coin5.setEnabled(true);
        coin6.setEnabled(true);
        coin7.setEnabled(true);
        coin8.setEnabled(true);
        coin9.setEnabled(true);
    }
    //This method used to block the Unwanted Moves
      public void setDisable(){
        coin1.setEnabled(false);
        coin2.setEnabled(false);
        coin3.setEnabled(false);
        coin4.setEnabled(false);
        coin5.setEnabled(false);
        coin6.setEnabled(false);
        coin7.setEnabled(false);
        coin8.setEnabled(false);
        coin9.setEnabled(false);
    }
    public void showWinX(){//this method used for show the information whos(X) win the game
       JFrame s = new JFrame();
       JOptionPane.showMessageDialog(s, "you win X");
       BtnX.setText(String.valueOf(Player_X_Score+=1));
       Player_X_Score+=1;
       Reset();
        
    }
    //This method used for show the information whos(O) win the game
    public void showWinY(){
       JFrame s = new JFrame();
       JOptionPane.showMessageDialog(s, "you win O");
       BtnO.setText(String.valueOf(Player_O_Score+=1));
       Reset();
     
    }
    //This method show the current player name
    public void choosePlayer(){
        i=i+1; 
        if(label.equalsIgnoreCase("X")){
                label="O";
                who.setText("Player x Trun");
             }
             else{
                  label="X";
                  who.setText("Player 0 Trun");
                } 
    }
  
    
    //Find The Moves after the coins placed && game starts
    String l="O";
     public void choosePlayerNext(){
       
         if(l.equalsIgnoreCase("X")){
                l="O";
                who.setText("Player X Trun");
             }
             else{
                  l="X";
                  who.setText("Player O Trun");
         
         } 
    }
    public void checkWin()
     { 
    	   
// CHECKING "X" WINNING CONDITION:
         if((coin1.getText()=="X") && (coin2.getText()=="X") && (coin3.getText()=="X"))
         { 
    	     showWinX();
         }
         if((coin4.getText()=="X") && (coin5.getText()=="X") && (coin6.getText()=="X"))
         {
             showWinX();
         }
         if((coin7.getText()=="X") && (coin8.getText()=="X") && (coin9.getText()=="X"))
         {
             showWinX();
         }
         if((coin1.getText()=="X") && (coin4.getText()=="X") && (coin7.getText()=="X"))
         {
             showWinX();
         }
         if((coin2.getText()=="X") && (coin5.getText()=="X") && (coin8.getText()=="X"))
         {
             showWinX();
         }
        if((coin3.getText()=="X") && (coin6.getText()=="X") && (coin9.getText()=="X")) 
         { 
    	     showWinX();
         }
        if((coin1.getText()=="X") && (coin5.getText()=="X") && (coin9.getText()=="X")) 
         { 
    	     showWinX();
         }
        if((coin3.getText()=="X") && (coin5.getText()=="X") && (coin7.getText()=="X"))
        { 
    	     showWinX();
        }

// CHECKING "O" WINNING CONDITION:

         if( (coin1.getText()=="O") && (coin2.getText()=="O") && (coin3.getText()=="O"))
         { 
    	     showWinY();
         }
         if((coin4.getText()=="O") && (coin5.getText()=="O") && (coin6.getText()=="O"))
         {
             showWinY();
         }
         if((coin7.getText()=="O") && (coin8.getText()=="O") && (coin9.getText()=="O"))
         {
             showWinY();
         }
         if((coin1.getText()=="O") && (coin4.getText()=="O") && (coin7.getText()=="O"))
         {
             showWinY();
         }
         if((coin2.getText()=="O") && (coin5.getText()=="O") && (coin8.getText()=="O"))
         {
             showWinY();
         }
        if((coin3.getText()=="O") && (coin6.getText()=="O") && (coin9.getText()=="O")) 
         { 
    	     showWinY();
         }
         if((coin1.getText()=="O") && (coin5.getText()=="O") && (coin9.getText()=="O")) 
         { 
    	     showWinY();
         }
        if((coin3.getText()=="O") && (coin5.getText()=="O") && (coin7.getText()=="O"))
         { 
    	     showWinY();
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        coin1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        coin2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        coin3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        StartGame = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        coin4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        coin5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        coin6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        BtnX = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        BtnO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        coin7 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        coin8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        coin9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        Reset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        who = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyFistProject");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TicTocToe");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        coin1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin1.setForeground(new java.awt.Color(255, 255, 255));
        coin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin1ActionPerformed(evt);
            }
        });
        jPanel3.add(coin1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        coin2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin2.setForeground(new java.awt.Color(255, 255, 255));
        coin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin2ActionPerformed(evt);
            }
        });
        jPanel4.add(coin2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        coin3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin3.setForeground(new java.awt.Color(255, 255, 255));
        coin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin3ActionPerformed(evt);
            }
        });
        jPanel5.add(coin3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        StartGame.setBackground(new java.awt.Color(0, 255, 0));
        StartGame.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        StartGame.setForeground(new java.awt.Color(255, 255, 255));
        StartGame.setText(" Start Game");
        StartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameActionPerformed(evt);
            }
        });
        jPanel6.add(StartGame, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        Home.setBackground(new java.awt.Color(0, 0, 0));
        Home.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel15.add(Home, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        coin4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin4.setForeground(new java.awt.Color(255, 255, 255));
        coin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin4ActionPerformed(evt);
            }
        });
        jPanel12.add(coin4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        coin5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin5.setForeground(new java.awt.Color(255, 255, 255));
        coin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin5ActionPerformed(evt);
            }
        });
        jPanel7.add(coin5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        coin6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin6.setForeground(new java.awt.Color(255, 255, 255));
        coin6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin6ActionPerformed(evt);
            }
        });
        jPanel8.add(coin6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        BtnX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtnX.setForeground(new java.awt.Color(102, 102, 102));
        BtnX.setText("0");
        jPanel10.add(BtnX, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Player X");
        jPanel10.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel10);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        BtnO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtnO.setForeground(new java.awt.Color(102, 102, 102));
        BtnO.setText("0");
        jPanel16.add(BtnO, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 208, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Player O");
        jPanel16.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel16);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        coin7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin7.setForeground(new java.awt.Color(255, 255, 255));
        coin7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin7ActionPerformed(evt);
            }
        });
        jPanel9.add(coin7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        coin8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin8.setForeground(new java.awt.Color(255, 255, 255));
        coin8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin8ActionPerformed(evt);
            }
        });
        jPanel11.add(coin8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        coin9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        coin9.setForeground(new java.awt.Color(255, 255, 255));
        coin9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coin9ActionPerformed(evt);
            }
        });
        jPanel13.add(coin9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        Reset.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Reset.setForeground(new java.awt.Color(0, 153, 51));
        Reset.setText(" Restart");
        Reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel14.add(Reset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        Exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 0, 0));
        Exit.setText(" Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel17.add(Exit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        who.setBackground(new java.awt.Color(255, 0, 0));
        who.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        who.setForeground(new java.awt.Color(0, 0, 255));
        who.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        who.setText("Player X Trun");
        jPanel1.add(who, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 String s="";
  public void invalidMove(){
     String a[]={coin1.getText(),coin2.getText(),coin3.getText(),coin4.getText(),coin5.getText(),
         coin6.getText(),coin7.getText(),coin8.getText(),coin9.getText()};
           
           for(int i=0;i<=7;i+=3){
              if( (a[i]=="X"&&a[i+1]=="X"&&a[i+2]=="X") || (a[2]=="X"&&a[4]=="X"&&a[6]=="X") || (a[0]=="X"&&a[4]=="X"&&a[8]=="X") ){
                 JFrame s = new JFrame();
                 JOptionPane.showMessageDialog(s, "invalid Move - ReSet The Game");
                 Reset();
                 break;
              }
               if(( a[i]=="O"&&a[i+1]=="O"&&a[i+2]=="O") || (a[2]=="O"&&a[4]=="O"&&a[6]=="O") || (a[0]=="O"&&a[4]=="O"&&a[8]=="O") ){
                 JFrame s = new JFrame();
                 JOptionPane.showMessageDialog(s,"invalid Move - ReSet The Game");
                 Reset();
                 break;
              }
            }
           
           for(int i=0;i<3;i+=1){
              if( (a[i]=="X"&&a[i+3]=="X"&&a[i+6]=="X") ){
                 JFrame s = new JFrame();
                 JOptionPane.showMessageDialog(s, "invalid Move - ReSet The Game");
                 Reset();
                 break;
                }
              if( (a[i]=="O"&&a[i+3]=="O"&&a[i+6]=="O") ){
                 JFrame s = new JFrame();
                 JOptionPane.showMessageDialog(s, "invalid Move - ReSet The Game");
                 Reset();
                 break;
                }
           }
 }
    private void coin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin1ActionPerformed
            if(i<6){
              choosePlayer();
              coin1.setText(label);
              coin1.setEnabled(false);
               invalidMove();
           }else{
                //this statment to get the value of button(coped to s)
                if( ((coin1.getText().equalsIgnoreCase("X")||coin1.getText().equalsIgnoreCase("o"))&&(s=="")) && ((coin2.getText().equals("")) || (coin4.getText().equals("")))  ){
                   s=coin1.getText();
                   coin1.setText("");
                    setDisable();
                    if(coin2.getText().equals("")){  //check the button have moves or Not
                         coin2.setEnabled(true);
                        }  
                    if(coin4.getText().equals("")){  //check the button have moves or Not
                         coin4.setEnabled(true);  
                     }  
                }else if(coin1.getText().equals("")){
                   //this block is ture when the button holds empty value && put the value on the button 
                   coin1.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin1.getText().equalsIgnoreCase("X")){
                       coin1.setForeground(Color.orange);
                   }else{
                       coin1.setForeground(Color.red);
                   }
 
          checkWin();
    }//GEN-LAST:event_coin1ActionPerformed

    private void coin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin2ActionPerformed
            if(i<6){
              choosePlayer();
              coin2.setText(label);
              coin2.setEnabled(false);
              invalidMove();
           }else{
                if( ((coin2.getText().equalsIgnoreCase("X")||coin2.getText().equalsIgnoreCase("o"))&&(s=="")) && ((coin1.getText().equals("")) || (coin3.getText().equals("")) || (coin5.getText().equals(""))) ){
                   s=coin2.getText();
                   coin2.setText("");
                   setDisable();
                    if(coin1.getText().equals("")){  
                        coin1.setEnabled(true);
                    }  
                     if(coin3.getText().equals("")){  
                          coin3.setEnabled(true);
                     }  
                     if(coin5.getText().equals("")){  
                         coin5.setEnabled(true);
                    } 
                }else if(coin2.getText().equals("")){
                   coin2.setText(s);
                   s="";setStart();
                  if(entry){choosePlayerNext();}
                
                }
           }
           if(coin2.getText().equalsIgnoreCase("X")){
                       coin2.setForeground(Color.orange);
                   }else{
                       coin2.setForeground(Color.red);
                   }
          checkWin();
    }//GEN-LAST:event_coin2ActionPerformed

    private void coin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin3ActionPerformed
             if(i<6){
              choosePlayer();
              coin3.setText(label);
              coin3.setEnabled(false);
              invalidMove();
           }else{
                if( ((coin3.getText().equalsIgnoreCase("X")||coin3.getText().equalsIgnoreCase("o"))&&(s=="")) && ((coin2.getText().equals("")) || (coin6.getText().equals(""))) ){
                   s=coin3.getText();
                   coin3.setText("");
                   setDisable();
                    if(coin2.getText().equals("")){  
                        coin2.setEnabled(true);
                    }  
                     if(coin6.getText().equals("")){  
                         coin6.setEnabled(true);
                     }  
                }else if(coin3.getText().equals("")){
                   coin3.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin3.getText().equalsIgnoreCase("X")){
                       coin3.setForeground(Color.orange);
                   }else{
                       coin3.setForeground(Color.red);
                   }
          checkWin();
    }//GEN-LAST:event_coin3ActionPerformed

    private void coin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin4ActionPerformed
             if(i<6){
              choosePlayer();
              coin4.setText(label);
              coin4.setEnabled(false);
              invalidMove();
           }else{
                if( ((coin4.getText().equalsIgnoreCase("X")||coin4.getText().equalsIgnoreCase("o"))&&(s=="")) && ((coin1.getText().equals("")) || (coin7.getText().equals("")) || (coin5.getText().equals(""))) ){
                   s=coin4.getText();
                   coin4.setText("");
                   setDisable();
                   if(coin1.getText().equals("")){  
                       coin1.setEnabled(true);
                     }  
                   if(coin7.getText().equals("")){  
                        coin7.setEnabled(true);
                    }  
                    if(coin5.getText().equals("")){  
                         coin5.setEnabled(true);
                     }  
                }else if(coin4.getText().equals("")){                  
                   coin4.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin4.getText().equalsIgnoreCase("X")){
                       coin4.setForeground(Color.orange);
                   }else{
                       coin4.setForeground(Color.red);
                   }
         checkWin();
    }//GEN-LAST:event_coin4ActionPerformed

    private void coin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin5ActionPerformed
             if(i<6){
              choosePlayer();
              coin5.setText(label);
              coin5.setEnabled(false);
              invalidMove();
           }else{
                if( ( (coin5.getText().equalsIgnoreCase("X")||coin5.getText().equalsIgnoreCase("o"))&&(s=="") ) && ( (coin2.getText().equals("")) || (coin6.getText().equals("")) || (coin4.getText().equals("")) || (coin8.getText().equals("")) ) ){
                   s=coin5.getText();
                   coin5.setText("");
                   setDisable();
                    if(coin2.getText().equals("")){ 
                        coin2.setEnabled(true);
                      }  
                     if(coin6.getText().equals("")){  
                         coin6.setEnabled(true);
                     }  
                      if(coin4.getText().equals("")){  
                          coin4.setEnabled(true);
                     }  
                     if(coin8.getText().equals("")){  
                            coin8.setEnabled(true);
        }  
                }else if(coin5.getText().equals("")){         
                   coin5.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin5.getText().equalsIgnoreCase("X")){
                       coin5.setForeground(Color.orange);
                   }else{
                       coin5.setForeground(Color.red);
                   }
          checkWin();
    }//GEN-LAST:event_coin5ActionPerformed

    private void coin6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin6ActionPerformed
             if(i<6){
              choosePlayer();
              coin6.setText(label);
              coin6.setEnabled(false);
              invalidMove();
           }else{
                if( ( (coin6.getText().equalsIgnoreCase("X")||coin6.getText().equalsIgnoreCase("o"))&&(s=="") ) && ((coin9.getText().equals("")) || (coin3.getText().equals("")) || (coin5.getText().equals("")) ) ){
                   s=coin6.getText();
                   coin6.setText("");
                   setDisable();
                   if(coin9.getText().equals("")){ 
                       coin9.setEnabled(true);
                    }  
                    if(coin3.getText().equals("")){  
                        coin3.setEnabled(true);
                     }  
                    if(coin5.getText().equals("")){  
                        coin5.setEnabled(true);
                    }  
                }else if(coin6.getText().equals("")){
                   coin6.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin6.getText().equalsIgnoreCase("X")){
                       coin6.setForeground(Color.orange);
                   }else{
                       coin6.setForeground(Color.red);
                   }
          checkWin();
    }//GEN-LAST:event_coin6ActionPerformed

    private void coin7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin7ActionPerformed
          if(i<6){
              choosePlayer();
              coin7.setText(label);
              coin7.setEnabled(false);
              invalidMove();
           }else{
                if( ((coin7.getText().equalsIgnoreCase("X")||coin7.getText().equalsIgnoreCase("o"))&&(s=="")) && ((coin4.getText().equals("")) || (coin8.getText().equals("") )) ){
                   s=coin7.getText();
                   coin7.setText("");
                   setDisable();
                    if(coin4.getText().equals("")){  
                        coin4.setEnabled(true);
                     }  
                    if(coin8.getText().equals("")){  
                        coin8.setEnabled(true);
                     }  
                }else if(coin7.getText().equals("")){                 
                   coin7.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin7.getText().equalsIgnoreCase("X")){
                       coin7.setForeground(Color.orange);
                   }else{
                       coin7.setForeground(Color.red);
                   }
          checkWin();
    }//GEN-LAST:event_coin7ActionPerformed

    private void coin8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin8ActionPerformed
         if(i<6){
              choosePlayer();
              coin8.setText(label);
              coin8.setEnabled(false);
              invalidMove();
           }else{
                if( ((coin8.getText().equalsIgnoreCase("X")||coin8.getText().equalsIgnoreCase("o"))&&(s=="")) && ((coin9.getText().equals("")) || (coin7.getText().equals("")) || (coin5.getText().equals(""))) ){
                   s=coin8.getText();
                   coin8.setText("");
                   setDisable();
                    if(coin9.getText().equals("")){  
                        coin9.setEnabled(true);
                    }  
                   if(coin7.getText().equals("")){  
                       coin7.setEnabled(true);
                    }  
                    if(coin5.getText().equals("")){  
                        coin5.setEnabled(true);
                    }  
                }else if(coin8.getText().equals("")){                    
                   coin8.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin8.getText().equalsIgnoreCase("X")){
                       coin8.setForeground(Color.orange);
                   }else{
                       coin8.setForeground(Color.red);
                   }
          checkWin();
    }//GEN-LAST:event_coin8ActionPerformed

    private void coin9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coin9ActionPerformed
                if(i<6){
              choosePlayer();
              coin9.setText(label);
              coin9.setEnabled(false);
              invalidMove();
           }else{
                if( ((coin9.getText().equalsIgnoreCase("X")||coin9.getText().equalsIgnoreCase("o"))&&(s=="")) && ((coin6.getText().equals("")) || (coin8.getText().equals(""))) ){
                   s=coin9.getText();
                   coin9.setText("");
                   setDisable();
                   if(coin6.getText().equals("")){  
                       coin6.setEnabled(true);
                    }  
                    if(coin8.getText().equals("")){  
                        coin8.setEnabled(true);
                     }  
                }else if(coin9.getText().equals("")){                  
                   coin9.setText(s);
                   s="";
                   setStart();
                   if(entry){choosePlayerNext();}
               }
           }
           if(coin9.getText().equalsIgnoreCase("X")){
                       coin9.setForeground(Color.orange);
                   }else{
                       coin9.setForeground(Color.red);
                   }
          checkWin();
    }//GEN-LAST:event_coin9ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Reset();
        who.setText("Player X Trun ");
        label="O";
    }//GEN-LAST:event_ResetActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
         System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void StartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameActionPerformed
        if(i>=6)
        setStart();
        entry=true;
    }//GEN-LAST:event_StartGameActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfTiic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfTiic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfTiic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfTiic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfTiic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnO;
    private javax.swing.JButton BtnX;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Home;
    private javax.swing.JButton Reset;
    private javax.swing.JButton StartGame;
    private javax.swing.JButton coin1;
    private javax.swing.JButton coin2;
    private javax.swing.JButton coin3;
    private javax.swing.JButton coin4;
    private javax.swing.JButton coin5;
    private javax.swing.JButton coin6;
    private javax.swing.JButton coin7;
    private javax.swing.JButton coin8;
    private javax.swing.JButton coin9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel who;
    // End of variables declaration//GEN-END:variables
}
