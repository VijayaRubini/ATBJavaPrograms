package May2024.ex_21052024.Abstraction.Interface.InterviewQ;

public class lab199 {



}
interface I1{}
interface I2{}
class A{}
class B{}
abstract class c{}
class Test1 extends A{}
class Test2 extends B{}
// class Test3 extends A,B{} -  multiple inheritance with class is not allowed
class Test4 implements I1,I2{} // multiple inheritance with interface is allowed
class Test5 extends A implements I1,I2{} // Hybrid

//class Test6 implements I1 extends A{}- cannot extend after implement
//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{} // interface to interface can extend
//interface I7 extends C{} cannot extend abstract class
class Test7 extends c{}
