/**
 * Project Name:excelutil
 * File Name:PhoneModel.java
 * Package Name:com.lkx.util
 * Date:2017年6月7日上午9:43:19
 * Copyright (c) 2017~2020, likaixuan@test.com.cn All Rights Reserved.
 *
*/

package com.lkx.model;

import java.util.Date;

/**
 * ClassName:PhoneModel
 * Function: TODO ADD FUNCTION.
 * Reason: TODO ADD REASON.
 * Date:     2017年6月7日 上午9:43:19
 * @author   likaixuan
 * @version  V1.0
 * @since    JDK 1.7
 * @see
 */
public class PhoneModel {
    private String phoneName;
    private String color;
    private double price;
    private Date sj;
    
    @Override
    public String toString() {
    	return "phoneName:"+phoneName+",color:"+color+",price:"+price+",sj:"+sj;
    }
    
    public String getPhoneName() {
        return phoneName;
    }
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
	public Date getSj() {
		return sj;
	}
	public void setSj(Date sj) {
		this.sj = sj;
	}
    
    
}

