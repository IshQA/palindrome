public class CheckIfPalindrome {

    public static String stringWithoutPunctuation (String str){
        StringBuilder builder = new StringBuilder();
        for (int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)){
                builder.append(c);
            }
        }
        String withoutPunctuation = builder.toString();
        withoutPunctuation = withoutPunctuation.toUpperCase();
        return withoutPunctuation;
    }

    public static boolean isCharTheSame(String str){
        for(int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--){
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome (String str){
        str = stringWithoutPunctuation(str);
        return isCharTheSame(str);
    }


}
