package com.annotations.customcachingsystem;


import java.util.HashMap;
import java.util.Map;

// Defining a class with a computationally expensive method
public class ExpensiveOperation {
	// Creating a static cache to store results
	private static final Map<Integer, Long> cache = new HashMap<>();

	// Applying the @CacheResult annotation
	@CacheResult
	public long factorial(int n) {
		// Checking if the result is already in cache
		if (cache.containsKey(n)) {
			return cache.get(n);
		}

		// Computing factorial
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		// Storing the result in cache
		cache.put(n, result);

		// Returning the computed value
		return result;
	}
}

