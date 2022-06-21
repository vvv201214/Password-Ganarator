package Main;

import java.util.*;

public class Procceser {
    final List<Character> passwordChars = List.of('!','@','#','$','%','^','&','*','1','2','3','4','5','6','7','8','9','0','a','A','s','S','d','D','f','F'
            ,'g','G','h','H','j','J','k','K','l','L','q','Q','w','W','e','E','r','R','t','T','y','Y','u','U','i','I','o','O','p','P');

    public String randomNumber(){
        StringBuilder str = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        for(int i = 0; i < n; i++){
            int a = random.nextInt(passwordChars.size());
            str.append(passwordChars.get(a));
        }
        return str.toString();
    }
}