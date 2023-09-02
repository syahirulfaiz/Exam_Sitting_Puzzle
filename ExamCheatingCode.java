/**
 * Protocol to cheat on exam
 *
 */


public class ExamCheatingCode {

    public int[] computeAndSendTheCode(int[] exam) {
		int[] code = new int[10];
		// Dont change anything above this line
		// ==========================

	    // TODO Add your solution here.
		boolean stillIterating = true;
		int examIterator = 0;
		int codeIterator = 0;
		while(stillIterating) {
			int sum_0=0, sum_1=0;
			for(int i=examIterator; i<examIterator+3; i=i+1) {
				if (exam[i]==0) {sum_0=sum_0+1;}
				else {sum_1=sum_1+1;}
			}

			int bitForFilling=0;
			if(sum_0 > sum_1) {bitForFilling=0;}
			else {bitForFilling=1;}
			
			for(int i=codeIterator; i<codeIterator+1; i=i+1) {
				code[i]=bitForFilling;
			}

			examIterator = examIterator + 3;
			codeIterator = codeIterator + 1;
			//if(examIterator+3>=exam.length || codeIterator>=code.length) {stillIterating = false;}
			if(examIterator+3 >= exam.length) {stillIterating = false;}
		}
		
		//System.out.println("examIterator="+examIterator+"; codeIterator="+codeIterator);
		int sum_0=0, sum_1=0;
		for(int i=examIterator; i<examIterator+2; i=i+1) {
			if (exam[i]==0) {sum_0=sum_0+1;}
			else {sum_1=sum_1+1;}
			//System.out.println("i="+i+"; exam["+i+"]="+exam[i]);
		}
		int bitForFilling=0;
		if(sum_0 > sum_1) {bitForFilling=0;}
		else {bitForFilling=1;}
		
		for(int i=codeIterator; i<codeIterator+1; i=i+1) {
			code[i]=bitForFilling;
			//System.out.println("i="+i+"; code["+i+"]="+code[i]);
		}
		
		
		

		// ==========================
		// Dont change anything below this line        
		return code;
	}

    public int[] enterSolutionBasedOnCode(int[] code) {
		int[] answer = new int[20];

		// Dont change anything above this line
		// ==========================

	    // TODO Add your solution here.
		boolean stillIterating = true;
		int examIterator = 0;
		int codeIterator = 0;
		while(stillIterating) {
			int sum_0=0, sum_1=0;
			for(int i=codeIterator; i<codeIterator+1; i=i+1) {
				if (code[i]==0) {sum_0=sum_0+1;}
				else {sum_1=sum_1+1;}
			}
			
			int bitForFilling=0;
			if(sum_0 > sum_1) {bitForFilling=0;}
			else {bitForFilling=1;}
			
			for(int i=examIterator; i<examIterator+3; i=i+1) {
				answer[i]=bitForFilling;
			}
			
			examIterator = examIterator + 3;
			codeIterator = codeIterator + 1;
			if(examIterator+3>=answer.length || codeIterator>=code.length) {stillIterating = false;}
		}		
				
		//System.out.println("examIterator="+examIterator+"; codeIterator="+codeIterator);	
		int sum_0=0, sum_1=0;
		for(int i=codeIterator; i<codeIterator+1; i=i+1) {
			if (code[i]==0) {sum_0=sum_0+1;}
			else {sum_1=sum_1+1;}
			//System.out.println("i="+i+"; code["+i+"]="+code[i]);
		}
		
		int bitForFilling=0;
		if(sum_0 > sum_1) {bitForFilling=0;}
		else {bitForFilling=1;}
		
		for(int i=examIterator; i<examIterator+2; i=i+1) {
			answer[i]=bitForFilling;
			//System.out.println("i="+i+"; answer["+i+"]="+answer[i]);
		}

		// ==========================
		// Dont change anything below this line
		return answer;
	}
}
