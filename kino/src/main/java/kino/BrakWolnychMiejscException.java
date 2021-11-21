
package kino;

class BrakWolnychMiejscException extends Exception
{
 BrakWolnychMiejscException(Film f, String info)
 {
 // Wywo³anie konstruktora nadklasy: Exception(String)
 super("\n"+info+f.getKodFilmu()+"\n");
 }
 BrakWolnychMiejscException(Film f)
 {
 // Wywo³anie pierwszego konstruktora tej klasy
 this(f,"Brak wolnych miejsc na film :");
 }
}

