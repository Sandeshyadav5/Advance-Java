package com.rays.jdbc.preparedstatement;

public class TestMarksheetModel {
	public static void main(String[] args) throws Exception {
		//adds();
		total();
	}
	public static void adds() throws Exception{
		MarksheetModel models=new MarksheetModel();
		MarksheetBean beans= new MarksheetBean();
		
		beans.setId(1);
		beans.setRollNo(33634587);
		beans.setName("sandesh");
		beans.setChem(76);
		beans.setPhy(89);
		beans.setMaths(98);
		models.adds(beans);
	}
	public static void total() throws Exception{
		MarksheetModel models=new MarksheetModel();
		MarksheetBean beans= new MarksheetBean();
		models.total(beans);
	}
}
