package com.management;

import com.management.product.view.BookMenu;
import com.management.product.view.EmployeeMenu;
import com.management.product.view.UserMenu;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        do {
            System.out.println("╔═══ -ˋˏ *.·:·.⟐.·:·.* ˎˊ- ═══╗");
            System.out.println("   🌷🍉🍁🧦 계절책방 🧦🍁🍉🌷");
            System.out.println("╚═══ -ˋˏ *.·:·.⟐.·:·.* ˎˊ- ═══╝");
            System.out.println("반갑습니다! 무엇을 도와드릴까요?");
            System.out.println("=======================================");
            System.out.println("1. 찾는 책이 있어요");
            System.out.println("2. 회원 관련 문의를 하고 싶어요");
            System.out.println("3. 책 기증하러 왔어요");
            System.out.println("9. 계절책방 나가기");
            System.out.println("====================================");
            System.out.println("번호를 입력해 주세요 : ");

            Scanner sc = new Scanner(System.in);
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : new BookMenu().displayBook(); break;
                case 2 : new UserMenu().registUser(); break;
                case 3 : new EmployeeMenu().registBook(); break;
                case 9 : System.out.println("안녕히가세요!"); return;
                default : System.out.println("잘못된 번호입니다. 다시 입력해 주세요."); break;
            }

        } while(true);

    }


}
