/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Nidhi Rajvir
 */
public class NewClass 
{
    public static void main(String args[])
    {
        // TODO add your handling code here:
        try
        {
            String sql="select * from stock";
            Connection con=ConnectionProvider.getCon();
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            ArrayList<String> med_name = new ArrayList<String>();
            while(rs.next())
            {
                String name=rs.getString("product_name");
                med_name.add(name);
            }
            int size=med_name.size();
            String name[]=new String[size];
            int qty[]=new int[size];
            
            int sold_qty=0;
            PreparedStatement pst1=con.prepareStatement("select * from place_order where medicine=?");
            
            for(int i=0;i<size;i++)
            {
                pst1.setString(1,med_name.get(i));
                ResultSet rs1=pst1.executeQuery();
                while(rs1.next())
                {
                    sold_qty+=rs1.getInt("quantity");
                    System.out.println(rs1.getInt("quantity"));
                }
                qty[i]=sold_qty;
                sold_qty=0;
            }
            
            for(int i=0;i<size;i++)
            {
                System.out.println(med_name.get(i)+" "+qty[i]);
            }

            /*DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("One",10);*/
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+"\nNot connected!");
        }
    }
    
}
