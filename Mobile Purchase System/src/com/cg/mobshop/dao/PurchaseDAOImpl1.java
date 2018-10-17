package com.cg.mobshop.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.mobshop.dto.Mobile;
import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.exception.PurchaseException;


public class PurchaseDAOImpl1 implements PurchaseDAO{
	Connection connection;
	public PurchaseDAOImpl1() throws PurchaseException
	{
	connection = DBConnection.getConnection();
	}
public int generatorId()
{
	int id=0;
	try{
		Statement stmt=connection.createStatement();
		ResultSet rs= stmt.executeQuery("select id_gen1.nextval from dual");
		if(rs.next())
			id = rs.getInt(1);
	}
		catch(SQLException e)
	{
			e.printStackTrace();
	}
	return id;
}
	@Override
	public int addPurchaseDetails(PurchaseDetails pr) {
		// TODO Auto-generated method stub
		String sql="insert into purchaseDetails values" +"(?,?,?,?,sysdate,?)" ;
	try
	{
		
		PreparedStatement ps= connection.prepareStatement(sql);
		int id=generatorId();
		ps.setInt(1, id);
		ps.setString(2, pr.getCustName());
		ps.setString(3, pr.getMailId());
		ps.setString(4, pr.getPhoneNo());
		ps.setInt(5, pr.getMobileId());
		int rowcount=ps.executeUpdate();
		if(rowcount==1)
		return id;}
	catch(SQLException e){
		e.printStackTrace();		
	}
	return 0;	
		
	}

	@Override
	public ArrayList<Mobile> getMobileList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Mobile> getMobileList(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mobile updateMobileDetails(Mobile mob) {
		// TODO Auto-generated method stub
		return null;
	}

}
