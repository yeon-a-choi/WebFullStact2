package com.ee.y1.util;

public class ActionFoward {
	
	private String path;
	private boolean check; //check true라면 foward, false라면 redirect



	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

}
