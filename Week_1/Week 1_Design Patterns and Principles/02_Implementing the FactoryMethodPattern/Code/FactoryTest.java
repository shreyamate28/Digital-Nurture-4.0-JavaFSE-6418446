public class FactoryTest {
    public static void main(String[] args) {

        // Word
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();
        word.save();
        word.close();

        System.out.println();

        // PDF
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();
        pdf.save();
        pdf.close();

        System.out.println();

        // Excel
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
        excel.save();
        excel.close();
    }
}
