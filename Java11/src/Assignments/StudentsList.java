package Assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsList
{

	public static void main(String[] args) 
	{
		var path="D:\\Java11Assignments_StudentList.txt";
		
		try {
			String s=Files.readString(Path.of(path));
			List<String>list=s.lines().collect(Collectors.toList());
			
			list.removeIf(x->x==",");
			System.out.println(list);
			
			//long count=list.stream().count();
			System.out.println("Count of Students: "+list.stream().count());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
