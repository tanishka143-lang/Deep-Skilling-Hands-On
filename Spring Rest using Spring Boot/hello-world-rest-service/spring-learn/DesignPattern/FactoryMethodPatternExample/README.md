# Factory Method Pattern Example

## Objective

To implement the Factory Method Design Pattern in Java.

## Scenario

A document management system needs to create different types of documents such as Word, PDF, and Excel.  
Instead of creating objects directly using `new`, we use factory classes to create the required document objects.

## Files Created

| File                   | Purpose                              |
| ---------------------- | ------------------------------------ |
| `Document.java`        | Common interface for all documents   |
| `WordDocument.java`    | Concrete Word document class         |
| `PdfDocument.java`     | Concrete PDF document class          |
| `ExcelDocument.java`   | Concrete Excel document class        |
| `DocumentFactory.java` | Abstract factory class               |
| `WordFactory.java`     | Factory for creating Word documents  |
| `PdfFactory.java`      | Factory for creating PDF documents   |
| `ExcelFactory.java`    | Factory for creating Excel documents |
| `FactoryTest.java`     | Test class to run the program        |

## How It Works

1. `Document` is an interface with an `open()` method.
2. `WordDocument`, `PdfDocument`, and `ExcelDocument` implement the `Document` interface.
3. `DocumentFactory` is an abstract class with the method `createDocument()`.
4. `WordFactory`, `PdfFactory`, and `ExcelFactory` extend `DocumentFactory`.
5. Each factory creates its own document type.
6. In `FactoryTest`, we create factory objects and call `createDocument()`.

## Example

```java
DocumentFactory factory = new WordFactory();
Document document = factory.createDocument();
document.open();
```
