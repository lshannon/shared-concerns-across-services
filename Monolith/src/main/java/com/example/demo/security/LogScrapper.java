package com.example.demo.security;

public class LogScrapper {
	
	/**
	 * This must run on all log files for compliance reasons
	 * @param original
	 * @return
	 */
	public String scrapLog(String original) {
		return securityLogic(original);
		
	}
	
	private String securityLogic(String original) {
		if (original.contains("a")) {
			reportSecurityIssue();
		}
		return original.replaceAll("a", "*****");
	}
	
	private void reportSecurityIssue() {
		//write to a secret DB that someone is a bad boy....like Marcin
	}

}
