package Day1217;

public class MyTimer extends Thread {
	@Override
	public void run() {
		Quiz quiz = new Quiz();
		System.out.println("제한 시간 60초 안에 문제를 맞춰 주세요.");
		
		quiz.start();
		
		for(int i = 60; i > 0; i--) {
			 try {
					Thread.sleep(6000);
					
					if(isInterrupted()) {
						System.exit(0);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
		}
	   
		System.out.println("게임이 종료되었습니다.");
		System.out.printf("총 문제 개수 : ");
		System.out.printf("정답 개수 : ");
	    quiz.interrupt();
	}
	
}
