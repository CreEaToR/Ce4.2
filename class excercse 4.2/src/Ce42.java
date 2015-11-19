
public class Ce42 {
	
	
	public static void main(String args[]){
		
		int num = 100;
		
	
		
		
		for(int i = 0; i<num;i++){
			
			if(i%2!=0){
				System.out.println("  " + i);
				
			}
			
		}
		
		int x = 0;
		
			do{
			
			System.out.println(x);
			x = x + 2;
			}while(x<=num);
			
			
	int count = 0;
	String star = "*";
	String space = " ";
    
	while(count<5){
		
		if(count==0){
		System.out.println("  "+star+"  ");
		
		}else if(count==1){
			
			System.out.println(" "+star+star+star);
			
		}else if(count==2){
			System.out.println(star+star+star+star+star);
			
		}else if(count==3){
			
			System.out.println(" "+star+star+star);
		}else if(count==4){
			System.out.println("  "+star+"  ");
			
		}
		
		count++;
	}
	

	}
	
		
		
		
	}
		
	


