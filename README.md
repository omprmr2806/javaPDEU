# Java_OOP

Java OOP practical programs from Lab 0 to Lab 4.

## Folder structure

- Lab_0: Control structures and basic Java programs
- Lab_1: Arrays, class/object, `this`, method overloading, matrix multiplication
- Lab_2: Constructors, static/instance properties, inbuilt Java classes
- Lab_3: Inheritance, `super`, overriding, abstract/final classes
- Lab_4:
  - Lab4_1_Payment: Interfaces
  - Lab4_2_BankManagement: Packages + access modifiers
  - Lab4_3_ProtectedSubclass: Protected access through inheritance

## How to compile a normal file

Open a terminal inside the folder containing the file:

```bash
javac FileName.java
java ClassName
```

Example:

```bash
cd Lab_0
javac Lab0_2_FirstNPrimes.java
java Lab0_2_FirstNPrimes
```

## Lab 4 package programs

For Lab4_2:

```bash
cd Lab4_2_BankManagement
javac bank/operations/BankOperations.java bank/accounts/SavingsAccount.java bank/application/BankApplication.java
java bank.application.BankApplication
```

For Lab4_3:

```bash
cd Lab4_3_ProtectedSubclass
javac bank/operations/BankOperations.java bank/accounts/SavingsAccount.java bank/accounts/SpecialSavingsAccount.java bank/application/BankApplication.java
java bank.application.BankApplication
```

## Note

The source practical explicitly asks to demonstrate compiler errors for changing a final variable,
overriding a final method, and extending a final class. Those invalid lines are kept as comments
inside the relevant Lab 3 program so the main practical code remains compilable.
