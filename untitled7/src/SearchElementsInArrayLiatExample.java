import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayLiatExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        System.out.println("Does names array contain \"Bob\" ?:" + names.contains("Bob"));
        System.out.println("index0f\"steve\":"+ names.indexOf("steve"));
        System.out.println("index0f\"Mark\":"+ names.indexOf("Mark"));
        System.out.println("lastIndex0f \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndex0f \"Bill\" : " + names.lastIndexOf("Bill"));
    }
}



