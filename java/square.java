public class Square {    
    public static boolean isSquare(int n) {        
      for(int i = 0; i <= n; ++i){
        if(i*i == n){ return true;}
        if(i*i > n){ return false;}
      }  
      return false;
    }
}
