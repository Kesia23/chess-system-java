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
	
	protected boolean isThereOpponentPiece(Position position) {//verificar se existe peça adversária
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null & p.getColor() != color;	//se a posicao é diferente de nulo e se a peça que se encontra é de cor diferente	
	}

}
