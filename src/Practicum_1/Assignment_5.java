package Practicum_1;

public class Assignment_5 {
    public static void main(String[] args) {
        String text= "";
        for(int count=1; count<4; count++){
            text = text.concat("s");
            System.out.println(text);
            if(text.length() > 1) {
                text = "s";
                System.out.println(text);
            }
        }
    }
}

