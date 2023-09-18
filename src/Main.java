import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char menu;
        System.out.println("Hej! Vad vill du göra?");
        do {
            System.out.println("1. Addera två tal");
            System.out.println("2. Räkna bokstäver i en sträng");
            System.out.println("3. Spegelvänd en sträng");
            System.out.println("4. Summera alla tal i en sträng");
            System.out.println("5. Avsluta programmet genom att skriva e");
            menu = scan.next().charAt(0);
            switch (menu) {

                case '1': {

                    System.out.println("Då adderar vi två tal. Skriv in två tal, tack!");
                    addNumbers(scan.nextInt(), scan.nextInt());
                    break;
                }
                case '2':
                    scan.nextLine();

                    System.out.println("Här räknar vi frekvensen av en bokstav i en sträng");
                    System.out.println("Skriv ut en sträng");
                    String text = scan.nextLine();

                    System.out.println("Vilken bokstav vill du ta?");
                    char letter = scan.nextLine().charAt(0);
                    int answer = freqOfLetter(text, letter);
                    break;

                case '3':
                    scan.nextLine();
                    System.out.println("Då ska vi spegelvända en sträng. Skriv en sträng!");
                    String word = scan.nextLine();
                    String reversedString = reverseString(word);
                    System.out.println(reversedString);
                    break;

                case '4':
                    scan.nextLine();
                    System.out.println("Skriv in en sträng av siffror");
                    String stringNumber = scan.nextLine();
                    int answer2 = sumStringOfNumbers(stringNumber);
                    break;
                case 'e':
                    System.out.println("Då avslutar vi programmet");
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen!");
                    break;
            }
        } while(menu!='e');

    }
    
    static int addNumbers(int number1, int number2) {

        System.out.println("Första talet: " + number1);
        System.out.println("Andra talet: " + number2);
        int sum = number1 + number2;
        System.out.println("Summan av talen är " + sum);
        return sum;
    }
    static int freqOfLetter(String input, char letter) {


        int freqOfLetter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (letter == input.charAt(i)) {
                freqOfLetter++;

            }
        }
        System.out.println("Så här många gånger förekommer bokstaven " + letter + ": ");
        if (freqOfLetter > 1) {
            System.out.println(+freqOfLetter + " gånger");
        } else {
            System.out.println(freqOfLetter + " gång");
        }
        return freqOfLetter;
    }
    public static String reverseString(String str) {
        System.out.print("Den spegelvända strängen: ");
        String answer="";
        for (int i = str.length() - 1; i + 1 > 0; i--) {
            answer+=str.charAt(i);
        }
        return answer;
    }
    public static int sumStringOfNumbers(String stringNumber)
    {
        int sum = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            char ch = stringNumber.charAt(i);
            int number = ch - '0';
            System.out.print(number);
            sum += number;

            if (i < stringNumber.length() - 1) {
                System.out.print("+");
            }
        }
        System.out.print("=" + sum);
        return sum;
    }
}