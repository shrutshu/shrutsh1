package com.cg.mobshop.dao;

import java.util.ArrayList;
import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.dto.Mobile;

public interface PurchaseDAO {
	public int addPurchaseDetails(PurchaseDetails pr);
	public ArrayList<Mobile> getMobileList();
	public ArrayList<Mobile> getMobileList(int min, int max);
	public Mobile updateMobileDetails(Mobile mob);
}

