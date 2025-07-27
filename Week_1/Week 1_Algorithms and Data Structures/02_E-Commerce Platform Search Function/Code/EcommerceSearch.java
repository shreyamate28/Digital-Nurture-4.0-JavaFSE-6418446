import java.util.Scanner;
import java.util.Arrays;

class Product {
    int productId;
    String productName;
    String productCategory;

    Product(int productId, String productName, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + productCategory;
    }
}

public class EcommerceSearch {
    public static Product searchUsingLinear(Product[] productList, int searchId) {
        for (Product product : productList) {
            if (product.productId == searchId) {
                return product;
            }
        }
        return null;
    }

    public static Product searchUsingBinary(Product[] productList, int searchId) {
        int start = 0;
        int end = productList.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            int currentId = productList[middle].productId;

            if (currentId == searchId) {
                return productList[middle];
            } else if (currentId < searchId) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine();

        Product[] productList = new Product[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");

            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter product category: ");
            String productCategory = scanner.nextLine();

            productList[i] = new Product(productId, productName, productCategory);
        }

        Arrays.sort(productList, (a, b) -> a.productId - b.productId);

        System.out.print("\nEnter product ID to search: ");
        int searchId = scanner.nextInt();

        Product resultLinear = searchUsingLinear(productList, searchId);
        if (resultLinear != null) {
            System.out.println("\nProduct found using Linear Search:");
            System.out.println(resultLinear);
        } else {
            System.out.println("\nProduct not found using Linear Search.");
        }

        Product resultBinary = searchUsingBinary(productList, searchId);
        if (resultBinary != null) {
            System.out.println("Product found using Binary Search:");
            System.out.println(resultBinary);
        } else {
            System.out.println("Product not found using Binary Search.");
        }

        scanner.close();
    }
}
