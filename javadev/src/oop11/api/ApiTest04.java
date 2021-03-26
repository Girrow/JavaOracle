package oop11.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class ApiTest04 {
	public static void main(String[] args) throws Exception {
		Properties pr = new Properties();
		FileInputStream fi=null;
		try {
			fi = new FileInputStream("test.properties");
			pr.load(fi);
			
			Iterator<Object> keyitr = pr.keySet().iterator();
			while(keyitr.hasNext()) {
				String key=(String) keyitr.next();
				System.out.println(key + " : "+ pr.getProperty(key));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fi!=null)
				try {fi.close();} catch(Exception e) {}
				
		}
	}
}
