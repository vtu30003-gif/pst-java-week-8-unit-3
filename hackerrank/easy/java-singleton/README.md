# Java Singleton Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

> "The singleton pattern is a design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system."	
> - [Wikipedia: Singleton Pattern](https://en.wikipedia.org/wiki/Singleton_pattern)
***

Complete the *Singleton* class in your editor which contains the following components:  


1. A *private Singleton* non parameterized constructor.
2. A *public* String instance variable named $str$. 
3. Write a *static* method named *getSingleInstance* that returns the single instance of the *Singleton* class.

Once submitted, our hidden *Solution* class will check your code by taking a String as input and then using your *Singleton* class to print a line.

**Input Format**

You will not be handling any input in this challenge. 

**Constraints**

 

**Output Format**

You will not be producing any output in this challenge.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T12:48:19.824Z  

```java

import java.util.Scanner;

class Singleton {
    public String str;

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Singleton s = Singleton.getSingleInstance();
        s.str = sc.nextLine();

        System.out.println("Hello I am a singleton! Let me say "
                + s.str + " to you");

        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-singleton/problem)