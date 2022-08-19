package p06.interface_inheritance;

public class InterfaceInheritanceEx {

	public static void main(String[] args) {
		Implemetation impl = new Implemetation();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();	
		//--> error :The method methodB() is undefined for the type InterfaceA
//		ia.methodC();	//--> error
		
		InterfaceB ib = impl;
//		ib.methodA();	//--> error
		ib.methodB();
//		ib.methodC();	//--> error
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
