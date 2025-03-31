// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] ar=s.split("\\s+");
        Map<String, Integer>map=new LinkedHashMap<>();
        for(String word:ar){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        List<String>li=new ArrayList<>();
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                li.add(entry.getKey());
            }
        }
        if(li.isEmpty()){
            System.out.print("No repeated words");
        }
        else{
            for(String words:li){
                System.out.println(words);
            }
        }
    }
}