package com.wjjjjjj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shixian {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Fengzhuang> list = new ArrayList<Fengzhuang>();
		DDDDDD d = new Fangfa();
		while(true){
			System.out.println("1.¼��߿��ɼ�;\t2.��ʾ���п�����Ϣ;\t3.��ѯ��߷�;\t4.�˳�\n������");
			int i = sc.nextInt();
			if(i==1){
				d.one(list, sc);
			}else if(i==2){
				d.two(list);
			}else if(i==3){
				d.three(list, sc);
			}else if(i==4){
				System.out.println("ллʹ��!");
				break;
			}else{
				System.out.println("�Բ��������������������롣");
			}
			
		}
	}

}
