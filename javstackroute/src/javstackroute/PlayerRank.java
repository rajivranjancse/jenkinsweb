package javstackroute;
import java.util.*;
public class PlayerRank {
public static void main(String ar[])
{
	int iNumPlayer=4;
	int PlayerScore[]= {100,90,90,80};
	int PlayerRank[]=new int[4];
	int iCounter=0;
	int i=0;
	int j=0;
	int k=0;
	int temp=0;
	int iRank=0;
	int m=0;
	
System.out.println("hello");
for(i=0;i<iNumPlayer;i++)
	
	for(j=i+1;j<iNumPlayer;j++)
	{
		if(PlayerScore[i]>PlayerScore[j])
		{
		temp=PlayerScore[i];
		PlayerScore[i]=PlayerScore[j];
		PlayerScore[j]=temp;
		}
	
	
	}
for(i=0;i<iNumPlayer;i++)
{
	iRank=iRank+1;
	PlayerRank[i]=iRank;
System.out.println("Player Score"+PlayerScore[i]+"Player Rank"+iRank);
}
for(i=iNumPlayer-1;i>=0;i--)
{
	
System.out.println("Player Score"+PlayerScore[i]+"Player Rank"+PlayerRank[m]);
m=m+1;
}

}


}
