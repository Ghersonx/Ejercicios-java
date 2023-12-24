public class invertir_1 {
    
   public int invertir(int n,int m) { 
      int invertido; 
      if (n == 0) { 
         invertido = m; 
      } else { 
         invertido = invertir(n / 10, m * 10 + n % 10); 
      } 
      return invertido; 
   }
   

}
   

