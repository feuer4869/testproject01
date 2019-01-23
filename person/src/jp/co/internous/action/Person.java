package jp.co.internous.action;

public class Person {
	//演習①②
	public String name=null;
	public int age=0;
	//演習①②

	//演習③
	public String phoneNumber=null;
	public String address=null;
	//演習③

	//演習④
	public void talk(){
		System.out.println(this.name+"が話す。");
	}
	public void walk(){
		System.out.println(this.name+"が歩く。");
	}
	public void run(){
		System.out.println(this.name+"が走る。");
	}
	//演習④

}
