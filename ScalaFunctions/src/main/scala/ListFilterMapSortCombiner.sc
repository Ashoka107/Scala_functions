object ListFilterMapSortCombiner {
 val fred = Person("Fred", "Flintstone", "J")     //> fred  : Person = Person(Fred,Flintstone,J)
 val wilma = Person("Wilma", "Flintstone", "A")   //> wilma  : Person = Person(Wilma,Flintstone,A)
 val barney = Person("Barney", "Rubble", "J")     //> barney  : Person = Person(Barney,Rubble,J)
 val betty = Person("Betty", "Rubble", "A")       //> betty  : Person = Person(Betty,Rubble,A)
 val peeps = Seq(fred, wilma, barney, betty)      //> peeps  : Seq[Person] = List(Person(Fred,Flintstone,J), Person(Wilma,Flintsto
                                                  //| ne,A), Person(Barney,Rubble,J), Person(Betty,Rubble,A))
 val firstNamesOfFlint=peeps.filter(_.last=="Flintstone").map(_.first)
                                                  //> firstNamesOfFlint  : Seq[String] = List(Fred, Wilma)
 val foreachfirst=peeps.filter(_.first.length<5).map(_.first)
                                                  //> foreachfirst  : Seq[String] = List(Fred)
 val foreachfirst2=peeps.filter(_.first.startsWith("B")).map(p=>(p.first,p.mi))
                                                  //> foreachfirst2  : Seq[(String, String)] = List((Barney,J), (Betty,A))
 val om=peeps.map(o=>(o.first,o.last)) 
}

case class Person(first: String, last: String, mi: String)