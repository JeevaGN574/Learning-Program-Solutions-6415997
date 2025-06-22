import java.util.*;

public class EcommercePlatformSearch {
    public static List<String> searchProducts(List<String> products, String keyword) {
        List<String> result = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (String product : products) {
            if (product.toLowerCase().contains(keyword)) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList(
                "Samsung Galaxy S21",
                "iPhone 13",
                "OnePlus 11",
                "Redmi Note 12",
                "Sony Headphones",
                "Apple Watch");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine();

        List<String> results = searchProducts(products, keyword);

        if (results.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("Search results:");
            for (String item : results) {
                System.out.println("- " + item);
            }
        }
    }
}
