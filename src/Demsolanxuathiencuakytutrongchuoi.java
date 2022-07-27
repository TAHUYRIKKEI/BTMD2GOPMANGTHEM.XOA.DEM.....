import java.util.Scanner;

public class Demsolanxuathiencuakytutrongchuoi {
    public static int check (String array, char x){
        int count = 0;
        char[] ch = array.toCharArray();
        for(int i = 0; i < array.length(); i++){
            if (ch[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        System.out.println("enter string: ");
        str= scanner.nextLine();
        System.out.println("Enter character: ");
        char ch = scanner.next().charAt(0);
        char c = Character.toLowerCase(ch);
        System.out.println("Số lần xuất hiện của kí tự " + c + " trong mảng là: " + check(str.toLowerCase(),c));
    }


}
