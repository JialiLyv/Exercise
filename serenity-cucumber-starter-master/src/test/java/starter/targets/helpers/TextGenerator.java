package starter.targets.helpers;

import java.util.Random;

public enum TextGenerator {


    TEXT_FIRSTNAME {
        public String toString() {
            return generateName(5);
        }
    },

    TEXT_MIDDLENAME {
        public String toString() {
            return generateName(5);
        }
    },

    TEXT_LASTNAME {
        public String toString() {
            return generateName(9);
        }
    },

    TEXT_ORGNAME {
        public String toString() {
            return TextGenerator.generateOrgName();
        }
    };

    final static String lowerVowels = "aeiou";
    final static String lowerConsonants = "bcdfghjklmnpqrstvwxyz";
    final static String upperConsonants = "BCDFGHJKLMNPQRSTVWXYZ";

    private static String generateName(int length) {
        Random random = new Random();
        StringBuilder generatedName = new StringBuilder();
        generatedName.append(upperConsonants.charAt(random.ints(0, upperConsonants.length()).findFirst().getAsInt()));
        while (generatedName.toString().length() < length) {
            generatedName.append(lowerVowels.charAt(random.ints(0, lowerVowels.length()).findFirst().getAsInt()));
            generatedName.append(lowerConsonants.charAt(random.ints(0, lowerConsonants.length()).findFirst().getAsInt()));
        }
        return generatedName.toString();
    }

    private static String generateOrgName() {
        Random random = new Random();
        StringBuilder generatedOrgName = new StringBuilder();
        String[] orgSuffix = {"Organization", "Project", "Society", "Foundation", "College", "Fund", "Institute", "Association"};
        generatedOrgName.append(upperConsonants.charAt(random.ints(0, upperConsonants.length()).findFirst().getAsInt()));
        while (generatedOrgName.toString().length() < 7) {
            generatedOrgName.append(lowerVowels.charAt(random.ints(0, lowerVowels.length()).findFirst().getAsInt()));
            generatedOrgName.append(lowerConsonants.charAt(random.ints(0, lowerConsonants.length()).findFirst().getAsInt()));
        }
        generatedOrgName.append(" ");
        generatedOrgName.append(orgSuffix[random.nextInt(orgSuffix.length)]);
        return generatedOrgName.toString();
    }
}