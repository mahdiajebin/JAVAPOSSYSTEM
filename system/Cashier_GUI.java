/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier.system;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import cashier.system.Login_GUI;
public class Cashier_GUI extends javax.swing.JFrame {
    public ArrayList <Item> list = new ArrayList <Item>();
    static ArrayList <String> ItemList = new ArrayList <String>();
    
    static Double subtotal = 0.0;

    public Cashier_GUI() {
        initComponents();
        showDate();
        
        Item T1 = new Item("t-shirt", 10, "blue", "S","T1");
        list.add(T1);
        Item T2 = new Item("shirt", 10, "color", "L","T2");
        list.add(T2);
        Item T3 = new Item("tee", 4.99, "white", "M","T3");
        list.add(T3);
        
        Item B1 = new Item("pants", 40.99, "white", "32","B1");
        list.add(B1);
        Item B2 = new Item("pants", 40.99, "black", "34","B2");
        list.add(B2);
        Item B3 = new Item("pants", 40.99, "navyblue", "36","B3");
        list.add(B3);
    }

    
   void showDate(){
           SimpleDateFormat date =new SimpleDateFormat("MM/dd/yyyy");
           Date day =new Date();
           Dates.setText(date.format(day));
       }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        
        dt = new javax.swing.JLabel();
        Dates = new javax.swing.JLabel();
        ScanItem = new javax.swing.JLabel();
        ItemNumber = new javax.swing.JTextField();
        AddItem = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Recipe = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Total = new javax.swing.JTextArea();
        Print = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        dt.setText("   Date:");

        Dates.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        ScanItem.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        ScanItem.setText("Item Number");

        ItemNumber.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ItemNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                   if(!ItemNumber.getText().isEmpty()) {
                	   Logic logic = new Logic();
                	   if(ItemNumber.getText() != " "){
                		   String item = logic.POS(ItemNumber.getText());
                		   if(item != null) {
                			   Recipe.setText(Recipe.getText()+item+"\n");
                		   }else {
                			   JOptionPane.showMessageDialog(null, "Item Not On inventory"); 
                		   }
                		   
                	   }
                   }
                   ItemNumber.setText("");
                }
            }

        });

        AddItem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AddItem.setText("Add ");
        AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Recipe.setColumns(20);
        Recipe.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Recipe.setRows(5);
        jScrollPane1.setViewportView(Recipe);

        Total.setColumns(20);
        Total.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Total.setRows(5);
        jScrollPane2.setViewportView(Total);

        Print.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogOut.setText("LOG OUT");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dates, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ScanItem, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(Dates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScanItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }



	// </editor-fold>//GEN-END:initComponents
    
    protected void AddItemActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
    	Logic logic = new Logic();
    	Total.setText(logic.receipt(Recipe.getText()));
	}


	protected void ClearActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Recipe.setText("");
		Total.setText("");
	}


	protected void PrintActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Logic logic = new Logic();
    	logic.Print();
	}


	//GEN-FIRST:event_LogOutActionPerformed
    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {
        // Log OUT
    	new	Login_GUI().setVisible(true);
    	setVisible(false);
    }
    //GEN-LAST:event_LogOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItem;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel Dates;
    private javax.swing.JTextField ItemNumber;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Print;
    private javax.swing.JTextArea Recipe;
    private javax.swing.JLabel ScanItem;
    private javax.swing.JTextArea Total;
    private javax.swing.JLabel dt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
  
    
    // Methods!!!!
    
}
