package tech.chris.leetcode.shortestPathInGridWithWallDestroy;

import java.util.*;

// TODO: can be optimized
public class MySolution implements ShortestPathInGridWithWallDestroy {
    private static final List<Position> MOVE_SET = new ArrayList<Position>() {{
        add(new Position(0, 1));
        add(new Position(1, 0));
        add(new Position(-1, 0));
        add(new Position(0, -1));
    }};
    private final Set<Position> visited = new HashSet<>();
    private List<MovingPosition> currentLevelNodes = new LinkedList<>();
    private int level = 0;
    private int[][] grid;

    @Override
    public int shortestPath (int[][] grid, int k) {
        this.grid = grid;

        Position goal = new Position(grid[0].length - 1, grid.length - 1);
        MovingPosition startPos = new MovingPosition(0, 0, k);
        if (goal.equals(startPos)) {
            return 0;
        }
        visited.add(startPos);
        currentLevelNodes.add(startPos);
        while (currentLevelNodes.size() != 0) {
            List<MovingPosition> nextLevelQueue = new LinkedList<>();
            level++;
            for (MovingPosition p : currentLevelNodes) {
                for (Position m : MOVE_SET) {
                    MovingPosition next = move(p, m);
                    if (next == null) {
                        continue;
                    } else if (goal.equals(next)) {
                        return level;
                    }
                    visited.add(next);
                    nextLevelQueue.add(next);
                }
            }
            currentLevelNodes = nextLevelQueue;
        }
        return -1;
    }

    private MovingPosition move (MovingPosition p, Position vector) {
        int x = p.x + vector.x;
        int y = p.y + vector.y;
        if (x < 0 || x >= grid[0].length || y < 0 || y >= grid.length || p.hammer - grid[y][x] < 0) {
            return null;
        }
        MovingPosition next = new MovingPosition(x, y, p.hammer - grid[y][x]);
        return visited.contains(next) ? null : next;
    }

    private static class MovingPosition extends Position {
        int hammer;

        MovingPosition (int x, int y, int hammer) {
            super(x, y);
            this.hammer = hammer;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) {return true;}
            if (o == null || getClass() != o.getClass()) {return false;}
            if (!super.equals(o)) {return false;}

            MovingPosition that = (MovingPosition) o;

            return hammer == that.hammer;
        }

        @Override
        public int hashCode () {
            int result = super.hashCode();
            result = 31 * result + hammer;
            return result;
        }
    }

    private static class Position {
        int x;
        int y;

        Position (int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Position)) {
                return false;
            }

            Position position = (Position) o;

            if (x != position.x) {return false;}
            return y == position.y;
        }

        @Override
        public int hashCode () {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public String toString () {
            return "(" + x + "," + y + ")";
        }
    }
}
