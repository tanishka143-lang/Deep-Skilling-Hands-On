public class ExcelFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
         System.out.println("Creating Excel Document");
        return new ExcelDocument();
    }
}