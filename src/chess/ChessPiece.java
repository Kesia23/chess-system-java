package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {//verificar se existe pe�a advers�ria
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null & p.getColor() != color;	//se a posicao � diferente de nulo e se a pe�a que se encontra � de cor diferente	
	}

}
