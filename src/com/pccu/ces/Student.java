package com.pccu.ces;

public class Student implements IPeople {
	private int    	mId ;
	private String 	mName = "";
	private String 	mSex  = "";
	
	private int	mChi;
	private int mEng;
	private int mMath;
	
	public  float mAvg;
	
	
	public void setChi (int score) {
		this.mChi = score;
	}
	public int getChi () {
		return this.mChi;
	}
	
	public void setEng (int score) {
		this.mEng = score;
	}
	public int getEng () {
		return this.mEng;
	}
	
	public void setMath (int score) {
		this.mMath = score;
	}
	public int getMath () {
		return this.mMath;
	}
	
	public void calAvg () {
		mAvg = (mChi + mEng + mMath) / 3;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.mName;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.mName = name;
		
	}
	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return this.mSex;
	}
	@Override
	public void setSex(String sex) {
		// TODO Auto-generated method stub
		this.mName = sex;
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.mId;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.mId = id;
	}

}
