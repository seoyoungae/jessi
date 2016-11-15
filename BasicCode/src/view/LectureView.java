package view;
import java.util.Scanner;
import java.util.Vector;

import control.LectureManager;
import valueObject.LectureInfo;

public class LectureView {
	private LectureManager  lectureManager;
	private Vector<LectureInfo> lectureList;
	private Vector<LectureInfo> selectList;
	
	public LectureView(){
		this.lectureManager = new LectureManager();
		this.lectureList = new Vector<LectureInfo>();
		this.selectList = new Vector<LectureInfo>();
	}

	
	public void selectLecture(Scanner scanner) {
		// TODO Auto-generated method stub
		lectureList = this.lectureManager.getList();
		for(int i=0;  i < lectureList.size(); i++){
			System.out.println("              ");
			System.out.println("====������â====");
			for (int j=0; j < lectureList.size(); j++){
				System.out.print(lectureList.get(j).getLectureID());
				System.out.print(", ");
				System.out.println(lectureList.get(j).getLectureName());
			}
			System.out.print("������ �Է��ϼ���: ");
			int lectureID = scanner.nextInt();
			lectureManager.setSelectlist(lectureID);
			
		}
	}
	
	
//	
//	public void showLectureList()  {
//		// TODO Auto-generated method stub
//			System.out.println("              ");
//			System.out.println("====������â====");
//			lectureList = this.lectureManager.getList();
//			for (int i=0; i < lectureList.size(); i++){
//				System.out.print(lectureList.get(i).getLectureID());
//				System.out.print(", ");
//				System.out.println(lectureList.get(i).getLectureName());
//			}
//			System.out.print("������ �Է��ϼ���: ");
//
//	}
}
