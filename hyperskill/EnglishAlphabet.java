
public class EnglishAlphabet {

        public static StringBuilder createEnglishAlphabet() {
            StringBuilder sb = new StringBuilder();
            for (char current = 'A'; current <= 'Z'; current++) {
                if (current != 'Z') {
                    sb.append(current + " ");
                }
                else {
                    sb.append(current);
                }
            }

            return sb;
        }

        public static void main(String[] args) {
            System.out.println(createEnglishAlphabet());
        }

}
