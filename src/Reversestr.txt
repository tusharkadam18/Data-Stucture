import java.io.*;
public class ReverseStr {
    public static void main(String[] args) throws IOException {
        BufferedReader source = new BufferedReader(new FileReader("E:\\DataStuctureAndAlgorithms\\Day1\\ADSArrays\\src\\ReverseStr.java"));
        PrintWriter dest = new PrintWriter(new BufferedWriter(new FileWriter("Reversestr.txt")));
        String line = source.readLine();
        while(line != null){
            dest.println(line);
            line = source.readLine();
        }
        dest.close();
        source.close();
        String s = "Tushar";
        char[] ch = s.toCharArray();
        char[] arr = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            for (int j = arr.length - 1 - i ; j >=0 ; j--) {
                arr[j] = ch[i];
            }
        }
        String s1 = String.valueOf(arr);
        if(s.equals(s1)){
            System.out.println("The given strings reverse is same as original string.");
        }
        else{
            System.out.println("The given string's reverse is not same as original string.");
        }
    }
}
