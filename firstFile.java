import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializator {

	public static void main(String[] args) 
	{
		Employee employloy = new Employee();
		employloy.name = "mario";
		employloy.lastName = "cesar";
		
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try
		{
			fout = new FileOutputStream("employloyloyee.txt");
			oout = new ObjectOutputStream(fout);
			
			oout.writeObject(employloyloyloy);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			try {
				oout.flush();
				oout.close();
				fout.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
