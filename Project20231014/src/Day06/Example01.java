package Day06;

public class Example01 {
	public static void main(String[] args) {
		
		// 이차원 배열 & 가변배열
		// 배열 안에 배열 요소로 배열이 존재하는 형태
		
		int [] iArray; // 일차원 배열
		int[][] iArray2; // 이차원 배열
	    int[][] iArray3 = new int[3][4]; 
	    
	    // 이차원 배열 작성방법
        // 자료형 [][] 배열명 = new 자료형[세로길이][가로길이];
		
	    System.out.println(iArray3.length); // 2차원 배열의 길이
	    System.out.println(iArray3[0].length); // 2차원 배열에서 열 하나의 길이
	    
	    // 가변배열은 2차원 배열에서 각 배열 당 주어진 배열의 요소 개수가 달라도 자연스럽게 배열의 형태를 만든다.
	    
	    int[][] iArray4 = {
	    		 {95, 86}
	    		,{83, 92, 96}
	    		,{78,83,93,87,88}
	    };
	
	    
	    System.out.println("이중 for문을 ");
	    for(int i = 0; i < iArray4.length; i++) {
	    	for(int j = 0; j < iArray4[i].length; j++) {
	    		System.out.println("값 : " + iArray4[i][j]);
	    	}
	    	System.out.println();
	    }
	    
	    
	    System.out.println("이중 배열 for문");
	    // 2차원 배열로부터 1차원 배열을 뽑아낸 후
	    for(int[] values : iArray4) {
	    	// 1차원 배열을 통해 일반 자료형을 뽑아냅니다.
	    	for(int value : values) {
	    	System.out.println("값 : " + value );
	    	}	
	    	System.out.println();
	    }
	    
	}

}
