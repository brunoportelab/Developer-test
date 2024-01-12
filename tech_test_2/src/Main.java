public class Main {
    public static void main(String[] args) {
        String simpleString = "A string that contains quite a few spaces. ";

        StringBuilder noSpaceString = new StringBuilder();

        System.out.println("Initial String: " + simpleString);

        for (int i = 0; i < simpleString.length(); i++) {
            char caractere = simpleString.charAt(i);

            if (caractere != ' ') {
                noSpaceString.append(caractere);
            }
        }
        System.out.println("Edited String: " + noSpaceString);
    }
}