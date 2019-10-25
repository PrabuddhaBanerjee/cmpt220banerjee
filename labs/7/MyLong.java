
public class MyLong {
	
	 private long value;
	  MyLong(long value){
	      this.value = value; 
	  }
	  public long getLong(){
	    return value;
	  }
	  public boolean isEven(){
	    if(value % 2 == 0)
	      return true;
	    else return false;
	  }
	  public boolean isOdd(){
	    if(value % 2 != 0)
	    return true;
	    else return false;
	  }
	  public boolean isPrime(){
	    long m = value/2;
	    int flag = 0;
	      if((value == 0)||(value == 1)){
	      return false;
	    }
	    else{
	      for(int i=2; i<=m ; i++){
	        if(value % i == 0){
	          flag=1;
	          break;
	        }
	      }
	      if(flag == 0){
	      return true;
	      }
	      else return false;
	    }
	   }
	   public static boolean isEven(long val){
	     if(val % 2 == 0)
	      return true;
	    else return false; 
	  }
	  public static boolean isOdd(long val){
	    if(val % 2 != 0)
	      return true;
	    else return false;
	  }
	  public static boolean isPrime(long val){
	    long m = val/2;
	    int flag = 0;
	      if((val == 0)||(val == 1)){
	      return false;
	    }
	    else{
	      for(int i=2; i<=m ; i++){
	        if(val % i == 0){
	          flag=1;
	          break;
	        }
	      }
	      if(flag == 0){
	      return true;
	      }
	      else return false;
	    }
	  }
	   public boolean isEven(MyLong val){
	    return val.isEven(val); 
	  }
	  public boolean isOdd(MyLong val){
	    return val.isOdd(val);
	  }
	  public boolean isPrime(MyLong val){
	    return val.isPrime(val.value);
	  }
	  public boolean equals(long val){
	    return val == value;
	  }
	  public boolean equals(MyLong val){
	    return val.getLong()==value;
	  }
	  public static void parseLong(char[] arr){
	    String str = "";
            for (int i = 0; i < arr.length; i++) {
	      str += arr[i];
	    }
	    System.out.println("In array of char[]:"+Long.parseLong(str));      
	  }
	  public static void parseLong(String str){
		  System.out.println("In String:"+Long.parseLong(str));  
	  }
	  
	
}
