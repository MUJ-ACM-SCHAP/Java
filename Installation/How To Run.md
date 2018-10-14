# Running a program
* `cd` into the directory that contains the file.
* `javac HelloWorld.java` to compile.
* `java HelloWorld` to run.

# What did you do ?
* By executing `javac`, you converted the Java code you wrote into machine readable code. A `*.class` file must have generated with the name as the `class name` you wrote in the code (not the file name).. in this case, it should be `HelloWorld.class`. This file contains code called `Byte Code` which is machine independent. Now, any machine that has Java installed can use this .class file to run the program.

* By executing `java`, you run the `.class` file that prints messages / completes tasks as you defined in your program.