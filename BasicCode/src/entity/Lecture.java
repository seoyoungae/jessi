package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import valueObject.LectureInfo;

public class Lecture {
	private Vector<LectureInfo> lecturelist;
	
	public Lecture(){
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("lecture.txt"));
			BufferedReader fileReader = new BufferedReader(new FileReader("departmentID.txt"));
			int departmentID = fileReader.read();
			if(departmentID ==1){
				fileWriter.write(1);
				fileWriter.write("C���");
				fileWriter.newLine();
				fileWriter.write(2);
				fileWriter.write("C++");
				fileWriter.newLine();
				fileWriter.write(3);
				fileWriter.write("�ڷᱸ��");
				fileWriter.newLine();
				fileWriter.write(4);
				fileWriter.write("�����ͺ��̽�");
				fileWriter.newLine();
				fileWriter.write(5);
				fileWriter.write("Java");
				fileWriter.newLine();
				}else if(departmentID==2){
					fileWriter.write(1);
					fileWriter.write("��������");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("���༳��");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("���м���");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("�����ΰ�����");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("���氳��");
					fileWriter.newLine();
				}
				else if(departmentID==3){
					fileWriter.write(1);
					fileWriter.write("��������");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("���������");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("����а���");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("����1");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("����ȸȭ1");
					fileWriter.newLine();
				}
				else if(departmentID==4){
					fileWriter.write(1);
					fileWriter.write("������1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("������2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("�����н���1");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("�����н���2");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("ȸ���̷�");
					fileWriter.newLine();
				}
				else if(departmentID==5){
					fileWriter.write(1);
					fileWriter.write("����");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("�౸");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("�״Ͻ�");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("�ʶ��׽�");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("ȭ���ǰ���");
					fileWriter.newLine();
				}
			
			fileReader.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public Vector<LectureInfo> getList() {
		// TODO Auto-generated method stub
		try {
		
			BufferedReader fileReader = new BufferedReader(new FileReader("lecture.txt"));
			lecturelist = new Vector<LectureInfo>();
		    //System.out.println(fileReader.read());
			
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return lecturelist;
	}

	public void putList(Vector<LectureInfo> lecutrelist){
	}


	public void setSelectlist(int lectureID) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt", true));
			for(int i=0; i < lecturelist.size(); i++){
				if(lecturelist.get(i).getLectureID()==lectureID){
					fileWriter.write(lecturelist.get(i).getLectureID());
					fileWriter.write(lecturelist.get(i).getLectureName());
					fileWriter.newLine();
					}
				}
			
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Vector<LectureInfo> getSelectlist() {
		// TODO Auto-generated method stub
		Vector<LectureInfo> selectlist = new Vector<LectureInfo>();
		try {
			
			BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
			
		    //System.out.println(fileReader.read());
			
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return selectlist;
		}
}


