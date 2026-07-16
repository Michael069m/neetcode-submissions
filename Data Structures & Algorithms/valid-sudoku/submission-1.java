class Solution {
    public boolean isValidSudoku(char[][] board) {
        // We use 9 rows/cols/boxes, and 10 possible values (index 1-9)
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue; // Skip empty cells
                }

                int num = board[r][c] - '0'; // Convert char to int
                int boxIndex = (r / 3) * 3 + (c / 3);

                // Check if the number has already been seen in row, col, or box
                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Mark the number as "seen"
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}