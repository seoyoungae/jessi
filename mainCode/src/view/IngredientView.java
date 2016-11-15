package view;
import java.util.Scanner;
import java.util.Vector;

import control.IngredientManager;
import valueObject.IngredientInfo;

public class IngredientView {
	private IngredientManager  ingredientManager;
	private Vector<IngredientInfo> ingredientList;
	private Vector<IngredientInfo> selectList;
	
	public IngredientView(){
		this.ingredientManager = new IngredientManager();
		this.ingredientList = new Vector<IngredientInfo>();
		this.selectList = new Vector<IngredientInfo>();
	}

	public void selectIngredient(Scanner scanner) {
		// TODO Auto-generated method stub
		ingredientList = this.ingredientManager.getList();
		for(int i=0;  i < ingredientList.size(); i++){
			System.out.println("              ");
			System.out.println("====��ἱ��â====");
			for (int j=0; j < ingredientList.size(); j++){
				System.out.print(ingredientList.get(j).getIngredientID());
				System.out.print(", ");
				System.out.println(ingredientList.get(j).getIngredientName());
			}
			System.out.print("\n��Ḧ �����ϼ���: ");
			int ingredientID = scanner.nextInt();
			ingredientManager.setSelectlist(ingredientID);
		}
	}
}
