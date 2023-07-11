package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    //aeiouAEIOU

    public void vowelDeterminer(char character) {

        if (!(character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z'))
            System.out.println("wrong alphabet!");
        else {
            String vowels = "aeiouAEIOU";
            boolean isVowel = false;
            for (int i = 0; i < vowels.length(); i++) {
                if (character == vowels.charAt(i)) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel) System.out.println("Vowel");
            else System.out.println("Consonant");
        }
    }


}
