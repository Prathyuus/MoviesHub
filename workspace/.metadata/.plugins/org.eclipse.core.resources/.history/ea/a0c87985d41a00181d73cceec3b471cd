package razo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QuerySolver extends SQLow
{
	int id;
	int season;
	String city;
	Date date;
	String team1;
	String team2;
	String toss_winner;
	String toss_decision;
	String result;
	int dl_applied;
	String winner;
	int win_by_runs;
	int win_by_wickets;
	String player_of_match;
	String venue;
	String umpire1;
	String umpire2;
	String umpire3;
	
	public void mn() throws ParseException, FileNotFoundException{
       String[] f=new String[100000];
       int row=578;
   	int col=18;
       String[][] td=new String[row][col];
       int p=0;
       int k=0;
       
       try
       {
	       FileReader ip=new FileReader("/home/sapient/Documents/ipl1.csv");
	       try
	       {
		       Scanner parser=new Scanner(ip);
		       while(parser.hasNextLine())
		       {
		           String line=parser.nextLine();
		           String[] att=line.split(",");
		           for(int q=0;q<att.length;q++)
		           {
		               f[p]=att[q];
		               p++;
		           }
		       }
	       }
		    finally
       {
           ip.close();
       }
       }
       
       catch(FileNotFoundException e)
       {
           System.out.println("File not found "+e);
       }
       catch(IOException e)
       {
           System.out.println("Unexpected I/O error "+e);
       }
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {
              td[i][j]=f[k];
              k++;
          }
      }
     /*for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {
              System.out.println(td[i][j]);
          }
      }*/
      
      QuerySolver[] obj=new QuerySolver[578];
      for (int i=1;i<row;i++)
         obj[i]= new QuerySolver();
      try {
      for (int i=1;i<row;i++)
      {
    	  obj[i].id=Integer.parseInt(td[i][0]);
    	  obj[i].season=Integer.parseInt(td[i][1]);
    	  obj[i].city=td[i][2];
    	  obj[i].date=new SimpleDateFormat("yyyy-MM-dd").parse(td[i][3]);
    	  obj[i].team1=td[i][4];
    	  obj[i].team2=td[i][5];
    	  obj[i].toss_winner=td[i][6];
    	  obj[i].toss_decision=td[i][7];
    	  obj[i].result=td[i][8];
    	  obj[i].dl_applied=Integer.parseInt(td[i][9]);
    	  obj[i].winner=td[i][10];
    	  obj[i].win_by_runs=Integer.parseInt(td[i][11]);
    	  obj[i].win_by_wickets=Integer.parseInt(td[i][12]);
    	  obj[i].player_of_match=td[i][13];
    	  obj[i].venue=td[i][14];
    	  obj[i].umpire1=td[i][15];
    	  obj[i].umpire2=td[i][16];
    	  obj[i].umpire3=td[i][17];
      }}
      catch(NumberFormatException ex){ // handle your exception
    	 ex.printStackTrace();  
    	}
      
    	  for (int i=1;i<row;i++)
	      {
	    	  System.out.println(obj[i].id);
	    	  System.out.println(obj[i].season);
	    	  System.out.println(obj[i].city);
	    	  System.out.println(obj[i].date);
	    	  System.out.println( obj[i].team1);
	    	  System.out.println(obj[i].team2);
	    	  System.out.println( obj[i].toss_winner);
	    	  System.out.println(obj[i].toss_decision);
	    	  System.out.println(obj[i].result);
	    	  System.out.println(obj[i].dl_applied);
	    	  System.out.println(obj[i].winner);
	    	  System.out.println(obj[i].win_by_runs);
	    	  System.out.println(obj[i].win_by_wickets);
	    	  System.out.println(obj[i].player_of_match);
	    	  System.out.println(obj[i].venue);
	    	  System.out.println(obj[i].umpire1);
	    	  System.out.println(obj[i].umpire2);
	    	  System.out.println(obj[i].umpire3);
	      }
    	  //Scanning the header from the file	 
    	  FileReader ip=new FileReader("/home/sapient/Documents/sipl1.csv");
    		 Scanner parser=new Scanner(ip);
    		 String hdr=parser.nextLine();
    		 String[] header=hdr.split(",");
    		 /*System.out.println("Enter the query:");
    		   	Scanner scanner = new Scanner(System.in);
    			String qry = scanner.nextLine();*/
    		    QueryParser objj=new QueryParser();
    		    String[] spqry= objj.splqry(qry);
    		
    		 QueryParser obj1=new QueryParser();
    		 String[] sel=obj1.aggselp(spqry);
    		 String[] rest=obj1.restrictions(spqry, qry);
    		 String con =rest[0];
    	
    		 String[] rest2=con.split(" ");
    		 String con1=rest2[0];
    		 String con2=rest2[1];
    		 String con3=rest2[2];
    		 System.out.println(con1+con2+con3);
    		 
    		 
    				 Queryexec obj2=new Queryexec();
    		 for(int var=0;var<sel.length;var++)//iterating for all the conditions
    		  {obj2.execute(header,sel[var],td,con1,con2,con3);}
}
}
