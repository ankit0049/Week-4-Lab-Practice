package com.junit.performancetimeout;

public class PerformanceTimeout {
    public void longRunningTask() {
	   try {
		  // Simulating delay.
		  Thread.sleep(3000);
	   } catch (InterruptedException e) {
		  // Properly handling the interrupted exception.
		  Thread.currentThread().interrupt();
	   }
    }
}
