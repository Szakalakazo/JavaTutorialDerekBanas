package p8_logic_in_programming;

import p7_java_class_objects.Monster;

public class JavaLessonEight {
    public static void main(String[] args) {
        MonsterTwo.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        MonsterTwo[] Monster = new MonsterTwo[4];

        Monster[0] = new MonsterTwo(1000,20,1, "Frank");
        Monster[1] = new MonsterTwo(500,40,2, "Drack");
        Monster[2] = new MonsterTwo(1000,20,1, "Paul");
        Monster[3] = new MonsterTwo(1000,20,1, "Georg");

        MonsterTwo.redrawBoard();

    }
}
