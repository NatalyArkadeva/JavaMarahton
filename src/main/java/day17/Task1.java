package day17;


public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPiece = new ChessPiece[8];
        for (int i = 0; i < chessPiece.length; i++) {
            chessPiece[i] = (i < 4) ? ChessPiece.PAWN_WHITE : ChessPiece.ROOK_BLACK;
            System.out.print(chessPiece[i].getDesignation() + " ");
        }

    }
}