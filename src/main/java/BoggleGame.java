public class BoggleGame {
    final static int[] DX = {-1, -1, -1, 1, 1, 1, 0, 0};
    final static int[] DY = {-1, 0, 1, -1, 0, 1, -1, 1};

    public static void main(String[] args) {
        BoggleGame boggleGame = new BoggleGame();
        System.out.println(boggleGame.hasWord(1, 1, "PRETWW"));
    }

    private String[][] board = new String[][] {
            {"U", "R", "L", "P", "M"},
            {"X", "P", "R", "E", "T"},
            {"G", "I", "A", "E", "T"},
            {"X", "T", "N", "Z", "Y"},
            {"X", "O", "Q", "R", "S"},
    };

    //5X5 보글 판의 해당 위치에서 주어진 단어가 시작하는지를 반환
    boolean hasWord(int y, int x, String word) {
        //기저 사례1: 시작 위치가 범위 밖이면 무조건 실패
        if (!inRange(y, x)) return false;
        //기저 사례2: 첫 글자가 일치하지 않으면 실패
        if (!board[y][x].equals(String.valueOf(word.charAt(0)))) return false;
        //기저 사례3: 단어의 길이가 1이면 성공
        if (word.length() == 1) return true;

        System.out.println("board[y][x] : " + board[y][x]);
        System.out.println("word : " + word);
        System.out.println("-----------------------");

        //인접한 여덟 칸 검사.
        for (int direction = 0; direction < 8; direction++) {
            int nextY = y + DY[direction];
            int nextX = x + DX[direction];

            //다음 칸이 범위 안에 있는지, 첫 글자는 일치하는지 확인할 필요가 없다.
            if (hasWord(nextY, nextX, word.substring(1)))
                return true;
        }
        return false;
    }

    private boolean inRange(int y, int x) {
        return !((y >= 5 || 0 > y) || (x >= 5 || 0 > x));
    }
}
