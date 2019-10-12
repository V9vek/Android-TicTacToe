package tictactoegame;

public class ttc {
	public final int X=1,O=-1;
	public int player;
	int empty=0,flag;
	int board[][]=new int [3][3];
	
	public void putXO(int x,int y)
	{
		if(x<0  || x>2 || y<0 || y>2)
		{
			System.out.println("you are not in the board");
			return ;
			
		}
		
		if(board[x][y] != empty)
		{
			System.out.println("Given place is already occupied");
			return ;
			
		}
		
		
		board[x][y]=player;
		player=-player;

	}
	

	
	public boolean check()
	{
		for (int i=0;i<3;++i)
		{
			 for(int j=0;j<3;++j)
			 {
				   if(board[i][j]==empty)
					   return true;
			 }
		}
		
		return false;
	}
	
	
	
	
	public boolean win(int player)
	{
		
			return  ((board[0][0] + board[1][1] + board[2][2]  ==  player*3)  ||
					 (board[0][2] + board[1][1] + board[2][0]  ==  player*3)  ||
					 (board[0][0] + board[1][0] + board[2][0]  ==  player*3)  ||
					 (board[0][1] + board[1][1] + board[2][1]  ==  player*3)  ||
					 (board[0][2] + board[1][2] + board[2][2]  ==  player*3)  ||
					 (board[0][0] + board[0][1] + board[0][2]  ==  player*3)  ||
					 (board[1][0] + board[1][1] + board[1][2]  ==  player*3)  ||
					 (board[2][0] + board[2][1] + board[2][2]  ==  player*3)  
					); 
	
	}
	
	
	
	public void diswin()
	{
		
		if(win(X))
			 System.out.println(" X wins.....!!!!!!!!!!!!!");
		
		 if(win(O))
			 System.out.println(" O wins.....!!!!!!!!!!!!!");
		 
		if(flag==1)
			System.out.println("TIED.....");
	}
	
	
	
	public void displayboard()
	{
		char bo[][]=new char[3][3];
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				if(board[i][j]==1)
					{flag=1;
					 bo[i][j]='X';}
				
				if(board[i][j]==-1)
					{flag=1;
					  bo[i][j]='O';
					}
				if(board[i][j]==0)
					{ flag=0;
					  bo[i][j]='_';
					}
			}
		}
		
		for(int i=0;i<3;++i)
			{
			   for(int j=0;j<3;++j)
			    	System.out.print(bo[i][j] + " ");
			   
			   System.out.println();
			   
			}  
	}
	
}
