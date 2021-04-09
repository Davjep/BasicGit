package com.company;

import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Welcome welcome = new Welcome();
        welcome.setAwesomeness(10);
        welcome.setHej("Hej David");

        System.out.println(welcome.getHej() + ", your awesomeness is " + welcome.getAwesomeness());


    }
}
