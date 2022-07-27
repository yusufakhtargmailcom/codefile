package wedproject;
public class Employee {



	 int eno;

	 String name;

	 double sal;

	 public Employee(int eno, String name, double sal) {

	 super();

	 this.eno = eno;

	 this.name = name;

	 this.sal = sal;

	 }

	 public int getEno() {

	 return eno;

	 }

	 public void setEno(int eno) {

	 this.eno = eno;

	 }

	 public String getName() {

	 return name;

	 }

	 public void setName(String name) {

	 this.name = name;

	 }

	 public double getSal() {

	 return sal;

	 }

	 public void setSal(double sal) {

	 this.sal = sal;

	 }

	 @Override

	 public int hashCode() {

	 final int prime = 31;

	 int result = 1;

	 result = prime * result + eno;

	 result = prime * result + ((name == null) ? 0 : name.hashCode());

	 long temp;

	 temp = Double.doubleToLongBits(sal);

	 result = prime * result + (int) (temp ^ (temp >>> 32));

	 return result;

	 }

	 @Override

	 public boolean equals(Object obj) {

	 if (this == obj)

	  return true;

	 if (obj == null)

	  return false;

	 if (getClass() != obj.getClass())

	  return false;

	 Employee other = (Employee) obj;

	 if (eno != other.eno)

	  return false;

	 if (name == null) {

	  if (other.name != null)

	  return false;

	 } else if (!name.equals(other.name))

	  return false;

	 if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))

	  return false;

	 return true;

	 }

	}

