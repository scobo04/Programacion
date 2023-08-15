package cinebox;

public class Arrays_Strings {

    public static void main(String[] args) {

        String[] movieTitleArray = {"Up", "Titanic", "Aladdin", "Pepe el toro", "Avengers", "Matrix"};

        for (String title : movieTitleArray) {

            if (!title.contains("i")) {

                System.out.println(title);

            }

        }

    }

}
