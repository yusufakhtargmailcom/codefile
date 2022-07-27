package fridaycode;
class A

{

 final void disp()

 {

 System.out.println("display method");

 }

}

public class FDemo2 extends A

{

final double pi;

FDemo2()

 {

 pi=3.144;

 }

 void disp()

 {

 //pi=3.22;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo2 ob=new FDemo2();

 ob.disp();

 }

}
