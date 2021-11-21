
package kino;

class BrakWolnychMiejscException extends Exception
{
 BrakWolnychMiejscException(Film f, String info)
 {
 // Wywo�anie konstruktora nadklasy: Exception(String)
 super("\n"+info+f.getKodFilmu()+"\n");
 }
 BrakWolnychMiejscException(Film f)
 {
 // Wywo�anie pierwszego konstruktora tej klasy
 this(f,"Brak wolnych miejsc na film :");
 }
}

