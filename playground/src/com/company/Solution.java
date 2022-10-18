package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    String str;

    private Singleton() {

    }

    public String getStr() {
        return str;
    }

    public static Singleton getSingleInstance(){
        return new Singleton();
    }
}