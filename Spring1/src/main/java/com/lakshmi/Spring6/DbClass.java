package com.lakshmi.Spring6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


	
	@Component("dc")
	public class DbClass {
		
		@Value("${dburl}")
		private String dburl;
		
		@Value("${username}")
		private String username;
		
		@Value("${password}")
		private String password;
		
		
		public String getDburl() {
			return dburl;
		}
		public void setDburl(String dburl) {
			this.dburl = dburl;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		}
