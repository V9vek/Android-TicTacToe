package tictactoegame;

import java.util.*;   

public class ttcmain {

	public static void main(String[] args) {
		 System.out.println("First one to begin is X");
	
		 
		 ttc t=new ttc();
		 t.player=1;
		 
		 for(int i=0;i<3;++i)
			 for(int j=0;j<3;++j)
				 t.board[i][j]=0;
		 
		 int a,b;
		 Scanner s= new Scanner(System.in);
		 
		do
		{
			System.out.println("Enter the coordinates in the board");
			a=s.nextInt();
			b=s.nextInt();
			
			t.putXO(a, b);
			
			t.displayboard();
			
			t.diswin();
			
		}while(t.check());

		
	}

}
