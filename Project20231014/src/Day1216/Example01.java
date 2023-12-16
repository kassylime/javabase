package Day1216;

class ThreadExample extends Thread {
	int count = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("실행 중인 스레드 : %s 반복횟수 : %d\n", currentThread().getName(), count);
			count++;

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 서식 지정자 종류
			// %d : 정수, %f: 실수, %s : 문장, %c : 문자, %o : 8진수, %x : 16진수, %% : 퍼센트, %n : 개행문자

			// 자주 사용되는 이스케이프 시퀀스 : 키보드 특수 기능
			// \n : 엔터기능, \t : 탭 기능, \b : 백 스페이스, \' : 작은 따옴표 출력, \" : 큰 따옴표 출력, \\ : 역슬래쉬
			// 출력

			// currentThread().getName() : 현재 실행중인 스레드의 이름을 얻어오는 코드
			// Thread.sleep(mills); 1000ms = 1s 작성한 값만큼 스레드의 작동을 멈추는 기능

			// Life cycle
			// 자바에서 스레드의 생성부터 소멸까지의 상태를 생명주기로 표현
			// Thread.State NEW : 스레드의 첫 시작을 의미, 스레드가 실행 준비 완료인 상태
			// Thread.State RUNNABLE : 스레드가 실행을 기다리고 있는 상태
			// Thread.State BLOCKED : 스레드가 차단되어 있는 상태
			// Thread.State WAITING : 스레드가 대기 중인 상태, 다른 스레드의 작업 완료를 기다림
			// Thread.State TIMED_WAITING : 정해진 시간 동안 대기하는 상태
			// Thread.State TERMINATED : 스레드가 종료되거나, 스레드가 죽어있는 상태, 실행완료

		}
	}

}

public class Example01 {

	public static void main(String[] args) {
		/*
		 * thread 메모리를 할당받아 실행중인 프로세스라 부르는데 이 프로세스 내에서 실행되는 흐름의 단위
		 */
		ThreadExample te = new ThreadExample();
		te.start();
	}

}
