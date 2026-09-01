class Solution {
    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int sr = 0, sc = 0;
        int trashCount = 0;

        int[][] id = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                id[i][j] = -1;

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                }

                if (ch == 'L') {
                    id[i][j] = trashCount++;
                }
            }
        }

        if (trashCount == 0) {
            return 0;
        }

        int fullMask = (1 << trashCount) - 1;

        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << trashCount];

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{sr, sc, energy, 0});
        visited[sr][sc][energy][0] = true;

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {

                int[] curr = queue.poll();

                int r = curr[0];
                int c = curr[1];
                int e = curr[2];
                int mask = curr[3];

                if (mask == fullMask) {
                    return moves;
                }

                for (int[] dir : directions) {

                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr < 0 || nr >= m ||
                        nc < 0 || nc >= n) {
                        continue;
                    }

                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    if (e == 0) {
                        continue;
                    }

                    int newEnergy = e - 1;
                    int newMask = mask;

                    // Collect litter
                    if (classroom[nr].charAt(nc) == 'L') {
                        newMask |= (1 << id[nr][nc]);
                    }

                    // Recharge
                    if (classroom[nr].charAt(nc) == 'R') {
                        newEnergy = energy;
                    }

                    if (!visited[nr][nc][newEnergy][newMask]) {

                        visited[nr][nc][newEnergy][newMask] = true;

                        queue.offer(
                            new int[]{
                                nr,
                                nc,
                                newEnergy,
                                newMask
                            }
                        );
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}