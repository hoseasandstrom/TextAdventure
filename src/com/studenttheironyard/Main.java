package com.studenttheironyard;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
	    System.out.println("Welcome traveller");

        Player player = new Player();

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();


    }
}
