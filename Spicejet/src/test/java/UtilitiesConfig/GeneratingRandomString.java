package UtilitiesConfig;

import org.apache.commons.lang3.RandomStringUtils;

public class GeneratingRandomString {
	
	public static String Fname() {
		String Firstname = RandomStringUtils.randomAlphabetic(3);
		return Firstname;
		
		}

		
		public static String Lname() {
			String Lastname = RandomStringUtils.randomAlphabetic(8);
			return Lastname;
		}
		
		public static String Phonenum() {
			String phone = RandomStringUtils.randomNumeric(9);
			return phone;
		}
		
		public static String Email() {
			String Mail = RandomStringUtils.randomAlphabetic(8);
			return (Mail+"@gmail.com");
		}
		public static String Address() {
			String Addres = RandomStringUtils.randomAlphabetic(15);
			return Addres;
		}
		public static String city() {
			String cname = RandomStringUtils.randomAlphabetic(8);
			return cname;
		}
		public static String provence() {
			String state = RandomStringUtils.randomAlphabetic(8);
			return state;
		}
		
		public static String Pcode() {
			String postal = RandomStringUtils.randomAlphabetic(8);
			return postal;
		}
		public static String Uname() {
			String username = RandomStringUtils.randomAlphabetic(8);
			return username;
		}
		
		public static String password() {
			String pwd = RandomStringUtils.randomAlphabetic(8);
			return pwd;
		}
		

	}


