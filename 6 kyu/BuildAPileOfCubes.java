// https://www.codewars.com/kata/5592e3bd57b64d00f3000047

public class ASum {
	
	public static long findNb(long m) {
    long mm = 0, n = 0;
    while (mm < m)
      mm += ++n * n * n;
    return mm == m ? n : -1;
	}	
}

// 🧙‍♂️👍