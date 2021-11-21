
package Bonifikata;

public class VisitorXML implements Visitor{
    public void VisitElement(Klient klient){
        System.out.println("Zapisano w formacie xml");
    }
}
