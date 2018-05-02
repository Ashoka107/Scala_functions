#!/bin/bash
. ~/hdfs.env

spark-shell < $scripts/test.scala > $scripts/test.log 2>&1

Easy way to run scala file on unix shell --- spark-shell -i file.scala


#!/bin/sh
exec scala "$0" "$@"
!#
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world! " + args.toList)
  }
}
HelloWorld.main(args)



val lines = scala.io.Source.fromFile("file.txt").mkString
By the way, "scala." isn't really necessary, as it's always in scope anyway, and you can, of course, import io's contents, fully or partially, and avoid having to prepend "io." too.

The above leaves the file open, however. To avoid problems, you should close it like this:

val source = scala.io.Source.fromFile("file.txt")
val lines = try source.mkString finally source.close()


