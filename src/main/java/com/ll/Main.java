package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run() {
        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in); //스캐너 생성

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            System.out.println("입력된 명령어 : %s".formatted(cmd));

            if (cmd.equals("종료")) {
                break;
            }
        }

        scanner.close(); //스캐너 종료
    }
}