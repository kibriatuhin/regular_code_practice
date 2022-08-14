package recursion;

public class RemoveX {
    static void moveAll(String str , int index ,int count, char element , String newStr){
        if (index == str.length()){
            for (int i=0 ; i<count ; i++){
                newStr += "x";
            }
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == element){
            count++;
            moveAll(str,index+1,count , element,newStr);
        }else {
            newStr +=currentChar;
            moveAll(str,index+1,count,element,newStr);
        }
    }
    public static void main(String[] args) {
        moveAll("abxcxxd",0,0,'x',"");
    }
}
