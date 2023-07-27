package osgi;

import java.util.Scanner;


import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;


@Command(scope = "CustomCommand", name = "display1", description = "This is the  custom karaf command example ")
@Service
public class Argumentbased implements Action  {
Scanner scanner=new Scanner(System.in);

	@Argument(index = 0, name = "action", description = "action dkaraf@root()> CustomCommand:display efines what action to be performed", required = true, multiValued = false)
	String name=null;
	public Object execute() throws Exception {
		
		if(name.equals("add")) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			System.out.println(a+b);
			return a+b;//akshay
		}

		else if(name.equals("mul")) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			System.out.println(a+b);
			return a+b;
		}
		

		if(name.equals("sub")) {

			int a=scanner.nextInt();
			int b=scanner.nextInt();
			System.out.println(a+b);
			return a+b;
		}

		
		else {
			String a=scanner.next();
			String b=scanner.next();
			System.out.println(a+b);
			return a+b;

		}
		
		
	}

}
