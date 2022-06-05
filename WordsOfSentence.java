public class WordsOfSentance

{

public static void main(String[] args)

{

//String s2 = "This is a text and we should print each word";

String s2;

int i;

int j;

static Scanner sc=new Scanner(System.in );

System.out.println("your Sentance as input: ");

s2=sc.nextLine();

for (i = 0; i <= s2.length(); i++)

{

if (s2.substring(i).startsWith(" ") || i == 0)

{

//here I search for the start of the sentence or " "

for (j = i + 1; j <= s2.length(); j++)

{

if (s2.substring(j).startsWith(" ") || j == s2.length())

{

//here I search for the next " " or the end of the sentence

System.out.println(s2.substring(i, j));

//printing

i = j;

//i=j because the next search must be done from where we left

}

}

}

}

}

}
