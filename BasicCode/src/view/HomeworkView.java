package view;

import java.util.Scanner;
import java.util.Vector;

import control.HomeworkManager;
import control.LectureManager;
import valueObject.LectureInfo;

public class HomeworkView {
	private HomeworkManager homeworkManager;
	private LectureManager lectureManager;
	private Vector<LectureInfo> submitList;
	public HomeworkView(){
		this.homeworkManager = new HomeworkManager();
		this.lectureManager = new LectureManager();
	}
	

	public void getSubmitList(Scanner scanner) {
		this.showHomeworkList();
		System.out.print("������ �Է��ϼ���: ");
		int lectureid = scanner.nextInt();
		homeworkManager.SubmitHomework(lectureid);
	}
	
	public void showHomeworkList() {
		// TODO Auto-generated method stub
		System.out.println("                        ");
		System.out.println("====�����Ͻ� ������ �����ϼ���====");
		submitList = homeworkManager.getList();
		for (int i=0; i < submitList.size(); i++){
			System.out.print(submitList.get(i).getLectureID());
			System.out.print(", ");
			System.out.println(submitList.get(i).getLectureName());
			}
		}
	
	
	}
