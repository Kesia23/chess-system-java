package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {// Torre

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getColumn());// acessando a posi��o da pe�a
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {// enquanto a posi��o p existir e n�o
																				// houver uma pe�a l�
			mat[p.getRow()][p.getColumn()] = true;// indica que a pe�a pode se mover pra c�
			p.setRow(p.getRow() - 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// posi��o existe e tem pe�a do oponente
			mat[p.getRow()][p.getColumn()] = true;
		}

		// left
		p.setValues(position.getRow(), position.getColumn() - 1);// acessando a posi��o da pe�a
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;// indica que a pe�a pode se mover pra c�
			p.setColumn(p.getColumn() - 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// posi��o existe e tem pe�a do oponente
			mat[p.getRow()][p.getColumn()] = true;
		}

		// right
		p.setValues(position.getRow(), position.getColumn() + 1);// acessando a posi��o da pe�a
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;// indica que a pe�a pode se mover pra c�
			p.setColumn(p.getColumn() + 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// posi��o existe e tem pe�a do oponente
			mat[p.getRow()][p.getColumn()] = true;
		}

		// below
		p.setValues(position.getRow() + 1, position.getColumn());// acessando a posi��o da pe�a
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
			mat[p.getRow()][p.getColumn()] = true;// indica que a pe�a pode se mover pra c�
			p.setRow(p.getRow() + 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {// posi��o existe e tem pe�a do oponente
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}
}
