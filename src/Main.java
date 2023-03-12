public class Main {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
    public static String intToRoman(int num) {
        String[] rom = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder builder = new StringBuilder();
        for(int i = values.length - 1; i >= 0 && num > 0; i--)
        {
            while(num >= values[i])
            {
                num-= values[i];
                builder.append(rom[i]);
            }
        }
        return builder.toString();
    }
}