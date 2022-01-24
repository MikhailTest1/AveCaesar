import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class Caesar {
    public static void main(String[] args) {
        String text = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
            int shift = 0;
            char[] stringOfLetters = text.toLowerCase().toCharArray();
            char[] chars = new char[stringOfLetters.length];
            for (int k = 0; k < 33; k++) {
                for (int i = 0, j = 0; i < stringOfLetters.length; i++) {
                    if (stringOfLetters[i] == ' ' || stringOfLetters[i] == ',' || stringOfLetters[i] == '.') {
                        chars[j] = stringOfLetters[i];
                    } else {
                        chars[j] = getLetters(stringOfLetters[i], shift);
                    }
                    j++;
                }
                System.out.println(new String(chars)+ "\n");
                shift++;
            }
        }
        static char getLetters(char sym, int shift) {
            char newSymbol = 0;
            char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н',
                    'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
            for (int i = 0; i < alphabet.length; i++) {
                if (sym == alphabet[i]) {
                    if ((alphabet.length - 1) - i >= shift) {
                        newSymbol = alphabet[i + shift];
                    } else {
                        int count = shift - ((alphabet.length - 1) - i);
                        newSymbol = alphabet[count - 1];
                    }
                }
            }
            return newSymbol;
        }
    }

