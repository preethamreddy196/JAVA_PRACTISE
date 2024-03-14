import java.util.Scanner;
import java.util.Scanner;
class Register{

        static String def = "\u001b[0m";
	static String blink = "\u001b[5m";
	static String red = "\u001b[31m";
	static String green = "\u001b[32m";
	static String yellow = "\u001b[33m";
	static String blue = "\u001b[34m";
	static String purple = "\u001b[35m";
	static String skblue = "\u001b[36m";
	static String bold = "\u001b[1m";
	static String underline = "\u001b[4m";
	static String reverse ="\u001b[7m";
	static String lytyellow="\u001b[93m";
	static Register obj=new Register();
	private String username;
	private String password;
	public  void setuser(String username){
		this.username=username;
	}
	public void setpass(String password){
		this.password=password;
	}
	public String getuser(){
		return username;
	}
	public String getpass(){
		return password;
	}
}


class Login{
	static int c=3;
	static void login()
	{	
		if(c==0){
			System.out.println("					Too Many Unsuccessful Attempts Register Again");
			Main.obj.account();
		}
		System.out.print(Register.skblue);
		System.out.println("					Login to continue!!!");
		System.out.print(Register.def);
		System.out.print(Register.green);
		System.out.println("					Enter your Mobile.No: ");
		System.out.print(Register.def);
		String u=KPHB.sc.next();
		System.out.print(Register.green);
		System.out.println("					Enter your password!");
		System.out.print(Register.def);
		String p=KPHB.sc.next();
		if(Register.obj.getuser().equals(u) && Register.obj.getpass().equals(p))
		{
			System.out.print(Register.green);
			System.out.println("					Login Successful!!!");
			System.out.print(Register.def);
			Main.obj.spec();
		}
		else {
			c--;
			System.out.print(Register.red);
			System.out.println("					Invalid login Credentials!");
			System.out.print(Register.def);
			login();
		}
	}
}
class KPHB{
	static Scanner sc=new Scanner(System.in);
	static int cd=0;
	static String cardio[]=new String[4];
	static String neuro[]=new String[15];
	static String general[]=new String[15];
	static String Appoint[]=new String[6];
	static String Basic[]={"Name","Age","Gender","Mobile","Date","Time"};
	static String Address="KPHB";
		void cardiodoctors(String X){
			System.out.print(Register.yellow);
			System.out.println("					******************cardiology Specialist**************                        ");
			System.out.print(Register.def);
			cd=0;
			String doc1="					1. Dr.Pv subbaro - Rainbow Hospital - ";
			String doc2="					2. Dr.srinivas rao - Holistic Hospital - ";
			cd=cd+2;
			cardio[0]=doc1+Address;
			cardio[1]=doc2+Address;
			System.out.println(doc1+Address);
			System.out.println(doc2+Address);
		}
		void neurodoctors(String X){
			System.out.print(Register.yellow);
			System.out.println("					******************Neurology Specialist**************    ");
			System.out.print(Register.def);
			cd=0;
			String doc1="					1. Dr.karthik - Rainbow Hospital - ";
			String doc2="					2. Dr.ranga rao - Holistic Hospital - ";
			cd=cd+2;
			neuro[0]=doc1+Address;
			neuro[1]=doc2+Address;
			System.out.println(doc1+Address);
			System.out.println(doc2+Address);
		
		}
		void generalphysician(String X){
			System.out.print(Register.yellow);
			System.out.println("					******************General MBBS************** ");
			System.out.print(Register.def);
			cd=0;
			String doc1="					1.Dr. shrisha - Appolo Hospitals - ";	
			String doc2="					2. Dr.Saikiran - Yashoda Hospitals - ";
			cd=cd+2;
			general[0]=doc1+Address;
			general[1]=doc2+Address;
			System.out.println(doc1+ Address);
			System.out.println(doc2+ Address);
		}
}

