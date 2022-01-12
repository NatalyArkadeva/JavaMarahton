package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {

                pieces[i][j] = (i == 0 && (j == 0 || j == 5)) ? ChessPiece.ROOK_BLACK :
                        (i == 0 && j == 6) ? ChessPiece.KING_BLACK :
                                ((i == 1 && j == 1) || (i == 7 && j == 5)) ? ChessPiece.ROOK_WHITE :
                                        ((i == 1 & (j == 4 || j == 5 || j == 7)) || (i == 2 && (j == 0 || j == 6))) ? ChessPiece.PAWN_BLACK :
                                                (i == 2 && j == 2) ? ChessPiece.KNIGHT_BLACK :
                                                        (i == 3 && j == 0) ? ChessPiece.QUEEN_BLACK :
                                                                ((i == 3 && j == 3) || (i == 5 && j == 4)) ? ChessPiece.BISHOP_WHITE :
                                                                        (i == 4 && j == 3) ? ChessPiece.BISHOP_BLACK :
                                                                                ((i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && (j == 0 || j == 5 || j == 7))) ? ChessPiece.PAWN_WHITE :
                                                                                        (i == 6 && j == 3) ? ChessPiece.QUEEN_WHITE :
                                                                                                (i == 7 && j == 6) ? ChessPiece.KING_WHITE : ChessPiece.EMPTY;

            }
        }

        ChessBoard board = new ChessBoard(pieces);
        board.print(pieces);
    }
}
