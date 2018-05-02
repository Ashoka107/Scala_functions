object ListFilterMapSortCombiner {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
 val fred = Person("Fred", "Flintstone", "J");System.out.println("""fred  : Person = """ + $show(fred ));$skip(48); 
 val wilma = Person("Wilma", "Flintstone", "A");System.out.println("""wilma  : Person = """ + $show(wilma ));$skip(46); 
 val barney = Person("Barney", "Rubble", "J");System.out.println("""barney  : Person = """ + $show(barney ));$skip(44); 
 val betty = Person("Betty", "Rubble", "A");System.out.println("""betty  : Person = """ + $show(betty ));$skip(45); 
 val peeps = Seq(fred, wilma, barney, betty);System.out.println("""peeps  : Seq[Person] = """ + $show(peeps ));$skip(71); 
 val firstNamesOfFlint=peeps.filter(_.last=="Flintstone").map(_.first);System.out.println("""firstNamesOfFlint  : Seq[String] = """ + $show(firstNamesOfFlint ));$skip(62); 
 val foreachfirst=peeps.filter(_.first.length<5).map(_.first);System.out.println("""foreachfirst  : Seq[String] = """ + $show(foreachfirst ));$skip(80); 
 val foreachfirst2=peeps.filter(_.first.startsWith("B")).map(p=>(p.first,p.mi));System.out.println("""foreachfirst2  : Seq[(String, String)] = """ + $show(foreachfirst2 ));$skip(39); 
 val om=peeps.map(o=>(o.first,o.last));System.out.println("""om  : Seq[(String, String)] = """ + $show(om ))}
}

case class Person(first: String, last: String, mi: String)
