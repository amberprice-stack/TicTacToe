
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amberprice
 */
public class TicTacToe_ extends javax.swing.JFrame {
   
    private String whoseTurn="X";
    private String playerOne="player one";
    private String playerTwo="player two";
    private int playerOneScore=0;
    private int playerTwoScore=0;
    
  
    public TicTacToe_() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
        getPlayerNames();
    
    }
    private void getPlayerNames(){
        playerOne=JOptionPane.showInputDialog(this,"Enter player one name :","Player Name",JOptionPane.INFORMATION_MESSAGE);
        playerTwo=JOptionPane.showInputDialog(this,"Enter player two name :","Player Name",JOptionPane.INFORMATION_MESSAGE);
        
        if(playerOne.equals("")){
            playerOne="Player One";
        }
        if(playerTwo.equals("")){
            playerTwo="Player Two";
        }
        
    }
    private void detDraw(){
        String one=jButton1.getText();
        String two=jButton2.getText();
        String three=jButton3.getText();
        String four=jButton4.getText();
        String five=jButton5.getText();
        String six=jButton6.getText();
        String seven=jButton7.getText();
        String eight=jButton8.getText();
        String nine=jButton9.getText();
       
        if(one != "" && two !="" && three !="" && four !="" && five !="" && six !="" && seven !="" && eight !="" && nine !="" ){
            JOptionPane.showMessageDialog(this,"The match has been drawn !!!","Match result",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
        
    }
 private void determineWhoseTurn(){
        if(whoseTurn.equalsIgnoreCase("X")){
            whoseTurn="O";
        }else{
            whoseTurn="X";
        }
        
    }
 private void xWins(){
        JOptionPane.showMessageDialog(this, playerOne.toUpperCase()+" WINS","Winner",JOptionPane.INFORMATION_MESSAGE);
        playerOneScore++;
        resetGame();
    }
 private void oWins(){
        JOptionPane.showMessageDialog(this,playerTwo.toUpperCase()+" WINS","Winner",JOptionPane.INFORMATION_MESSAGE);
        playerTwoScore++;
        resetGame();
    }
     private void determineIfWin(){
        
        String one=jButton1.getText();
        String two=jButton2.getText();
        String three=jButton3.getText();
        String four=jButton4.getText();
        String five=jButton5.getText();
        String six=jButton6.getText();
        String seven=jButton7.getText();
        String eight=jButton8.getText();
        String nine=jButton9.getText();
        
        
        if(one=="X" && two=="X" && three=="X"  ){
            xWins();
        }
        if(four=="X" && five=="X" && six=="X"  ){
            xWins();
        }
        if(seven=="X" && eight=="X" && nine=="X"  ){
            xWins();
        }
        if(one=="X" && two=="X" && three=="X"  ){
            xWins();
        }
        if(one=="X" && four=="X" && seven=="X"  ){
            xWins();
        }
        if(two=="X" && five=="X" && eight=="X"  ){
            xWins();
        }
        if(three=="X" && six=="X" && nine=="X"  ){
            xWins();
        }
        if(one=="X" && five=="X" && nine=="X"  ){
            xWins();
        }
        if(seven=="X" && five=="X" && three=="X"  ){
            xWins();
        }
        
        // if o wins 
        if(one=="O" && two=="O" && three=="O"  ){
            oWins();
        }
        if(four=="o" && five=="O" && six=="O"  ){
             oWins();
        }
        if(seven=="O" && eight=="O" && nine=="O"  ){
             oWins();
        }
        if(one=="O" && two=="O" && three=="O"  ){
            oWins(); 
        }
        if(one=="O" && four=="O" && seven=="O"  ){
            oWins();
        }
        if(two=="O" && five=="O" && eight=="O"  ){
             oWins();
        }
        if(three=="O" && six=="O" && nine=="O"  ){
             oWins();
        }
        if(one=="O" && five=="O" && nine=="O"  ){
             oWins();
        }
        if(seven=="O" && five=="O" && three=="O"  ){
             oWins();
        }
        
        
    }
      private void resetGame(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        scorelbl.setText(playerOne.toUpperCase()+"'s score : "+playerOneScore);
        scorelb2.setText(playerTwo.toUpperCase()+"'s score : "+playerTwoScore);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        scorelbl = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        score1b2 = new javax.swing.JPanel();
        scorelb2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        JBLExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 4, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        scorelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(scorelbl, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        score1b2.setBackground(new java.awt.Color(255, 255, 255));
        score1b2.setLayout(new java.awt.BorderLayout());

        scorelb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        score1b2.add(scorelb2, java.awt.BorderLayout.CENTER);

        jPanel2.add(score1b2);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        JBLExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        JBLExit.setText("Exit");
        JBLExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLExitActionPerformed(evt);
            }
        });
        jPanel17.add(JBLExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void JBLExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLExitActionPerformed
    frame = new JFrame("Exit");
    if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe",
            JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION);
    {
        System.exit(0);
    }
    }//GEN-LAST:event_JBLExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.red);
        }
        else{
            jButton1.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.red);
        }
        else{
            jButton2.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.red);
        }
        else{
            jButton3.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.red);
        }
        else{
            jButton4.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.red);
        }
        else{
            jButton6.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.red);
        }
        else{
            jButton8.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.red);
        }
        else{
            jButton5.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.red);
        }
        else{
            jButton7.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.red);
        }
        else{
            jButton9.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel score1b2;
    private javax.swing.JLabel scorelb2;
    private javax.swing.JLabel scorelbl;
    // End of variables declaration//GEN-END:variables
}
