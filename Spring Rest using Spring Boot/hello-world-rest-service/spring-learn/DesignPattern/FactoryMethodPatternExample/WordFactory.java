public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        System.out.println("Creating Word Document");
        return new WordDocument();
    }
}