import java.util.*;
class ArraylistDemo{
//	public static void main(String args[]){
//	  TreeMap<Emp,Emp1> map = new TreeMap<>(new Comparator<Emp>(){
						public int compare(Emp e1,Emp e2){
							return e1.getName().compareTo(e2.getName());
						}
	  });
	  map.put(new Emp("name",40),);
		System.out.println(map);
		
	}
}

class Emp{
	String name;
	int age;
	Emp(String name,int age){
		this.name =name;
		this.age = age;
	
	}
	public String toString(){
		return "["+name +","+ age+"]";
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
	
}
class Emp1{
	String name;
	int age;
	Emp(String name,int age){
		this.name =name;
		this.age = age;
	
	}
	public String toString(){
		return "["+name +","+ age+"]";
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
	
}