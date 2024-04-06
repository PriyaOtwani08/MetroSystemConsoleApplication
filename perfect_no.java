import java.util.*;
public class no_of_factors {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i*i<=n;i++){
        if(n%i==0) {
          if(i!=n/i){
            System.out.println(i);
            System.out.println(n/i);
       } 
     }
  }
}
}
