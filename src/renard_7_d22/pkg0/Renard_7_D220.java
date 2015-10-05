package renard_7_d22.pkg0;
/*
  @author Bob Renard
  @author dotJPEG
*/
public class Renard_7_D220 {
//challange D22-0
    public static void main(String[] args) {
        //code for running 'somenumber' through the 'divby' method
        for(int somenumber = 0; somenumber <501; somenumber++){
        System.out.print(somenumber + ": ");
        divby(somenumber);
        
               
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
                divby22 = true; //ninja
        }else{
            divby2 = true; //davis
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
        // if/else statements.
        if(divby55){
                System.out.println("Animate this!");
        }else{
            if(divby33){
                System.out.println("Herr Di-rekt-or");
        }else{
            if(divby22){
                System.out.println("Ninja");
        }else{
            if(divby235){
                System.out.println("Team Building");
                }else{
                if(divby35){
                System.out.println("Old School");
                }else{
                if(divby23){
                System.out.println("Chisme");
                }else{
                if(divby5){
                System.out.println("Vidal");
                }else{
                if(divby3){
                System.out.println("Claughton");
                }else{
                if(divby2){
                System.out.println("Davis");
                }else{
                System.out.println("None");
                }}}}}}}}}}}