package com.company;

public class Cell {
    ArrayList<Cell> near;
    Status status;

    public Cell() {
        status = Status.NONE;
        near = new ArrayList<>();
    }

    void addNear(Cell cell) {
        near.add(cell);
    }

    void step1 ()
    {
        int around = countNearCells();
        status = status.step1(around);
    }

    void tep2()
    {
        status = step2();
    }

    int countNearCells() {
        int count = 0;
        for (Cell cell : near)
            if (cell.status.isCell())
                count ++;
        return count;
    }
}