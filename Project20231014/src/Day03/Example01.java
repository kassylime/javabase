package Day03;

public class Example01 {

	public static void main(String[] args) {
		// (1) 반복문 for
		// 특정 명령을 반복해서 수행하고 싶을 때 사용하는 문법 형태
        // for( 반복을 위한 시작값; 반복 횟수; 증가, 감소 )
	    	
	    // 작업을 10번 반복할 수 있는 형태
	    // 작업 순서
	    // 1. int i = 0; 실행 -최초 1회
	    // 2. i < 10의 조건에 따라 다음과 같이 처리
	    // 2-1. i < 10이 true일 경우, {} 안에 있는 명령문 수행
	    // 2-1-1. 명령문이 끝나면 i++를 통해 i를 1 증가
	    // 2-2. i < 10이 false 일경우, 작업 종료
	    for(int i = 0; i < 10; i++) {
	    System.out.println("명령문이 " + (i+1) + "회 실행중입니다.");	
	    }
	    
	    
	    // (2) continue :  break와 함께 반복문을 제어하는 용도로 사용하는 키워드
	    // 키워드 : 자바에서 제공해주는, 명령을 수행하는 영단어 지칭, 32가지 
	    // continue 명령어 이후 반복 부분을 탈출하고 다음 반복을 진행하도록 처리
	    
	    for(int i = 0; i < 10; i++) { // 10번 반복
	    	if(i == 5) continue; // i가 5가 되면 반복을 탈출하고 다음 반복을 진행 6건너 뛰고 7
	    	System.out.println("반복은 계속된다!" + (i+1));
	    }
	    
	    //(3) break : 반복문을 제어하는 용도로 사용되는 키워드
	    // break 명령어 이후 전체 반복을 중단
	    // 010-9886-5628
	    
	    for(int i = 0; i < 10; i++) { 
	    	if(i == 5) break; 
	    	System.out.println("반복 중단!" + (i+1)); // 5까지만 출력
	    }
	       
	    
	    // (4) label : 반복 과정에 이름을 붙여서 해당 작업에 대한 break, continue를 
	    // 진행할 수 있게 만들어주는 도구(c언어 goto를 통해 작업)
	    // 주의사항 : 코드를 난잡하게 만들수 있는 형태이기에, 필요한 경우가 아니면 자제하는 것을 권장하는 형태
	    // 해당 문법은 주로 반복문이 여러 개 중첩되어 있는 경우에 사용
	    
	    
	    // i가 1증가할 때, j가 0부터 7까지 반복하는 코드
	    System.out.println("레이블 적용 전");

	    for(int i = 0; i < 10; i++) {
	    	System.out.println("반복 i : " + i);
	    	for(int j = 0; j < 10; j++) {
	    		System.out.println("j : "+ j);
	    		if(j == 3) break; 
	    	}
	    }
	    
	    // 반복문 안에 작성된 반복문 조건 처리 이후 작업을 종료하는 코드
	    // for with label(레이블과 같이 쓰는 for문)이 사용되는 경우
	    // yes, no 등의 선택지를 만들어서 다시 특정 반복문의 조건으로 돌아가고 싶은 경우
	    System.out.println("레이블 적용 후");
	    
	    반복1 : for(int i = 0; i < 10; i++) {
	    	System.out.println("반복 i : " + i);
	    	for(int j = 0; j < 10; j++) {
	    		System.out.println("j : "+ j);
	    		if(j == 7) break 반복1; 
	    	}
	    }
	    
	}

}