class Ameerpet extends KPHB{
		static String Address="Ameerpet";
		void cardiodoctors(String X){
			super.cardiodoctors(X);
			String doc3 = "					3. Dr.shirisha - Ramdevrao Hospital - ";
			String doc4= "					4. Dr.uma - Kamineni Hospital - ";
			cd=cd+2;
			cardio[2]=doc3+Address;
			cardio[3]=doc4+Address;
			System.out.println(doc3+Address);
			System.out.println(doc4+Address);
		}
		void neurodoctors(String X){
			super.neurodoctors(X);
			String doc3="					3. Dr.ravi - Gandhi Hospital - ";
			String doc4="					4. Dr.abhi - Usmania Hospital - ";
			cd=cd+2;
			neuro[2]=doc3+Address;
			neuro[3]=doc4+Address;
			System.out.println(doc3+Address);
			System.out.println(doc4+Address);
		}
}
abstract class Appio extends Ameerpet
{
	abstract void account();
	static Scanner sc=new Scanner(System.in);
	String r="1234567890";
	static int fee1=500;
	//int b=0,b1=0,b2=0;
	String appointment(String N, String x1)
	{
		System.out.print(Register.blue);
		System.out.println("					Enter 1.Continue \n 					2.Back to Doctors");
		System.out.print(Register.def);
		int b3=sc.nextInt();
		if(b3==2)
		{
		    for(int i=0; i<1; i++)
		    {
			if(x1.equals("Cardiology"))
			{
				Main.obj.cardiodoctors(x1);
			        Main.obj.selectdoctor(cardio,x1);
				break;
			}
			else if(x1.equals("Neurology"))
			{
				Main.obj.neurodoctors(x1);
				Main.obj.selectdoctor(neuro,x1);
				break;
			}
			else if(x1.equals("General"))
			{
				Main.obj.generalphysician(x1);
				Main.obj.selectdoctor(general,x1);
				break;
			}
		    }
		}
		else if(b3==0 || b3>=3)
		{
			System.out.print(Register.red);
			System.out.println("					*****Please Enter valid Option******");
			System.out.print(Register.def);
			appointment(N,x1);
		}
		int b=0,b1=0,b2=0;
		System.out.print(Register.yellow);
		System.out.println("					********** Welcome to Appointment*********");
		System.out.print(Register.def);
		System.out.print(Register.skblue);
		System.out.println("					Enter your NAME :");
		System.out.print(Register.def);
		String s1=sc.next();
		for(int i=0; i<s1.length(); i++)
		{
			char ch2=s1.charAt(i);
			if((ch2>='A' && ch2<='Z') || (ch2>='a' && ch2<='z'))
			{
				b++;
			}
			else
			{
				break;
			}
		}
			//System.out.println(s1.length());
			//System.out.println(b);
			if(b==s1.length())
			{

				Appoint[0]=s1;
			}
			else if(b!=s1.length())
			{
				System.out.print(Register.red);
				System.out.println("					Please Enter valid Name it should be in charaters !!");
				System.out.print(Register.def);
				appointment(N,x1);
			}
		System.out.print(Register.skblue);
		System.out.println("					Enter your AGE :");
		System.out.print(Register.def);
		String s2=sc.next();
		for(int i=0; i<s2.length(); i++)
		{
			char ch3=s2.charAt(i);
			if(ch3>='0' && ch3<='9')
			{
				b1++;
			}
			else 
			{
				break;
			}
		}
			if(b1==s2.length())
			{
				Appoint[1]=s2;
			}
			else if(b1!=s2.length())
			{
				System.out.print(Register.red);
				System.out.println("					Please Enter valid Age it should be in Numbers !!");
				System.out.print(Register.def);
				appointment(N,x1);
			}
		System.out.print(Register.skblue);
		System.out.println("					Select your Gender : \n 					1.Male  \n 					2.Female \n 					3.TransGender");
		System.out.print(Register.def);
		String s3=sc.next();
		if(s3.equals("1"))
		{
		     Appoint[2]="Male";
		}
		else if(s3.equals("2"))
		{
			Appoint[2]="Female";
		}
		else if(s3.equals("3"))
		{
			Appoint[2]="TransGender";
		}
		else 
		{
			System.out.print(Register.red);
			System.out.println("					Please Select Valid Gender Options");
			System.out.print(Register.def);
			appointment(N,x1);
		}
		System.out.print(Register.skblue);
		System.out.println("					Enter your Mobile.No");
		System.out.print(Register.def);
		String s4=sc.next();
		if(s4.length()==10)
		{
			for(int i=0; i<s4.length(); i++)
			{
		        	char ch4=s4.charAt(i);
				if(ch4>='0' && ch4<='9')
				{
					b2++;
				}
				else 
				{
					break;
				}
			}
			if(b2!=s4.length())
			{
				System.out.print(Register.red);
				System.out.println("					Please Enter Valid Mobile.No !!");
				System.out.print(Register.def);
				appointment(N,x1);
			}
			else
			{
				Appoint[3]=s4;
			}
		}
		else 
		{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Mobile.No");
			System.out.print(Register.def);
			appointment(N,x1);
		}
		System.out.print(Register.skblue);
		System.out.println("					Select your date(DD-MM-YY) and Time B/W - 10Am to 3pm ");
		System.out.print(Register.def);
		String s5=sc.next();
		Appoint[4]=s5;
		String s6=sc.next();
		Appoint [5]=s6;
		Payment(Appoint,N);
		return "					Hello";
	}
	void Payment(String x2[],String N)
	{
			System.out.print(Register.yellow);
			System.out.println("					**********Welcome to Payment Mode**********");
			System.out.print(Register.def);
			//System.out.print(Register.);
			System.out.println("					Your Appointment Booking Fee is 500/- \n Plz Select your Payment Mode :");
		System.out.print(Register.blue);
System.out.println("					1.Phone Pay  \n 					2.Google Pay ");
			System.out.print(Register.def);
			int f=sc.nextInt();
			if(f==1)
			{
				phonePay(fee1,N);
			}
			else if(f==2)
			{
				googlePay(fee1,N);
			}
			else
			{
				System.out.print(Register.red);
				System.out.println("					Please Enter valid Payment Mode");
				System.out.print(Register.def);
				Payment(Appoint,N);
			}
	}
	void phonePay(int a, String N)
	{
		int a1=a;
		String s1="3435";
		System.out.print(Register.skblue);
		System.out.println("					Enter Amount For Appointment Booking");
		System.out.print(Register.def);
		int fee1=sc.nextInt();
		if(fee1==a)
		{
			System.out.print(Register.purple);
			System.out.println("					Please Enter Your Phonepay Pin.no");
			System.out.print(Register.def);
			String a2=sc.next();
			if(a2.equals(s1))
			{
			System.out.print(Register.green);
			System.out.println("					Appointment Booking Successful");
			System.out.print(Register.def);
			Statement(N);
			}
			else 
			{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Pin.No !!");
			System.out.print(Register.def);
			phonePay(a1,N);
			}
		}
		else
		{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Amount");
			System.out.print(Register.def);
			phonePay(a1,N);
		}
	}
	void googlePay(int a, String N)
	{
		int a1=a;
		String s2="1819";
		System.out.print(Register.skblue);
		System.out.println("					Enter Amount For Appointment Booking");
		System.out.print(Register.def);
		int fee1=sc.nextInt();
		if(fee1==a)
		{
			//System.out.print(Register.purple);
			System.out.println("					Please Enter Your Googlepay Pin.no");
			System.out.print(Register.def);
			String a3=sc.next();
			if(a3.equals(s2))
			{
			System.out.print(Register.green);
			System.out.println("					Appointment Booking Successful");
			System.out.print(Register.def);
			Statement(N);
			}
			else 
			{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Pin.No !!");
			System.out.print(Register.def);
			googlePay(a1,N);
			}
		}
		else
		{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Amount");
			System.out.print(Register.def);
			googlePay(a1,N);
		}
	}
	void Statement(String N)
	{
		System.out.print(Register.green);
		System.out.println("					********Booking Detalis**********       ");
		System.out.print(Register.def);
		System.out.print(Register.blue);
		System.out.println("					Your Doctor Details is :"+N.substring(2,N.length()));	
		System.out.print(Register.def);
		for(int i=0; i<Basic.length; i++)
		{
			System.out.print(Register.lytyellow);
			System.out.print(Basic[i]+" : ");
			System.out.print(Register.def);
			System.out.println(Appoint[i]);
		}
		System.out.print(Register.green);
		System.out.println("					Payment Status : Successful");
		System.out.print(Register.def);
		System.exit(0);
	}		 		
}
		
	
class Main extends Appio{
	static Main obj=new Main();
	int k=0;
	void selectdoctor(String[] x,String x1){
		for(int i=0; i<x.length; i++)
		{
			if(x[i]!=null)
			{
				k++;
			}
			else
			{
				break;
			}
		}
		int c1=cd+1;
		System.out.println("					"+(cd+1)+".for Back to Specifications");  
		System.out.print(Register.skblue);
		System.out.println("					Select your Doctor for Appointment!!");
		System.out.print(Register.def);
		int c=sc.nextInt();
		if(c==c1)
		{
			spec();
		
		}
		if(c<=cd && c!=0)
		{
		                
				appointment(x[c-1],x1);
			
		}
		else
		{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Option  !!");
			System.out.print(Register.def);
			if(r==1)
			{
				KPHB.cd=0;
				cardiodoctors("cardiology");
				selectdoctor(cardio,"cardiology");
			
			}
			else if(r==2)
			{
				KPHB.cd=0;
				neurodoctors("Neurology");
				selectdoctor(neuro,"Neurology");
			}
			else if(r==3)
			{
				KPHB.cd=0;
				generalphysician("General");
				selectdoctor(general,"General");
			}
		}
			
	}
	static int r=0;
	void spec()
	{
		System.out.print(Register.purple);
		System.out.println("					Enter specification you want!   \n 					1.Cardiology   \n 					2.Neurology   \n 					3.General \n 					4.Back to Login"); 
		System.out.print(Register.def);
		int e=sc.nextInt();
		r=e;
		if(e>=1 && e<=4)
		{
		    if(e==1)
		    {
	        	String choice="Cardiology";
			if(choice.equalsIgnoreCase("Cardiology"))
			obj.cardiodoctors(choice);
			obj.selectdoctor(cardio,choice);
		    }
		    else if(e==2)
		    {
			String choice="Neurology";
			if(choice.equalsIgnoreCase("Neurology"))
			obj.neurodoctors(choice);
			obj.selectdoctor(neuro,choice);
        	    }
		    else if(e==3)
		    {
			String choice="General";
			if(choice.equalsIgnoreCase("General"))
			obj.generalphysician(choice);
			obj.selectdoctor(general,choice);
		    }	
		    else
		    {
			Login.login();
		    }	
		}
		else 
		{
			System.out.print(Register.red);
			System.out.println("				Enter Valid Specification !!");
			System.out.print(Register.def);
			spec();
		}
	}
	void account()
	{
		int c=0, a=0, a1=0, a2=0, a3=0, space=0;
		String s="0123456789";
		System.out.print(Register.blue);
		System.out.println("					Enter your Mobile.No: \n 					Mobile Number must only contain 10 Numbers From(0-9)");
		System.out.print(Register.def);
	        String username=sc.next();
		System.out.print(Register.blue);
		System.out.println("					create your password: \n 					password  must only contain 9 characters and Atleast:  \n 					1-Special Charater & 1-Capital Letter & 1-Small Letter & 1-Numeric Digit are allowed !");
		System.out.print(Register.def);
		String password=sc.next();
		if(username.length()==10 && password.length()==9)
		{
		      for(int i=0; i<username.length(); i++)
		      {
				char ch=username.charAt(i);
			    if(s.contains(ch+""))
			    {
				c++;
			    }
			    else 
			    {
				break;
			    }
		      }
		      for(int i=0; i<password.length(); i++)
		      {
 			    char ch1=password.charAt(i);
			    if(ch1>='A' && ch1<='Z')
			    {
				a++;
			    }
			    else if(ch1>='0' && ch1<='9')
			    {
 				a1++;
			    }
			    else if(ch1>='a' && ch1<='z')
			    {
				a2++;
			    }
			    else if(ch1!=' ')
			    {
				a3++;
			    }
			    else 
			    {
				space++;
				break;
			    }
		      }
			if((c==username.length()) && (a!=0 && a1!=0 && a2!=0 && a3!=0 && space==0))
			{
		            Register.obj.setuser(username);
		            Register.obj.setpass(password);
			}
			else if(c!=username.length())
			{
				System.out.print(Register.red);
				System.out.println("				Please Enter Valid Mobile.No !!");
				System.out.print(Register.def);
				account();
			}
			else
		        {
				System.out.print(Register.red);
				System.out.println("				Please Enter Valid Password !!");
				System.out.print(Register.def);
				account();
			}
		}
		else
		{
			if(username.length()!=10 && password.length()!=9)
			{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Password and Mobile.No !!");
			System.out.print(Register.def);
			account();
			}
			else if(username.length()!=10)
			{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid  Mobile.No !!");
			System.out.print(Register.def);
			account();
			}
			else if(password.length()!=9)
			{
			System.out.print(Register.red);
			System.out.println("					Please Enter Valid Password !!");
			System.out.print(Register.def);
			account();
			}
			
		}
			
		
	}
	public static void main(String[] args){
			System.out.print(Register.green);
		//System.out.print(Register.reverse);

		System.out.print(Register.blink);
		System.out.println();
		System.out.print( "                                                           ####### \n                                                           ####### \n                                                           ####### \n                                                           ####### \n                                                   ####################### \n                                                   #######################  ");
		System.out.print(Register.def);
		System.out.print(Register.red);
		System.out.print("				  \n                                                    WELCOME TO HEALTH CARE");
		System.out.print(Register.def);
		System.out.print(Register.green);
		System.out.print(Register.blink);
		System.out.print( "                                   \n                                                   ####################### \n                                                   ####################### \n                                                           ####### \n                                                           ####### \n                                                           ####### \n                                                           #######");
		System.out.println();
		System.out.print(Register.def);
		System.out.print(Register.blue);
		System.out.println("						  	\n					Create An Account !!");
		System.out.print(Register.def);
	        obj.account();
		Login.login();
		//obj.spec();
		
	}
	
}



