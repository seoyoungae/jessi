package main;
import java.io.*;
import java.util.*;

import view.*;
// ���α׷� �����Ŀ� ������ selectlist.txt ��������
//( �Է��Ҷ����� ���� ������ �ϱ����� txt ���� ����Ⱑ �ƴ� �̾�⸦ �߽��ϴ�.)
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		LoginView loginView = new LoginView();
		boolean result = loginView.login();
			
		if(result){
		  
			TypeView typeView = new TypeView();
			typeView.showTypeList();
			typeView.getTypeID(scanner);
			IngredientView ingredientView = new IngredientView();
			ingredientView.selectIngredient(scanner);
			/*
			HomeworkView homesubmitView = new HomeworkView();
			homesubmitView.getSubmitList(scanner);
			ScoreView scoreView = new ScoreView();
			scoreView.showScoreList();
			*/
		}
		
	}
}
