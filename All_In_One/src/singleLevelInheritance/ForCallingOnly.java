package singleLevelInheritance;

public class ForCallingOnly {
	public static void main(String[] args) {
 	   /*WhatsAppVersion1 a=new WhatsAppVersion1();
 	   a.sendMessage();                        
 	   a.profileSave();                         
 	   WhatsAppVersion1.profileSave();*/  
 	   
 	   /*WhatsAppVersion2 b=new WhatsAppVersion2();
 	   b.sendMessage();
 	   b.status();
 	   b.profileSave();
 	   b.calling();*/
 	   
 	   WhatsAppVersion1 c=new WhatsAppVersion2();
 	   c.sendMessage();
 	   c.profileSave();
 	   
 	   /*WhatsAppVersion2 d=new WhatsAppVersion1();*/      //we cant create this
	}
}
//when we create superclass objRefver & object then we can call only superclass method         
//we can call static & non static methods
//when we create subclass objRefver & object then we can call both superclass & subclass method 
//when we create superclass objRefver & subclass object them we can call only superclass method

