public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Mobile", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(103, "Book", "Education")
        };

        Product[] sortedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Book", "Education"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Shoes", "Fashion")
        };

        int searchId = 103;

        System.out.println("Linear Search Result:");
        Product linearResult = SearchService.linearSearch(products, searchId);

        if (linearResult != null) {
            linearResult.displayProduct();
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nBinary Search Result:");
        Product binaryResult = SearchService.binarySearch(sortedProducts, searchId);

        if (binaryResult != null) {
            binaryResult.displayProduct();
        } else {
            System.out.println("Product not found");
        }
    }
}