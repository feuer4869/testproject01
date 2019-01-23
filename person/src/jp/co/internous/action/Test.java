package jp.co.internous.action;

public class Test {

	public static void main(String[]args){

		//演習①②
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		//演習③
		taro.phoneNumber="090-1111-1111";
		taro.address="東京";
		//演習③

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		//演習③
		jiro.phoneNumber="090-2222-2222";
		jiro.address="東京";
		//演習③

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		//演習③
		hanako.phoneNumber="090-3333-3333";
		hanako.address="東京";
		//演習③

		Person taka=new Person();
		taka.name="昆孝弘";
		taka.age=28;
		//演習③
		taka.phoneNumber="090-4444-4444";
		taka.address="東京";
		//演習③

		System.out.println(taro.name);
		System.out.println(taro.age);
		//演習③
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		//演習③
		//演習④
		taro.talk();
		taro.walk();
		taro.run();
		//演習④
		System.out.println();


		System.out.println(jiro.name);
		System.out.println(jiro.age);
		//演習③
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		//演習③
		//演習④
		jiro.talk();
		jiro.walk();
		jiro.run();
		//演習④
		System.out.println();


		System.out.println(hanako.name);
		System.out.println(hanako.age);
		//演習③
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		//演習③
		//演習④
		hanako.talk();
		hanako.walk();
		hanako.run();
		//演習④
		System.out.println();


		System.out.println(taka.name);
		System.out.println(taka.age);
		//演習③
		System.out.println(taka.phoneNumber);
		System.out.println(taka.address);
		//演習③
		//演習④
		taka.talk();
		taka.walk();
		taka.run();
		System.out.println();
		//演習④
		//演習①②

		//演習⑧
		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println();

		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println();

		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
		System.out.println();


	}

}
