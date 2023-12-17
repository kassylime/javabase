package Day1217;

//Thread 기능을 이용하여 시간 내에 많은 문제를 풀어보는 스피드 퀴즈 게임 구현

		// 1. 제한시간 60초를 두고 최대한 많은 문제를 맞춥니다.
		// 2. 문제는 간단하게 화면에 문제에 대한 설명이 나오고 그 정답을 작성
		// 3. 정담을 맞출경우 "정답" , 틀릴 경우 "땡"을 출력
		// 4. 모든 문제를 다 풀 경우 정답의 개수를 출력
		
public class Example01 {

	static int correct = 0;
	static int count = 0;
	
	public static void main(String[] args) {
		
		MyTimer timer = new MyTimer();
		timer.start();
	}

}
