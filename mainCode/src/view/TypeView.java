package view;
import java.io.*;
import java.util.*;

import org.w3c.dom.*;

import control.*;

public class TypeView {
	private TypeManager typeManager;
	private Vector<valueObject.TypeInfo> typeList;
	public TypeView(){
		this.typeManager = new TypeManager();
	}

	public void getTypeID(Scanner scanner) throws IOException {
		System.out.print("\n��� ��з� ��ȣ�� �Է��ϼ���: ");
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("typeID.txt"));
			int id = scanner.nextInt();
			fileWriter.write(id);
			fileWriter.newLine();
		
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//scanner.close();
	}

	public void showTypeList() {
		System.out.println("=====����з�����====");
		 this.typeList = typeManager.getList();
			for (int i=0; i<typeList.size(); i++) {
				System.out.print(typeList.get(i).getTypeID());
				System.out.print(", ");
				System.out.println(typeList.get(i).getTypeName());
			}		
	}
}
