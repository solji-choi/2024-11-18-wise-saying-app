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

        int lastId = 0;
        WiseSaying lastWiseSaying = null;

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            System.out.println("입력된 명령어 : %s".formatted(cmd));

            if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                int id = ++lastId;

                WiseSaying wiseSaying = new WiseSaying(id, content, author);

                lastWiseSaying = wiseSaying;

                System.out.println("%d번 명언이 등록되었습니다.".formatted(id));
            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                System.out.println("%d / %s / %s".formatted(lastWiseSaying.id, lastWiseSaying.author, lastWiseSaying.content));

            }
        }

        scanner.close(); //스캐너 종료
    }
}

class WiseSaying {
    int id;
    String content;
    String author;

    WiseSaying(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}