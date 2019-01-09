package p8_logic_in_programming;

import p7_java_class_objects.Monster;

import java.util.Arrays;

public class MonsterTwo {


    static char[][] battleBoard = new char[10][10];

    public static void buildBattleBoard() {
        for (char[] row : battleBoard) {
            Arrays.fill(row, '*');
        }
    }

    public static void redrawBoard() {
        int k = 1;
        while (k <= 30) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        for (int i = 0; i < battleBoard.length; i++) {
            for (int j = 0; j < battleBoard[i].length; j++) {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println();
        }
        k = 1;
        while (k <= 30) {
            System.out.print('-');
            k++;
        }
    }


    public final String TOMBSTONE = "Here Lies a Dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;

    private boolean alive = true;

    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public int xPosition = 0;
    public int yPosition = 0;
    public static int numOfMonsters = 0;

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health <= 0) alive = false;
    }

    public MonsterTwo() {
        numOfMonsters++;
    }

    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        if (health <= 0) alive = false;
    }

    public void moveMonster(MonsterTwo[] monster, int arrayItemIndex) {
        boolean isSpaceOpen = true;
        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoarsSpace = battleBoard[0].length - 1;

        while (isSpaceOpen) {

            int randMoveDirection = (int) (Math.random() * 4);
            int randMoveDistance = (int) (Math.random() * this.getMovement() + 1);

            System.out.println("\n"+randMoveDistance + " " + randMoveDirection);

            battleBoard[this.yPosition][this.xPosition] = '*';

            if (randMoveDirection == 0) {
                if ((this.yPosition - randMoveDistance) < 0)
                {
                    this.yPosition = 0;
                } else {
                    this.yPosition = this.yPosition - randMoveDistance;
                }
            } else if (randMoveDirection == 1)
            {
                if ((this.xPosition + randMoveDistance) > maxXBoardSpace) {
                    this.xPosition = maxXBoardSpace;
                } else {
                    this.xPosition = this.xPosition + randMoveDistance;
                }
            } else if (randMoveDirection == 2) {
                if ((this.yPosition + randMoveDistance) > maxYBoarsSpace) {
                    this.yPosition = maxYBoarsSpace;
                } else {
                    this.xPosition = this.yPosition + randMoveDistance;
                }
            } else if (randMoveDirection == 3) {
                if ((this.xPosition - randMoveDistance) < 0) {
                    this.xPosition = 0;
                } else {
                    this.xPosition = this.xPosition - randMoveDistance;
                }
            }

            for (int i = 0; i < monster.length; i++) {
                //Monster Frank x  = 1 y = 3
                if (i == arrayItemIndex) {
                    continue;
                }
                if (onMySpace(monster, i, arrayItemIndex)) {
                    isSpaceOpen = true;
                    break;
                } else {
                    isSpaceOpen = false;
                }

            }
        }//END OF WHILE LOOP


        // Set the value in the array to the first letter of the monster
        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
    } // END OF MOVE moveMonster


    public boolean onMySpace(MonsterTwo[] monster, int indexToChk1, int indexToChk2) {
        if ((monster[indexToChk1].xPosition) == (monster[indexToChk2].xPosition) && (monster[indexToChk1].yPosition) == (monster[indexToChk2].yPosition)) {
            return true;
        } else {
            return false;
        }
    } // END OF onMySpace


    public MonsterTwo(int health, int attack, int movement, String name) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;


        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int ranNumX, ranNumY;

        do {
            ranNumX = (int) (Math.random() * maxXBoardSpace);
            ranNumY = (int) (Math.random() * maxYBoardSpace);
        } while (battleBoard[ranNumX][ranNumY] != '*');

        this.xPosition = ranNumX;
        this.yPosition = ranNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

        numOfMonsters++;

    }
}
