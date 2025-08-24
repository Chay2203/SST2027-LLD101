public class demo07{
    public static void main(String[] args){
        printable basic=new basicprinter();
        basic.print("Hello");
        allinoneprinter allinone=new allinoneprinter();
        allinone.print("Document");
        allinone.scan("/tmp/out");
        allinone.fax("999-999-9999");
        printscanner scanner=new printscanner();
        scanner.print("Report");
        scanner.scan("/documents/");
    }
}
