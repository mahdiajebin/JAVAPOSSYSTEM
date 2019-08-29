package cashier.system;
import static cashier.system.Employee.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

import javax.swing.JOptionPane;

import static cashier.system.Cashier_GUI.*;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Logic {
  //START:Login
	
	static Date date = new Date();
    public boolean Login(String uname, char[] Password) {
        String username = uname;
        String pass = new String(Password);
	     if ((username.equals(E1.getEmpID()) || username.equals(E2.getEmpID()) ||
	          username.equals(E3.getEmpID()) || username.equals(E4.getEmpID())) 
	         && ((pass.equals(E1.getPswrd())))){
	    	 
	        return true;
	     }
	     else{
	    	 //System.out.print(username +" "+ pass);
	        return false;
	     }   
    }
	//END:LOGIN ill  be back wait 
    public String POS(String item){
    	Cashier_GUI Cashier = new Cashier_GUI();
         for (int i = 0; i < Cashier.list.size(); i++ ) {
        	 if(item.equals(Cashier.list.get(i).getType())) {
        		 subtotal += Cashier.list.get(i).getPrice();
        		 ItemList.add(Cashier.list.get(i).getItem());
        		 
        		 return Cashier.list.get(i).getItem();
        	 }
         }
         return null;
    }
    
    public String receipt(String items){
    	if(items !=null) {
            double sub = subtotal;
            String Total = "";
            Total +="-------------Receipt-------------"+"\n";
            Total +="Date: " + date+"\n";
            Total +=" "+"\n";
            Total +="Items:"+"\n";
            Total += items +"\n";
            Total +="--------------------------" +"\n";
            Total += "Subtotal: "+ sub+"\n";
            Total += "Taxes:   "+ getTaxes(sub)+"\n";
            Total += "Total:    "+ getTaxes(sub)+sub+"\n";
            return Total;
    	}
    	return "";
     }
    public void Print() {
    	double sub = subtotal;
		//To print it in a txt file  
	    String fileName = "PRINTRECEIPT.txt";
	    try {
	   	 PrintWriter outputStream = new PrintWriter(fileName);
	   	
	   	outputStream.println("-------------Receipt-------------");
	   	outputStream.println("             New Navy");
	   	outputStream.println("12 -01 fake street /n NY,11111");
	   	outputStream.println("Date: " + date);
	   	outputStream.println("Items:");
        for (int i =0; i < ItemList.size(); i++ ) {
        	outputStream.println(ItemList.get(i));
        }
        outputStream.println("----------------------------------");
	    outputStream.println("Subtotal: "+ sub);
	    outputStream.println("Taxes:   "+ getTaxes(sub));
	    outputStream.println("Total:    "+ getTaxes(sub));
	    outputStream.println();
	    outputStream.println("Thank you for shopping with us");

	   	 outputStream.close();

	    }catch (FileNotFoundException e) {
	   	 e.printStackTrace();
	    }
    }
  //TAXES METHOD
    public static double getTaxes(double sub){
          sub += sub * 0.089; 
         return sub;
     }
    
}
