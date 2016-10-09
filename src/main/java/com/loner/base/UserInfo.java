package com.loner.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private static String name = "milesloner";
	private Date loggingDate = new Date();
	private String uid;
	private transient String pwd;

	UserInfo(String user, String password) {
		uid = user;
		pwd = password;
	}

	public String toString() {
		String password = null;
		if (pwd == null) {
			password = "NOT SET";
		} else {
			password = pwd;
		}
		String uname = null;
		if(name == null) {
			uname = "NOT NAME";
		} else {
			uname = name;
		}
		return "logon info: \n" + " user: " + uid + "\n logging date: "
				+ loggingDate.toString() + "\n password: " + password
				+ "\nname：" + uname;
	}

	public static void main(String[] args) {
		UserInfo logInfo = new UserInfo("MIKE", "MECHANICS");
		System.out.println(logInfo.toString());

		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(
					"logInfo.out"));
			o.writeObject(logInfo);
			o.close();
		} catch (Exception e) {
			// deal with exception
		}

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"logInfo.out"));
			UserInfo logInfo1 = (UserInfo) in.readObject();
			System.out.println(logInfo1.toString());
			in.close();
		} catch (Exception e) {
			// deal with exception
		}
	}

}
