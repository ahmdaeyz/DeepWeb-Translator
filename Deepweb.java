import java.util.Scanner;
import java.util.Arrays;
public class Deepweb{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("دخل الكلام بلغة النورميز");
        String normInput = input.nextLine();
        System.out.println("ضيب ويب ي ريء : "+toDeepweb(normInput));
    }
    public static String toDeepweb(String normie){
        String deepWeb="";
        String[] words = normie.split(" ");
        for(int i =0;i<words.length;i++){
            if(words[i].equals("جامد")){
                words[i]="قمد";
            }else if(words[i].equals("؟؟")){
                words[i]="ظظ";
            }else{
                String[] letters = words[i].split("");
                for(int j =0;j<letters.length;j++){
                    if(letters[0].equals("ا")){
                        letters[0]="ء";
                    }
                    switch(letters[j]){
                        case "ص":
                            letters[j]="س";
                            break;
                        case "س":
                            letters[j]="ص";
                            break;
                        case "د":
                            letters[j]="ض";
                            break;
                        case "ض":
                            letters[j]="د";
                            break;
                        case "ك":
                            letters[j]="ق";
                            break;    
                        case "ق":
                            letters[j]="ك";
                            break;
                        case "ز":
                            letters[j]="ظ";
                            break;
                        case "ظ":
                            letters[j]="ز";
                            break;
                        case "ط":
                            letters[j]="ت";
                            break;
                        case "ت":
                            letters[j]="ط";
                            break;                    
                    }
                    words[i]=String.join("",letters);
                } 
                
            }
                deepWeb=String.join(" ",words);
        }
        return deepWeb;
    }
}