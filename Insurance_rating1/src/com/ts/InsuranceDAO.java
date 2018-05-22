package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class InsuranceDAO {

	public  UserBean isUser(String uid,String pwd)
	{
		UserBean deatails=new UserBean();
		
		try{ 
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/rk","root","root");  
			//here sonoo is database name, root is username and password  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select role,User_id from underwriter where User_id='"+uid+"' and Password='"+pwd+"'");  
			
			while(rs.next())  
			{
		deatails.setRole(rs.getString(1));
		deatails.setUsername(rs.getString(2));
			}
			rs.close();
			con.close(); 
		}
			catch(Exception e){ System.out.println(e);} 
		finally {
			return deatails;
		}
		
			}
	
	
	public ArrayList<String> autoModelList()
	{
		ArrayList<String> models=new ArrayList<String>();
		try{ 
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/rk","root","root");  
			
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select vehical_modelname from auto_rates");  
			
			while(rs.next())  
			{
		models.add(rs.getString(1));
			}
			rs.close();
			con.close(); 
		}
			catch(Exception e){ System.out.println(e);
			} 
		finally {
			return models;
		}
		
	}
	
	public int basePremium(String model)
	{
		int base=0;
		try{ 
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/rk","root","root");  
			
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select auto_base_premium  from auto_rates where vehical_modelname='"+model+"'");  
			
			while(rs.next())  
			{
		base=(rs.getInt(1));
			}
			rs.close();
			con.close(); 
		}
			catch(Exception e){ System.out.println(e);} 
		finally {
			return base;
		}
		
	}
	
	public double FinalPrice(String vtype,String Einsurance,String Dclass,String ASF,String ATA,String VH,String PT)
	{
		double total=1000;
		try{ 
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/rk","root","root");  
			
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select Impact_type,Impact_pct  from auto_rating_factors where (RFN='vtype' and option_desc='"+vtype+"') or  (RFN='Einsurance' and option_desc='"+Einsurance+"') or(RFN='Dclass' and option_desc='"+Dclass+"') or (RFN='ASF' and option_desc='"+ASF+"') or (RFN='ATA' and option_desc='"+ATA+"') or (RFN='VH' and option_desc='"+VH+"') or (RFN='PT' and option_desc='"+PT+"')"); 
			
			while(rs.next())  
			{
				
				double s=1000*rs.getFloat(2);
				
				if(rs.getInt(1)==0)
				{
					total-=s;
				}
				else
				{
					total+=s;
				}
			
			}
			
			rs.close();
			con.close(); 
		}
			catch(Exception e){ System.out.println(e);} 
		finally {
			return total;
		}
	}
	
	}
	
	
	

