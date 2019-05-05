package br.pro.hashi.ensino.desagil.desafio.model;

public class HumanPlayer extends Player {
    public HumanPlayer(int row, int col, Board board) {
        super(row, col, board);
    }

    public void moveUp() {
        int rowNow = this.getRow();
        int nowCol = this.getCol();
        if(!board.isWall(rowNow-1, nowCol)){
            this.move(-1,0);
        }
    }

    public void moveRight() {
        int rowNow = this.getRow();
        int nowCol = this.getCol();
        if(!board.isWall(rowNow, nowCol+1)){
            this.move(0,1);
        }
    }

    public void moveDown() {
        int rowNow = this.getRow();
        int nowCol = this.getCol();
        if(!board.isWall(rowNow+1, nowCol)){
            this.move(1,0);
        }
    }

    public void moveLeft() {
        int rowNow = this.getRow();
        int nowCol = this.getCol();
        if(!board.isWall(rowNow, nowCol-1)){
            this.move(0,-1);
        }
    }
}
