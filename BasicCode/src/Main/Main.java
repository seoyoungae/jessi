package Main;
import java.io.IOException;
import java.util.Scanner;
import control.LectureManager;
import view.DepartmentView;
import view.HomeworkView;
import view.LectureView;
import view.LoginView;
import view.ScoreView;
// ���α׷� �����Ŀ� ������ selectlist.txt ��������
//( �Է��Ҷ����� ���� ������ �ϱ����� txt ���� ����Ⱑ �ƴ� �̾�⸦ �߽��ϴ�.)
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		LoginView loginView = new LoginView();
		boolean result = loginView.login();
		
		if(result){
			
			DepartmentView departmentView = new DepartmentView();
			departmentView.showDepartmentList();
			departmentView.getDepartmentID(scanner);
			
			LectureView lectureView = new LectureView();
			lectureView.selectLecture(scanner);
			HomeworkView homesubmitView = new HomeworkView();
			homesubmitView.getSubmitList(scanner);
			ScoreView scoreView = new ScoreView();
			scoreView.showScoreList();
		}
	}
}
