
package java8;
import java.io.*;
import java.util.*;

public class Compsal implements Comparable<Compsal>
{
	 private double salary;
	 private String name,empid;
	    public int compareTo(Compsal m)
	    {
	        return (int) (this.salary- m.salary);
	    }
		public Compsal(double salary, String name, String empid) 
		{
			super();
			this.salary = salary;
			this.name = name;
			this.empid = empid;
		}

		public double getSalary() 
		{
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmpid() {
			return empid;
		}
		public void setEmpid(String empid) {
			this.empid = empid;
		}

	}
	 

