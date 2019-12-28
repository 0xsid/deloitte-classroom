



public class Code{


public static int resString(String inputStr){

inputStr = inputStr.toLowerCase();
StringBuilder sb = new StringBuilder(inputStr);
sb.reverse();
int len = sb.length();
int count=0;
System.out.println(sb.toString());
for(int i=0;i<len-1;i++){
char x = sb.charAt(i);
switch(x){
case 'a':
 case 'e':
  case 'i':
   case 'o':
    case 'u':
     count++;
       break;
}
}
return count;
}

public static void main(String[] args){
String str = "marmalade";
System.out.println(Code.resString(str));

}

}