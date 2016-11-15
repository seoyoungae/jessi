package entity;

import java.io.*;
import java.util.*;

import valueObject.*;

public class Ingredient {
	private Vector<IngredientInfo> ingredientlist;
	
	public Ingredient(){
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("ingredient.txt"));
			BufferedReader fileReader = new BufferedReader(new FileReader("typeID.txt"));
			int typeID = fileReader.read();
			if(typeID ==1){
				fileWriter.write(1);
				fileWriter.write("�߰��");
				fileWriter.newLine();
				fileWriter.write(2);
				fileWriter.write("�������");
				fileWriter.newLine();
				fileWriter.write(3);
				fileWriter.write("�Ұ��");
				fileWriter.newLine();
				fileWriter.write(4);
				fileWriter.write("����");
				fileWriter.newLine();
				fileWriter.write(5);
				fileWriter.write("�������");
				fileWriter.newLine();
				}else if(typeID==2){
					fileWriter.write(1);
					fileWriter.write("����1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("����2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("����3");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("����4");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("����5");
					fileWriter.newLine();
				}
				else if(typeID==3){
					fileWriter.write(1);
					fileWriter.write("ä��1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("ä��2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("ä��3");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("ä��4");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("ä��5");
					fileWriter.newLine();
				}
				else if(typeID==4){
					fileWriter.write(1);
					fileWriter.write("���1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("���2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("���3");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("���4");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("���5");
					fileWriter.newLine();
				}
			
			fileReader.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public Vector<IngredientInfo> getList() {
		// TODO Auto-generated method stub
		try {
		
			BufferedReader fileReader = new BufferedReader(new FileReader("ingredient.txt"));
			ingredientlist = new Vector<IngredientInfo>();
		    //System.out.println(fileReader.read());
			
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return ingredientlist;
	}

	public void putList(Vector<IngredientInfo> lecutrelist){
	}


	public void setSelectlist(int ingredientID) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt", true));
			for(int i=0; i < ingredientlist.size(); i++){
				if(ingredientlist.get(i).getIngredientID()==ingredientID){
					fileWriter.write(ingredientlist.get(i).getIngredientID());
					fileWriter.write(ingredientlist.get(i).getIngredientName());
					fileWriter.newLine();
					}
				}
			
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Vector<IngredientInfo> getSelectlist() {
		// TODO Auto-generated method stub
		Vector<IngredientInfo> selectlist = new Vector<IngredientInfo>();
		try {
			
			BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
			
		    //System.out.println(fileReader.read());
			
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return selectlist;
		}
}


