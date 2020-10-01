import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("");

        Date data = new Date();
        System.out.println("A Data de hoje é :"+data.toString());
        System.out.println("");

        Locale idioma = Locale.getDefault();
        System.out.println("O Idioma do seu Sistema é "+idioma.getDisplayLanguage());
        System.out.println("");

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanho = tk.getScreenSize();
        System.out.println("A tela possui Resolução de "+tamanho.width+" x "+tamanho.height+".");

    }
}
