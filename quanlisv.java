package quanlisv;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

import quanlisv.StudentManagement.Student;

public class StudentManagement {
	Vector list=new Vector();
public StudentManagement() {

	while (true)
	{ 
		System.out.println("1.Nhap danh sach sinh vien");
		System.out.println("2.Xem danh sach sinh vien");
		System.out.println("3.Thoat");
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Moi ban chon mot chuc nang:");
		num=keyboard.nextInt();
		switch(num) {
		case 1: this.input();
		break;
		case 2: this.view();
		break;
		case 3:
			System.out.println("chuong trinh ket thuc");
		return;
		
		
		}
	}
		
}
	
	public void view() {
		System.out.println("Danh sach va thong tin sinh vien:");
		Enumeration vEnum=list.elements();
		int i=1;
		while(vEnum.hasMoreElements()) {
			Student sts= (Student)vEnum.nextElement();
			System.out.println(" " +i+".ID=" +sts.getId()+", Ten="+sts.getName()+", Diem trung binh="+
			sts.getaver());
			i++;

		}
		
	}

	public void input() {
		int num;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("nhap so luong sinh vien:");
		num=keyboard.nextInt();
		for (int i=1;i<=num;i++)
		{
			System.out.println("Nhap thong tin sv thu "+i);
			System.out.print(" ID");
			int id=Integer.parseInt(keyboard.next());
			keyboard.nextLine();
			
			System.out.println("Ten:");
			String name=keyboard.nextLine();
			System.out.println("Diem trung binh:");
			float aver=keyboard.nextFloat();
			Student st= new Student(id, name, aver);
			list.add(st);
			
		}
		
	}
	
	public static void main(String[] args) {
		new StudentManagement();
		
	}
	class Student implements Comparable
	{
	private int id;
	private String name;
	private float aver;
	public void Student()
	{
		name =new String("");
		id=0;
		float a = 0;
		aver=a;
	}
	public Student (int i, String n, float a) {
		id=i;
		name=n;
		aver=a;
	}

	public String getName()
	{
		return name ;
			}
	public int getId() {
		return id;
			}
	public float getaver() {
		return aver;
			}

		public int compareTo(Object other) {
			Student otherRect =(Student)other;
			
			return (int)(this.aver-otherRect.aver);
		
		}
	}
}



