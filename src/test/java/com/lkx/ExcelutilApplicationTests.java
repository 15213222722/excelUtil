package com.lkx;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lkx.model.PhoneModel;
import com.lkx.util.ExcelUtil;


public class ExcelutilApplicationTests {

	@Test
	public void contextLoads() throws Exception {
	    
	     String keyValue ="手机名称:phoneName,颜色:color,售价:price"; 
	     List<PhoneModel> list =  ExcelUtil.readXls("C://test.xlsx",ExcelUtil.getMap(keyValue),"com.lkx.model.PhoneModel");
	     System.out.println(list.size());
	}
	
	@Test
	public void textExportExcel() throws Exception{
		
		List<PhoneModel> list = new ArrayList<PhoneModel>();
		for(int i=0;i<100;i++){
			PhoneModel model = new PhoneModel();
			model.setColor("金色"+i);
			model.setPhoneName("苹果"+i+"S");
			model.setPrice(i);
			list.add(model);
		}
		String keyValue ="手机名称:phoneName,颜色:color,售价:price"; 
		ExcelUtil.exportExcel("d:/testsss.xls",ExcelUtil.getMap(keyValue),list,"com.lkx.model.PhoneModel");
	}

}
