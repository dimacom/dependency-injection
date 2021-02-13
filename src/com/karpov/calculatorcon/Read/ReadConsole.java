package com.karpov.calculatorcon.Read;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadConsole implements Reader {
    @Override
    public  String getLine() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            return reader.readLine();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;      // ?????
    }
}
