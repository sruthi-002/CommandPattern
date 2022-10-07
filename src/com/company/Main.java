package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Document d = new Document();
        DocOpen clickopen = new DocOpen(d);
        DocSave clicksave = new DocSave(d);
        Menuoptions m = new Menuoptions(clickopen , clicksave);
        System.out.println("1. Open" +"\n"+"2. Save");
        Scanner in = new Scanner(System.in);
        int name = in.nextInt();
        switch(name)
        {
            case 1 :
                m.clickopen();
                break;
            case 2:
                m.clicksave();
                break;
                default:
                    System.out.println("Enter the valid option");
        }

    }
}
