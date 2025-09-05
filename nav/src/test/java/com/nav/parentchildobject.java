package com.nav;

public class parentchildobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 🔹 Object 1: Parent reference to Child object
        parentClass obj1 = new childClass(); // Polymorphic reference
        obj1.methodA(); // Calls overridden method in Child
        obj1.methodB();
        obj1.methodC();
        obj1.methodD();
        obj1.parentUnique2();
        obj1.parentUnique1();
        //obj1.parentUnique3();
        

        // obj1.childUnique(); // ❌ Compile error — not accessible via Parent reference

        // 🔹 Object 2: Child reference to Child object
        childClass obj2 = new childClass(); // Full access
        obj2.methodA();       // Calls overridden method
       
        obj2.methodB();
        obj2.methodC();
        obj2.methodD();
        obj2.parentUnique2();
        obj2.parentUnique1();
        obj2.childUnique1();   // ✅ Accessible
        obj2.childUnique2();
        obj2.childUnique1();
        obj2.parentUnique3();
        
        parentClass obj3 = new parentClass();
        obj3.methodA(); 
        obj3.methodB();
        obj3.methodC();
        obj3.methodD();
        obj3.parentUnique2();
        obj3.parentUnique1();
        //obj3.parentUnique3();


	}

}
