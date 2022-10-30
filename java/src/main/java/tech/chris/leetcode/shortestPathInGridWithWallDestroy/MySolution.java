package tech.chris.leetcode.shortestPathInGridWithWallDestroy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySolution implements ShortestPathInGridWithWallDestroy {
    private static final List<Position> MOVE_SET = new ArrayList<Position>() {{
        add(new Position(0, 1));
        add(new Position(1, 0));
        add(new Position(-1, 0));
        add(new Position(0, -1));
    }};
    private final Set<Position> visited = new HashSet<>();
    private int[][] grid;
    private int hammer;
    private Position goal;
    private STATES state = STATES.RUNNING;

    @Override
    public int shortestPath (int[][] grid, int k) {
        this.grid = grid;
        this.hammer = k;

        goal = new Position(grid[0].length - 1, grid.length - 1);
        if (goal.x == 0 && goal.y == 0) {
            return 0;
        }
        shortestPath(new Position(0, 0));
        return visited.size() - 1;
    }

    private void shortestPath (Position newPosition) {
        if (canNotVisit(newPosition)) {
            return;
        }

        visited.add(newPosition);
        hammer -= grid[newPosition.y][newPosition.x];
        if (newPosition.equals(goal)) {
            state = STATES.DONE;
        }

        for (Position move : MOVE_SET) {
            shortestPath(newPosition.move(move));
            if (state != STATES.RUNNING) {
                break;
            }
        }

        if (state != STATES.DONE) {
            visited.remove(newPosition);
            hammer += grid[newPosition.y][newPosition.x];
        }
    }

    private boolean canNotVisit (Position p) {
        return visited.contains(p)
            || p.x < 0
            || p.x >= grid[0].length
            || p.y < 0
            || p.y >= grid.length
            || hammer - grid[p.y][p.x] < 0;
    }

    private enum STATES {
        RUNNING, STOPPED, DONE
    }

    private static final class Position {
        int x = 0;
        int y = 0;

        Position (int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) {return true;}
            if (o == null || getClass() != o.getClass()) {return false;}

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

        private Position move (Position m) {
            return new Position(x + m.x, y + m.y);
        }
    }
}
