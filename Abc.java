class examp{
	int a = 20;
	static void m(){
		System.out.println("m function is called");
	}
	
}

class Abc extends examp{
	int a = 30;
	static void m(){
		System.out.println("main class is called");
	}
	void n(){}
	public static void main(String args[]){
		examp obj = new examp();
		obj.k();
		Abc obj1 = new Abc();
		obj1.k();
	   examp obj2 =obj1;
		obj2.m();
		obj2.k();
		System.out.println(obj2.a);
	
		
	}
}
