package com.validateanipaddress;

import java.util.regex.*;

class IPAddressValidator {
	public static boolean isValidIPAddress(String ip) {
		// Defining a regex pattern to validate IPv4 addresses
		String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
			   + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
			   + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
			   + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

		// Compiling the regex pattern
		Pattern pattern = Pattern.compile(regex);

		// Creating a matcher to check if the IP matches the pattern
		Matcher matcher = pattern.matcher(ip);

		// Returning true if the IP is valid, false otherwise
		return matcher.matches();
	}

	public static void main(String[] args) {
		// Defining test cases for valid and invalid IP addresses
		String[] ips = {"192.168.1.1", "255.255.255.255", "256.100.50.25", "192.168.300.1"};

		// Iterating through test cases to validate each IP
		for (String ip : ips) {
			System.out.println(ip + " is valid: " + isValidIPAddress(ip));
		}
	}
}
