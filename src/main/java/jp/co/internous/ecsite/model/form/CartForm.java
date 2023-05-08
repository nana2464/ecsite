package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable {
	
	private int userid;
	
	private List<Cart> cartList;
	
	public int getUserId() {
		return userid;
	}
	
	public void setUserId(int userId) {
		this.userid = userId;
	}
	
	public List<Cart> getCartList() {
		return cartList;
	}
	
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

}
