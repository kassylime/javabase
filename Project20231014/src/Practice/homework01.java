// Day06
package Practice;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class homework01 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        String[] buttons = {"한식", "양식", "중식", "일식", "종료"};
	        String[] hansic = {"제육볶음", "된장찌개", "계란말             이", "순두부찌개", "김치찌개"};
	        String[] yangsic = {"돈가스", "스파게티", "피자", "스테이크", "햄버거"};
	        String[] jungsic = {"자장면", "짬뽕", "탕수육", "딤섬", "볶음밥"};
	        String[] illsic = {"초밥", "우동", "오꼬노미야끼", "덮밥", "라멘"};

	        int exit = Arrays.binarySearch(buttons, "기타");
	        String result = "오늘의 메뉴는? \n";
	        String menu = "";
	        String food = "";

	        while (true){
	            int num = JOptionPane.showOptionDialog(null, "오늘의 점심은?", "메뉴선택",
	                    JOptionPane.YES_NO_CANCEL_OPTION,
	                    JOptionPane.QUESTION_MESSAGE, null, buttons, null);

	            if (num == 0){
	                int num01 = JOptionPane.showOptionDialog(null, "한식", "메뉴선택",
	                        JOptionPane.YES_NO_CANCEL_OPTION,
	                        JOptionPane.QUESTION_MESSAGE, null, hansic, null);
	                menu += "한식";
	                if(num01 == 0){
	                    food += "제육볶음";
	                } else if(num01 == 1){
	                    food += "된장찌개";
	                } else if(num01 == 2){
	                    food += "계란말이";
	                } else if(num01 == 3){
	                    food += "순두부찌개";
	                } else if(num01 == 4){
	                    food += "김치찌개";
	                }

	            } else if(num == 1){
	                int num01 = JOptionPane.showOptionDialog(null, "양식", "메뉴선택",
	                        JOptionPane.YES_NO_CANCEL_OPTION,
	                        JOptionPane.QUESTION_MESSAGE, null, yangsic, null);
	                menu += "양식";
	                if(num01 == 0){
	                    food += "돈가스";
	                } else if(num01 == 1){
	                    food += "스파게티";
	                } else if(num01 == 2){
	                    food += "피자";
	                } else if(num01 == 3){
	                    food += "스테이크";
	                } else if(num01 == 4){
	                    food += "햄버거";
	                }

	            } else if(num == 2){
	                int num01 = JOptionPane.showOptionDialog(null, "중식", "메뉴선택",
	                        JOptionPane.YES_NO_CANCEL_OPTION,
	                        JOptionPane.QUESTION_MESSAGE, null, jungsic, null);
	                menu += "중식";
	                if(num01 == 0){
	                    food += "짜장면";
	                } else if(num01 == 1){
	                    food += "짬뽕";
	                } else if(num01 == 2){
	                    food += "탕수육";
	                } else if(num01 == 3){
	                    food += "딤섬";
	                } else if(num01 == 4){
	                    food += "볶음밥";
	                }

	            } else if(num == 3){
	                int num01 = JOptionPane.showOptionDialog(null, "일식", "메뉴선택",
	                        JOptionPane.YES_NO_CANCEL_OPTION,
	                        JOptionPane.QUESTION_MESSAGE, null, illsic, null);
	                menu += "일식";
	                if(num01 == 0){
	                    food += "초밥";
	                } else if(num01 == 1){
	                    food += "우동";
	                } else if(num01 == 2){
	                    food += "오꼬노미야끼";
	                } else if(num01 == 3){
	                    food += "덮밥";
	                } else if(num01 == 4){
	                    food += "라멘";
	                }
	            } else if(num == 4){
	                exit = -1;
	            }
	            if(exit == -1){
	                JOptionPane.showMessageDialog(null, "프로그램 종료");
	                break;
	            }

	        }
	        result += "===" + menu + "===\n";
	        result += "<<" + food + ">>";
	        JOptionPane.showMessageDialog(null, result);

	    }
	


	
	
	

}
