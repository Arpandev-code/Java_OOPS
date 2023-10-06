
# Core Java along with OOPs concept

These are Core Java codes. So what i did basically added all the questions comes from the code like How? Why ? Why not etc! 

# Interview Questions

# . Why java so popular?** 

Two main reasons for popularity of java are 
    1. Platform independence 
    2. Object oriented language

# . What is Platform independence?

Platform independence also called build once, run anywhere. Java is one of the platform independence language. Once we compile a java progeam and build jar(Compiled java program) in any OS. where JVM is insalled. Please note that JVM note platform independent for differnt machine there is differnt JVM avilable.

Java achives platform independence in a beautiful way. On Compiling a java file the output is a class file which contains internal java representation called **bytecode**. JVM converts bytecode to exicutable instructions. JVM understand the bytecode and convert it into the exicutable code for the respective OS.

# Compare JDK vs JRE vs JVM**

1. JVM(Java Virtual Machine) which run the java code & makes the java portable respective machine code.

2. JRE(Java Runtime Environment): JVM+Libraries+ Other Components(to run applets & other java application)

3. JDK(Java Develoment Kit) : JRE+Compiler+ debugger

**4. What are the important differnt between C++ & Java?**

1. Java is platform independent but C++ isn't

2. Java & C++ are both Not pure object oriented language. However java is more purer Object Oriented language(except premitive data type). In C++, one can write structure programs without using objects.

3. C++ has pointers(access to internal memory). java has no concept of pointers

4. In C++, programmers has to handle memory management. A programmer has to write code to remove object from memory. In java, JVM takes care of memeory management by removing objects from memory using a process called garbage collection.

5. C++ supports Multiple Inheritance. Java does not support multiple inherinace altho we can achive multiple inherinace using Interrface concept.

# What is the role for a ClassLoader in Java?

A Java program is made up of a number of custom classes (written by programmers like us) and core
classes (which come pre-packaged with Java). When a program is executed, JVM needs to load the
content of all the needed class. JVM uses a ClassLoader to find the classes.
Three Class Loaders are shown in the picture

• System Class Loader - Loads all classes from CLASSPATH

• Extension Class Loader - Loads all classes from extension directory

• Bootstrap Class Loader - Loads all the Java core files

When JVM needs to find a class, it starts with System Class Loader. If it is not found, it checks with
Extension Class Loader. If it not found, it goes to the Bootstrap Class Loader. If a class is still not found, a
ClassNotFoundException is thrown.

# What are wrapper classes?
A primitive wrapper class in the Java programming language is one of eight classes provided in the
java.lang package to provide object methods for the eight primitive types. All of the primitive wrapper
classes in Java are immutable.

Wrapper:Boolean,Byte,Character,Double,Float,Integer,Long,Short

Primitive: boolean,byte,char ,double, float, int , long,short

# Why do we need Wrapper Classes in Java?
A wrapper class wraps (encloses) around a data type and gives it an object appearance.
Reasons why we need Wrapper Classes

• null is a possible value

• use it in a Collection

• Methods that support Object like creation from other types.. like String

◦ Integer number2 = new Integer("55");//String

# What are the different ways of creating Wrapper Class Instances?

Two ways of creating Wrapper Class Instances are described below.

Using a Wrapper Class Constructor
Integer number = new Integer(55);//int
Integer number2 = new Integer("55");//String
Float number3 = new Float(55.0);//double argument
Float number4 = new Float(55.0f);//float argument
Float number5 = new Float("55.0f");//String


**Coming Soon......**


## Contact Me 

If you found any error or problem Contact Me @ 
help@iamarpandev.tech
