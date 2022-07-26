/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int person_count,member_count=0;
    public static Family members[]=new Family[50];
	public static void main(String[] args) {
	     
	    Scanner sc=new Scanner(System.in);
	 while(true)
	  {
	    System.out.println();
		System.out.println("        1 -- Add person");
		System.out.println("        2 -- Find pair");
		System.out.println("        3 -- Exit");
		int n=sc.nextInt();
	    switch(n)
	    {
	        case 1:
	            {
	      
	            // name
	            
	            System.out.println("Enter ur name");
	            String in_name=sc.next();
	            int flag=0;
	          for(person_count=0;person_count<member_count;person_count++)
	          {
	              if(members[person_count].name.equals(in_name))
	              {
	                  flag=1;
	                  break;
	              }
	          }
	          if(flag==0)
	          {
	              members[member_count]=new Family();
	              members[person_count].name=in_name;
	              System.out.println("Enter ur gender");
	              String in_gender=sc.next();
	              members[person_count].gender=in_gender;
	              System.out.println(members[person_count].name+members[person_count].gender);
	              member_count++;
	          }
	          
	          //storing current index value 
	          
	          Family newmember =members[person_count];
	          
	          //father name
	          
	          flag=0;
	          System.out.println("Enter ur father name");
	          String in_fathername=sc.next();
	          for(person_count=0;person_count<member_count;person_count++)
	          {
	              System.out.println(person_count);
	              if(in_fathername.equals(members[person_count].name))
	              {
	                  flag=1;
	                  break;
	              }
	          }
	          
	           //System.out.println("hey"+person_count);
	           
	          if(flag==0)
	          {
	              members[member_count]=new Family();
	              members[person_count].name=in_fathername;
	              members[person_count].gender="male";
	              System.out.println(members[person_count].name+members[person_count].gender);
	              member_count++;
	          }
	          
	          // storing cuurent father refernce 
	          
	          Family father = members[person_count];
	          
	          //mother name
	          
	             
	          flag=0;
	          System.out.println("Enter ur mother name");
	          String in_mothername=sc.next();
	          for(person_count=0;person_count<member_count;person_count++)
	          {
	              if(in_mothername.equals(members[person_count].name))
	              {
	                  flag=1;
	                  break;
	              }
	          }
	          if(flag==0)
	          {
	              members[member_count]=new Family();
	              members[person_count].name=in_mothername;
	              members[person_count].gender="female";
	              System.out.println(members[person_count].name+members[person_count].gender);
	              member_count++;
	          }
	          
	          // storing current mother reference
	          
	          Family mother=members[person_count];
	          
	          newmember.fatherName=father;
	          newmember.motherName=mother;
	          father.child[father.childcount++]=newmember;
	          mother.child[mother.childcount++]=newmember;
	                   
	       } 
	       break;
	       case 2:
	         {
	               int flag = 0;
                    int i;
                    System.out.println("Enter the name of pair ");
                    String pairName = sc.next();
                    Family pair=null;
                    for(i=0;i<member_count;i++)
                    {
                        if(pairName.equals(members[i].name))
                        {
                            flag = 1;
                            pair = members[i];
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        break;
                    }
                     int temp=0;
                        for(int j=0;j<pair.fatherName.fatherName.childcount;j++)
                        {
                            if(!pair.fatherName.fatherName.child[j].gender.equals(pair.fatherName.gender))
                            {
                                for(int k=0;k<pair.fatherName.fatherName.child[j].childcount;k++)
                                {
                                    if(!pair.fatherName.fatherName.child[j].child[k].gender.equals(pair.gender))
                                    {
                                        System.out.println(pair.fatherName.fatherName.child[j].child[k].name);
                                        temp=1;
                                    }
                                }
                            }
                        }
                    if(temp==0){
                        System.out.println("Pair not found with father side");
                    }
                    int temp1=0;
                        for(int j=0;j<pair.motherName.motherName.childcount;j++)
                        {
                            if(!pair.motherName.motherName.child[j].gender.equals(pair.motherName.gender))
                            {
                                for(int k=0;k<pair.motherName.motherName.child[j].childcount;k++)
                                {
                                    if(!pair.motherName.motherName.child[j].child[k].gender.equals(pair.gender))
                                    {
                                        System.out.println(pair.motherName.motherName.child[j].child[k].name);
                                        temp=1;
                                    }
                                }
                            }
                        }
                    if(temp1==0){
                        System.out.println("Pair not found with mother side");
                    }
	         }
	         break;
	         case 3:
	             break;
	     }
	  }
		           
	
	}
}

