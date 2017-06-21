import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializator {

	public static void main(String[] args) 
	{
		Employee thisGuy = new Employee();
		thisGuy.name = "mario";
		thisGuy.lastName = "cesar";	
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try
		{
			fout = new FileOutputStream("employee.txt");
			oout = new ObjectOutputStream(fout);
			oout.writeObject(thisGuy);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			try {
				oout.flush();
				oout.close();
				fout.close();
			} catch (IOException e1) 
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}