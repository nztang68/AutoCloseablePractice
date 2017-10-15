package com.eaststartgroup.www;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {

    public static void main(String[] args) {
	// write your code here
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }
}
