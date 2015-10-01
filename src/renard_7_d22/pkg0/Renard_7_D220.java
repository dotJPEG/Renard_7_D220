package renard_7_d22.pkg0;
/*
  @author Bob Renard
  @author dotJPEG
*/
public class Renard_7_D220 {
//challange D22-0
    public static void main(String[] args) {
        for(int somenumber = 0; somenumber <500; somenumber++){
            
        }
    }
        //base for term identification
    static void divby (int somenumber) {
        boolean divby2 = false; 
        boolean divby22 = false; 
        boolean divby3 = false; 
        boolean divby33 = false; 
        boolean divby5 = false; 
        boolean divby55 = false; 
        boolean divby23 = false;
        boolean divby35 = false;
        boolean divby235 = false;
        
        //term identification
        
        if(somenumber % 2 == 0){
            if(somenumber % 22 == 0){
                divby22 = true; //davis                
        }else{
            divby2 = true; //ninja            
       }
       }
        if(somenumber % 3 == 0){
            if(somenumber % 33 == 0){
                divby33 = true; //herr direktor               
        }else{
            divby3 = true; //claughton          
       }
       }
        if(somenumber % 5 == 0){
            if(somenumber % 55 == 0){
                divby55 = true; //animate this!              
        }else{
            divby5 = true; //vidal          
       } 
       }
        if(somenumber % 2 == 0 && somenumber % 3 == 0){
            divby23 = true; //chisme          
       }
        if(somenumber % 3 == 0 && somenumber % 5 == 0){
            divby35 = true; //old school      
       }
        if(somenumber % 2 == 0 && somenumber % 3 == 0 && somenumber % 5 == 0){
            divby235 = true; //team building          
       }
    }
}