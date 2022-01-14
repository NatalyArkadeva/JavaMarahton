package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] pieces = new ChessPiece[8][8];
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                pieces[i][j] = ChessPiece.EMPTY;
            }
        }
        pieces[0][0] = pieces[0][5] = ChessPiece.ROOK_BLACK;
        pieces[0][6] = ChessPiece.KING_BLACK;
        pieces[1][1] = pieces[7][5] = ChessPiece.ROOK_WHITE;
        pieces[1][4] = pieces[1][5] = pieces[1][7] = pieces[2][0] = pieces[2][6] = ChessPiece.PAWN_BLACK;
        pieces[2][2] = ChessPiece.KNIGHT_BLACK;
        pieces[3][0] = ChessPiece.QUEEN_BLACK;
        pieces[3][3] = pieces[5][4] = ChessPiece.BISHOP_WHITE;
        pieces[4][3] = ChessPiece.BISHOP_BLACK;
        pieces[4][4] = pieces[5][5] = pieces[6][0] = pieces[6][5] = pieces[6][7] = ChessPiece.PAWN_WHITE;
        pieces[6][3] = ChessPiece.QUEEN_WHITE;
        pieces[7][6] = ChessPiece.KING_WHITE;

        ChessBoard board = new ChessBoard(pieces);
        board.print(pieces);
    }
}
