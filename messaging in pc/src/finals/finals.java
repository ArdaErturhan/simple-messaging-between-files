package finals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.ArrayList;

class Center {
    private static ArrayList<Object> communicators = new ArrayList<>();

    public static void AddMe(Object d,int id) {
    	
        communicators.add(d);
       String className = d.getClass().getSimpleName();
        System.out.println(className + " " + id + " has been created");
       
    }
    public static void ARVE(Object a,int id) {
    	String className = a.getClass().getSimpleName();
    	String FolderName ="Log.txt";
    	File file = new File(FolderName);
		FileWriter fw;
		try {
			fw = new FileWriter(file,true);
			PrintWriter pw =new PrintWriter(fw,true);
			 pw.println(className + " " + id + " has been created");
			
			pw.close();
		} catch (IOException e) {
		
		}
		
    	
    	}
    public static void ALARKO(Object d,int id) {
    	String classN = d.getClass().getSimpleName();
    	String FolderN = classN+id+".txt";
    	File files = new File(FolderN);
		FileWriter fww;
		try {
			fww = new FileWriter(files,true);
			PrintWriter pww =new PrintWriter(fww,true);
			 pww.println("sa");
			
			pww.close();
		} catch (IOException e) {
		
		}
    	
    }
    
    
    public static void CopyFile(String source, String dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

  
  public static void SendMessage(String Gen)throws IOException{
	  FileWriter fww;
      try {
          int i=0;
          String[] parts = Gen.split(":");
          String part1 =parts[0];
          
          String part2 = parts[1];
          String part3 = parts[2];
         if(parts[1].equals("all")) {
        	  fww = new FileWriter("Cloud8.txt",true);
        	  fww = new FileWriter("Cat7.txt",true);
        	  fww = new FileWriter( "Cat6.txt",true);
        	  fww = new FileWriter("Cup5.txt",true);
        	  fww = new FileWriter("Cup4.txt",true);
        	  fww = new FileWriter("Car3.txt",true);
        	  fww = new FileWriter("Car1.txt",true);
        	  fww = new FileWriter("Cup2.txt",true);
        	  fww.flush();
        	  fww.close();
        	  PrintWriter pww =new PrintWriter(fww,true);
              pww.printf(parts[0],"says",parts[2] ,"to","all");
              pww.flush();
              pww.close();
          }
         
          while(i<=communicators.size()) {
              if(Integer.parseInt(parts[0])==getIdFromObject(communicators.get(i))) {
                  parts[0]=(String) communicators.get(i).getClass().getSimpleName()+getIdFromObject(communicators.get(i))+".txt";
              }
            i++;
          
          }
          int m =0;
          while(m<=communicators.size()) {
              if(Integer.parseInt(parts[1])==getIdFromObject(communicators.get(m))) {
                  parts[1]=(String) communicators.get(m).getClass().getSimpleName()+getIdFromObject(communicators.get(m))+".txt";
                  
              }
            m++;
            	  
              

          }
          
          
          fww = new FileWriter(parts[0],true);
          FileWriter  fwa = new FileWriter(parts[1],true);
          FileWriter  fwb = new FileWriter("Log.txt",true);
          PrintWriter pww =new PrintWriter(fww,true);
          PrintWriter pwa =new PrintWriter(fwa,true);
          PrintWriter pwb =new PrintWriter(fwb,true);
           pww.printf(parts[0],"says",parts[2] ,"to",parts[1]);
           pwa.printf(parts[0],"says",parts[2] ,"to",parts[1]);
           pwb.printf(parts[0],"says",parts[2] ,"to",parts[1]);
           pww.flush();
           pwa.flush();
           pwb.flush();
          pww.close();
         pwa.close();
         pwb.close();
        
      } catch (Exception e1) {

      }
	 
  }
  





  public static int getIdFromObject(Object obj) {
      try {
          Method getIdMethod = obj.getClass().getMethod("getId");
          return (int) getIdMethod.invoke(obj);
      } catch (Exception e) {
        
      }
      return -1;
  }
}

class Cat {
	private int i =0;
    private int id;
    public Cat(String ObjectName){
        id = IdMaker.makeId();
        Center.AddMe(this,id);
        Center.ARVE(this, id);
        Center.ALARKO(this,id);
         
        }
    public static String EREK(Object z,int id) {
    	String catz =z.getClass().getSimpleName();
    	return catz;
    }
        
    public String GetClassName(Object d){
    	String className = d.getClass().getSimpleName();
    	return className;
    }

    public int getId() {
        return id;
    }
}

class Cup {
    private int id;

    public Cup() {
        id = IdMaker.makeId();
        Center.AddMe(this,id);
        Center.ARVE(this, id);
        Center.ALARKO(this,id);
    }

    public int getId() {
        return id;
    }
}

class Car {
    private int id;

    public Car() {
        id = IdMaker.makeId();
        Center.AddMe(this,id);
        Center.ARVE(this, id);
        Center.ALARKO(this,id);
    }

    public int getId() {
        return id;
    }
}

class Cloud {
    private int id;

    public Cloud() {
        id = IdMaker.makeId();
        Center.AddMe(this,id);
        Center.ARVE(this, id);
        Center.ALARKO(this,id);
    }

    public int getId() {
        return id;
    }
}

class IdMaker {
    private static int nextId = 1;

    public static int makeId() {
        return nextId++;
    }
}

public class finals {
    public static void main(String[] args) throws IOException {
        Car car1 = new Car();
        Cup cup3 = new Cup();
        Car car2 = new Car();
        Cup cup1 = new Cup();
        Cup cup2 = new Cup();
        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Cloud cloud1 = new Cloud();
        Center.CopyFile("Log.txt", "Cloud8.txt");
        Center.CopyFile("Log.txt", "Cat7.txt");
        Center.CopyFile("Log.txt", "Cat6.txt");
        Center.CopyFile("Log.txt", "Cup5.txt");
        Center.CopyFile("Log.txt", "Cup4.txt");
        Center.CopyFile("Log.txt", "Cup2.txt");
        Center.CopyFile("Log.txt", "Car3.txt");
        Center.CopyFile("Log.txt", "Car1.txt");
       
        
        Center.SendMessage("8:4:Merhaba");
    
    }
    
}
/*                              Report for the final:
 *                  First I made the classes(Cat,car,cloud,cup)then I created the objects in the main.After that I created 
 *                  IdMaker method and created unique id s for each object.I made an ArrayList"communicators"and with the 
 *                  AddMe method and add each object to the list.Then with the "ALARKO"method I created the txt's of the objects
 *                  I made the log with the ARVE method The reason why I created the log in a method is:
 *                 So that When a new object is created the log will automatically register the objects .
 *                 Then I used the log to pass the information of the objects that are created to the txt'files of every object
 *                 I made 2 methods to send the message to the objects first is the getIdFromObject method I used it
 *                 in the SendMessage method so I can also save the messages to the files without creating a new, 
 *                 separated method.I used split to seperate the string to 3 parts which is:
 *                 the sender’s id, the receiver’s id and the actual message.Then I created a while loop to get the objects
 *                 that are being called.and equalized the parts to the txt files of them so that I can write the message
 *                 to both sender's and reciever's txt files.I included the "ALL" also.
 */
   


