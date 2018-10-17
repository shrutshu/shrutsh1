package com.cg.mobshop.service;

import java.util.ArrayList;

import com.cg.mobshop.dao.PurchaseDAO;
import com.cg.mobshop.dao.PurchaseDAOImpl1;
import com.cg.mobshop.dto.Mobile;
import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.exception.PurchaseException;

public class PurchaseServiceImpl implements PurchaseService {
	PurchaseDAO dao;
	
	public PurchaseServiceImpl() {
		// TODO Auto-generated constructor stub
		try {
			dao = new PurchaseDAOImpl1();
		}
		catch (PurchaseException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public int addPurchaseDetails(PurchaseDetails pr) {
		// TODO Auto-generated method stub
		
		return dao.addPurchaseDetails(pr);
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
